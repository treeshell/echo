package cn.treeshell.echo.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

/**
 * @author panjing
 */
@ApiModel("用户返回实体类")
@Data
public class UserVO {
    @ApiModelProperty("id")
    private String id;
    @ApiModelProperty("电话")
    private String mobile;
    @ApiModelProperty("用户名")
    private String username;
    @ApiModelProperty("邮箱")
    private String email;
    @ApiModelProperty("头像地址")
    private String avatarUrl;
    @ApiModelProperty("签名")
    private String signature;
    @ApiModelProperty("性别")
    private String introduction;
    @ApiModelProperty("性别 0：未知，1：男，2：女")
    private Boolean gender;
    @ApiModelProperty("是否可用 0：可用，1：禁用")
    private Boolean status;
    @ApiModelProperty("最后登录日期")
    private LocalDateTime lastLoginTime;
}
