package cn.treeshell.echo.controller;

import cn.treeshell.echo.common.ApiResponse;
import cn.treeshell.echo.common.ApiResponseCode;

/**
 * Base controller.
 *
 * @author panjing
 */
public class BaseController {

    /**
     * JSON输出
     */
    private ApiResponse result(ApiResponseCode responseCode, Object data) {
        return (new ApiResponse()).result(responseCode, data);
    }

    protected ApiResponse success() {
        return this.result(ApiResponseCode.CODE_SUCCESS, null);
    }

    protected ApiResponse success(Object data) {
        return this.result(ApiResponseCode.CODE_SUCCESS, data);
    }

    protected ApiResponse fail(ApiResponseCode responseCode) {
        return this.result(responseCode, null);
    }
}
