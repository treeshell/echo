package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 文章表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Article implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /** 发表者ID */
    private String userId;
    /** 标题 */
    private String title;
    /**  文章内容ID */
    private String contentId;
    /** 摘要 */
    private String digest;
    /** 主图地址 */
    private String imageUrl;
    /** 0：原创，1：转载，2：翻译 */
    private Boolean type;
    /** 转载/翻译的原文链接 */
    private String originUrl;
    /** 点赞/喜欢数 */
    private Integer likes;
    /** 标签ID */
    private String tagId;
    /** 分类ID */
    private String categoryId;
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
}
