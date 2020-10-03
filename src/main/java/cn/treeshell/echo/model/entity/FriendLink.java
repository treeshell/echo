package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 友链表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class FriendLink implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /** 博客标题 */
    private String title;
    /** 博客地址 */
    private String url;
    /** 博客图标地址 */
    private String imageUrl;
    /** 联系人邮箱 */
    private String email;
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
}
