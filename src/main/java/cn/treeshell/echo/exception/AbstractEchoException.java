package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import org.springframework.http.HttpStatus;
import org.springframework.lang.NonNull;
import org.springframework.lang.Nullable;

/**
 * Base exception of the project.
 *
 * @author panjing
 */
public abstract class AbstractEchoException extends RuntimeException {

    private Object errorData;

    public AbstractEchoException(String message) {
        super(message);
    }

    public AbstractEchoException(String message, Throwable cause) {
        super(message, cause);
    }

    /**
     * Http status code
     *
     * @return
     */
    public abstract HttpStatus getStatus();

    /**
     * Custom status code
     *
     * @return
     */
    public abstract ApiResponseCode getApiStatus();

    @Nullable
    public Object getErrorData() {
        return errorData;
    }

    /**
     * Sets error errorData.
     * @param errorData error data
     * @return current exception
     */
    @NonNull
    public AbstractEchoException setErrorData(@Nullable Object errorData) {
        this.errorData = errorData;
        return this;
    }

}
