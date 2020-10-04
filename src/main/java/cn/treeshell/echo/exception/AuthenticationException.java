package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import org.springframework.http.HttpStatus;

/**
 * Authentication exception.
 *
 * @author panjing
 */
public class AuthenticationException extends AbstractEchoException {

    public AuthenticationException(String message) {
        super(message);
    }

    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.UNAUTHORIZED;
    }

    @Override
    public ApiResponseCode getApiStatus() {
        return null;
    }
}
