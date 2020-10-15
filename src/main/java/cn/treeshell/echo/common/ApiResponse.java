package cn.treeshell.echo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author panjing
 */
@Data
public class ApiResponse implements Serializable {
    /**
     * 状态码，非0为错误
     */
    private int code;
    /**
     * 错误信息
     */
    private String message;
    /**
     * 返回内容
     */
    private Object data;

    public ApiResponse result(ApiResponseCode responseCode, Object data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
        return this;
    }
}
