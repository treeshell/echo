package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 用户点赞评论表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class CommentLike implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /** 评论ID */
    private String commentId;
    /** 收藏用户ID */
    private String userId;
    /** 发布评论用户ID */
    private String publisherId;
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
}
