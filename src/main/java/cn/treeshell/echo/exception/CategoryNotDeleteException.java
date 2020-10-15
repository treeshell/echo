package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import org.springframework.http.HttpStatus;

/**
 * Category not delete exception.
 *
 * @author panjing
 */
public class CategoryNotDeleteException extends AbstractEchoException {

    public CategoryNotDeleteException(String message) {
        super(message);
    }

    public CategoryNotDeleteException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return null;
    }

    @Override
    public ApiResponseCode getApiStatus() {
        return ApiResponseCode.CODE_CATEGORY_NOT_DELETE;
    }
}
