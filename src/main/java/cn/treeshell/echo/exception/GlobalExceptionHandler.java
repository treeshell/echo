package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.util.Assert;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.NoHandlerFoundException;

import javax.validation.ConstraintViolationException;

/**
 * Exception handler of controller.
 *
 * @author panjing
 */
@Slf4j
@RestControllerAdvice(value = {"cn.treeshell.echo.controller"})
public class GlobalExceptionHandler {

    @ExceptionHandler(DataIntegrityViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleDataIntegrityViolationException(DataIntegrityViolationException e) {
        ApiResponse apiResponse = handleBaseException(e);
        if (e.getCause() instanceof ConstraintViolationException) {
            apiResponse = handleBaseException(e.getCause());
        }
        apiResponse.setMessage("字段验证错误，请完善后重试！");
        return apiResponse;
    }

    @ExceptionHandler(MissingServletRequestParameterException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleMissingServletRequestParameterException(MissingServletRequestParameterException e) {
        ApiResponse apiResponse = handleBaseException(e);
        apiResponse.setMessage(String.format("请求字段缺失, 类型为 %s，名称为 %s", e.getParameterType(), e.getParameterName()));
        return apiResponse;
    }

    @ExceptionHandler(ConstraintViolationException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleConstraintViolationException(ConstraintViolationException e) {
        ApiResponse apiResponse = handleBaseException(e);
        apiResponse.setCode(HttpStatus.BAD_REQUEST.value());
        apiResponse.setMessage("字段验证错误，请完善后重试！");
        apiResponse.setData(e.getConstraintViolations());
        return apiResponse;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        ApiResponse apiResponse = handleBaseException(e);
        apiResponse.setCode(HttpStatus.BAD_REQUEST.value());
        apiResponse.setMessage("字段验证错误，请完善后重试！");
        apiResponse.setData(e.getBindingResult().getFieldErrors());
        return apiResponse;
    }

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleHttpRequestMethodNotSupportedException(HttpRequestMethodNotSupportedException e) {
        ApiResponse apiResponse = handleBaseException(e);
        apiResponse.setCode(HttpStatus.BAD_REQUEST.value());
        return apiResponse;
    }

    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    @ResponseStatus(HttpStatus.NOT_ACCEPTABLE)
    public ApiResponse handleHttpMediaTypeNotAcceptableException(HttpMediaTypeNotAcceptableException e) {
        ApiResponse apiResponse = handleBaseException(e);
        apiResponse.setCode(HttpStatus.NOT_ACCEPTABLE.value());
        return apiResponse;
    }

    @ExceptionHandler(HttpMessageNotReadableException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ApiResponse handleHttpMessageNotReadableException(HttpMessageNotReadableException e) {
        ApiResponse apiResponse = handleBaseException(e);
        apiResponse.setCode(HttpStatus.BAD_REQUEST.value());
        apiResponse.setMessage("缺失请求主体");
        return apiResponse;
    }

    @ExceptionHandler(NoHandlerFoundException.class)
    @ResponseStatus(HttpStatus.BAD_GATEWAY)
    public ApiResponse handleNoHandlerFoundException(NoHandlerFoundException e) {
        ApiResponse apiResponse = handleBaseException(e);
        HttpStatus status = HttpStatus.BAD_GATEWAY;
        apiResponse.setCode(status.value());
        apiResponse.setMessage(status.getReasonPhrase());
        return apiResponse;
    }
    /**
     * 自定义异常捕获
     * @param e Exception
     * @return ApiResponse
     */
    @ExceptionHandler(AbstractEchoException.class)
    public ApiResponse handleEchoException(AbstractEchoException e) {
        ApiResponse apiResponse = handleBaseException(e);
        if (e.getStatus() != null) {
            apiResponse.setCode(e.getStatus().value());
        } else {
            apiResponse.setCode(e.getApiStatus().getCode());
        }
        apiResponse.setData(e.getErrorData());

        return apiResponse;
    }

    /**
     * 全局异常捕获
     * @param e Exception
     * @return ApiResponse
     */
    @ExceptionHandler(Exception.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ApiResponse handleGlobalException(Exception e) {
        ApiResponse apiResponse = handleBaseException(e);
        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
        apiResponse.setCode(status.value());
        apiResponse.setMessage(status.getReasonPhrase());

        return apiResponse;
    }

    private ApiResponse handleBaseException(Throwable t) {
        Assert.notNull(t, "Throwable must not be null");

        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage(t.getMessage());
        log.error("Captured an exception: [{}]", t.getMessage());

        return apiResponse;
    }
}
