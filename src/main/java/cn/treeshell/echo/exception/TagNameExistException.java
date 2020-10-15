package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import org.springframework.http.HttpStatus;

/**
 * Tag name exist exception.
 *
 * @author panjing
 */
public class TagNameExistException extends AbstractEchoException {

    public TagNameExistException(String message) {
        super(message);
    }

    public TagNameExistException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return null;
    }

    @Override
    public ApiResponseCode getApiStatus() {
        return ApiResponseCode.CODE_TAG_NAME_EXIST;
    }
}
