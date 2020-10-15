package cn.treeshell.echo.model.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 创建/更新入参
 *
 * @author panjing
 */
@Data
public class CategoryParam {

    /**
     * 当前分类父菜单id
     */
    private Integer parentId;

    /**
     * 分类名称
     */
    @NotBlank(message = "分类名不能为空")
    @Size(max = 30, message = "分类名的字符长度不能超过 {max}")
    private String name;
}
