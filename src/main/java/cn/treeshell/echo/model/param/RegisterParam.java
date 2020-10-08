package cn.treeshell.echo.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Register param.
 *
 * @author panjing
 */
@ApiModel("注册实体类")
@Data
public class RegisterParam {

    @ApiModelProperty("用户名")
    @NotBlank(message = "用户名不能为空")
    @Size(max = 30, message = "用户名的字符长度不能超过 {30}")
    private String username;

    @ApiModelProperty("密码")
    @NotBlank(message = "密码不能为空")
    @Size(max = 80, message = "用户密码长度不能超过 {max}")
    private String password;

    @ApiModelProperty("邮箱")
    @NotBlank(message = "邮箱不能为空")
    private String email;
}
