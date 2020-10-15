package cn.treeshell.echo.controller.admin;

import cn.treeshell.echo.common.ApiResponse;
import cn.treeshell.echo.controller.BaseController;
import cn.treeshell.echo.model.param.TagParam;
import cn.treeshell.echo.service.TagService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Tag Controller.
 *
 * @author panjing
 */
@RestController
@RequestMapping("/admin/tag")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TagController extends BaseController {

    private final TagService tagService;

    /**
     * 新增标签
     */
    @PostMapping("/create")
    public ApiResponse create(@RequestBody @Valid TagParam tagParam) {
        tagService.create(tagParam);
        return this.success();
    }

    /**
     * 更新标签
     */
    @PostMapping("/update/{id}")
    public ApiResponse update(@RequestBody @Valid TagParam tagParam,
                              @PathVariable("id") @NonNull Integer id) {
        tagService.update(tagParam, id);
        return this.success();
    }

    /**
     * 删除标签
     */
    @PostMapping("/delete/{id}")
    public ApiResponse delete(@PathVariable("id") @NonNull Integer id) {
        tagService.delete(id);
        return this.success();
    }

    /**
     * 根据分类id查询标签集合
     */
    @GetMapping("/list/{categoryId}")
    public ApiResponse list(@PathVariable("categoryId") @NonNull Integer categoryId) {
        return this.success(tagService.listTagVO(categoryId));
    }

}

