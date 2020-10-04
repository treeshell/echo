package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

/**
 * Username password exception.
 *
 * @author panjing
 */
public class UsernamePasswordException extends AbstractEchoException {

    public UsernamePasswordException(String message) {
        super(message);
    }

    public UsernamePasswordException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return null;
    }

    @Override
    public ApiResponseCode getApiStatus() {
        return ApiResponseCode.CODE_ACCOUNT_OR_PASSWORD_ERROR;
    }
}
