package cn.treeshell.echo.exception;

import cn.treeshell.echo.common.ApiResponseCode;
import org.springframework.http.HttpStatus;

/**
 * Account not found exception.
 *
 * @author panjing
 */
public class AccountNotFoundException extends AbstractEchoException {

    public AccountNotFoundException(String message) {
        super(message);
    }

    public AccountNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    @Override
    public HttpStatus getStatus() {
        return null;
    }

    @Override
    public ApiResponseCode getApiStatus() {
        return ApiResponseCode.CODE_ACCOUNT_NOT_FOUND;
    }
}
