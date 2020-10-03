package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /** 电话 */
    private String mobile;
    /** 用户名 */
    private String username;
    /** 密码 */
    private String password;
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
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
    /** 最后登陆日期 */
    private LocalDateTime lastLoginTime;
}
