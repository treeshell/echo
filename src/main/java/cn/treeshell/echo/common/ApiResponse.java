package cn.treeshell.echo.common;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author panjing
 */
@ApiModel("统一返回实体类")
@Data
public class ApiResponse<T> implements Serializable {
    /**
     * 状态码，非0为错误
     */
    @ApiModelProperty("状态码")
    private int code;
    /**
     * 错误信息
     */
    @ApiModelProperty("错误信息")
    private String message;
    /**
     * 返回内容
     */
    @ApiModelProperty("返回内容")
    private T data;

    private ApiResponse<T> result(ApiResponseCode responseCode, T data) {
        this.code = responseCode.getCode();
        this.message = responseCode.getMessage();
        this.data = data;
        return this;
    }

    public ApiResponse success() {
        return result(ApiResponseCode.CODE_SUCCESS, null);
    }

    public ApiResponse<T> success(T data) {
        return this.result(ApiResponseCode.CODE_SUCCESS, data);
    }

    public ApiResponse fail(ApiResponseCode responseCode) {
        return this.result(responseCode, null);
    }
}
