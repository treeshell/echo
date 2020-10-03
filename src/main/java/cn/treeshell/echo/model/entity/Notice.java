package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 通知表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Notice implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /**
     * 操作类型ID：文章收藏、文章评论、评论收藏、评论回复、悄悄话回复
     */
    private String operationId;
    /**
     * 1：文章收藏通知，2：文章评论通知，11：评论收藏通知，12：评论回复通知；21：悄悄话回复通知
     */
    private Integer type;
    /**
     * 接收通知的用户ID
     */
    private String userId;
    /** 0：未读，1：已读 */
    private Boolean isRead;
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
}
