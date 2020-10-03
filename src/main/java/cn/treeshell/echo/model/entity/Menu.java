package cn.treeshell.echo.model.entity;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * 系统菜单表
 *
 * @author panjing
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class Menu implements Serializable {

    private static final long serialVersionUID = 1L;

    /** ID */
    private String id;
    /** 当前菜单所有父菜单ID */
    private String parentIds;
    /** 0：不是叶子节点，1：是叶子节点 */
    private Boolean isLeaf;
    /** 菜单名称 */
    private String name;
    /** 跳转URL */
    private String redirectUrl;
    /** icon地址 */
    private String iconUrl;
    /** 菜单排序 */
    private Integer sort;
    /** 菜单层级 */
    private Integer level;
    /** 0：未删除，1：已删除 */
    private Boolean active;
    /** 创建日期 */
    private LocalDateTime createTime;
    /** 修改日期 */
    private LocalDateTime updateTime;
}
