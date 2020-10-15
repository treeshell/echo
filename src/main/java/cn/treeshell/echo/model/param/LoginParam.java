package cn.treeshell.echo.model.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 登录入参
 *
 * @author panjing
 */
@Data
public class LoginParam {

    /**
     * 用户名或邮箱
     */
    @NotBlank(message = "用户名或邮箱不能为空")
    @Size(max = 30, message = "用户名或邮箱的字符长度不能超过 {max}")
    private String username;

    /**
     * 密码
     */
    @NotBlank(message = "密码不能为空")
    @Size(max = 80, message = "用户密码长度不能超过 {max}")
    private String password;

    // TODO V2开发 登录验证码校验
    // @Size(min = 6, max = 6, message = "验证码长度应为 {max} 位")
    // private String verifyCode;
}
