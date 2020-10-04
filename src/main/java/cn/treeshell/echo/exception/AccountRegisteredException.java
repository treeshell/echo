package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import org.springframework.http.HttpStatus;

/**
 * Account registered exception.
 *
 * @author panjing
 */
public class AccountRegisteredException extends AbstractEchoException {

    public AccountRegisteredException(String message) {
        super(message);
    }

    public AccountRegisteredException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return null;
    }

    @Override
    public ApiResponseCode getApiStatus() {
        return ApiResponseCode.CODE_ACCOUNT_REGISTERED;
    }
}
