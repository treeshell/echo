package cn.treeshell.echo.model.param;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

/**
 * 创建/更新标签入参
 *
 * @author panjing
 */
@Data
public class TagParam {

    /**
     * 当前标签分类id
     */
    private Integer categoryId;

    /**
     * 标签名称
     */
    @NotBlank(message = "标签名不能为空")
    @Size(max = 30, message = "标签名的字符长度不能超过 {max}")
    private String name;
}
