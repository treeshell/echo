package cn.treeshell.echo.model.vo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.sql.Timestamp;

/**
 * 用户信息实体
 *
 * @author panjing
 */
@Data
public class UserVO {
    /** id */
    private Integer id;
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
    /** 性别 0：未知，1：男，2：女 */
    private Byte gender;
    /** 最后登录日期 */
    private Timestamp lastLoginTime;

    @JsonIgnore
    private Timestamp createTime;
    @JsonIgnore
    private String password;
}
