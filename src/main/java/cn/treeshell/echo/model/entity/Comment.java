package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 评论表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Comment implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /** 评论内容 */
    private String content;
    /** 评论父节点ID */
    private String parentId;
    /**  评论文章ID */
    private String articleId;
    /** 评论用户ID */
    private String userId;
    /** 回答评论用户ID */
    private String answererId;
    /** 0：待审核，1：审核通过 */
    private Boolean status;
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
}
