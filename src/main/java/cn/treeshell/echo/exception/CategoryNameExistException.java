package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import org.springframework.http.HttpStatus;

/**
 * Category name exist exception.
 *
 * @author panjing
 */
public class CategoryNameExistException extends AbstractEchoException {

    public CategoryNameExistException(String message) {
        super(message);
    }

    public CategoryNameExistException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return null;
    }

    @Override
    public ApiResponseCode getApiStatus() {
        return ApiResponseCode.CODE_CATEGORY_NAME_EXIST;
    }
}
