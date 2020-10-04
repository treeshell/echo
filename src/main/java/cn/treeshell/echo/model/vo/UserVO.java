package cn.treeshell.echo.model.vo;

import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author panjing
 */
@Data
public class UserVO {
    /** ID */
    private String id;
    /** 电话 */
    private String mobile;
    /** 用户名 */
    private String username;
    /** 邮箱 */
    private String email;
    /** 头像地址 */
    private String avatarUrl;
    /** 签名 */
    private String signature;
    /** 简介 */
    private String introduction;
    /** 0：未知，1：男，2：女 */
    private Boolean gender;
    /** 0：可用，1：禁用 */
    private Boolean status;
    /** 最后登陆日期 */
    private LocalDateTime lastLoginTime;
}
