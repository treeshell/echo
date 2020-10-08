package cn.treeshell.echo.model.param;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * Login param.
 *
 * @author panjing
 */
@ApiModel("登录实体类")
@Data
public class LoginParam {

    @ApiModelProperty(value = "用户名", required = true)
    @NotBlank(message = "用户名或邮箱不能为空")
    @Size(max = 30, message = "用户名或邮箱的字符长度不能超过 {max}")
    private String username;

    @ApiModelProperty(value = "密码", required = true)
    @NotBlank(message = "密码不能为空")
    @Size(max = 80, message = "用户密码长度不能超过 {max}")
    private String password;

    // TODO v2版本开发 登录验证码校验
    // @Size(min = 6, max = 6, message = "验证码长度应为 {max} 位")
    // private String verifyCode;
}
