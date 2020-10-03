package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 悄悄话表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class PrivateMessage implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /** 悄悄话内容 */
    private String content;
    /** 发送悄悄话用户ID */
    private String userId;
    /** 回复悄悄话用户ID */
    private String replierId;
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
    /** 回复日期 */
    private LocalDateTime replyTime;
}
