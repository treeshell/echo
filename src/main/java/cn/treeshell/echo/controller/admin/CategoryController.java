package cn.treeshell.echo.controller.admin;

import cn.treeshell.echo.common.ApiResponse;
import cn.treeshell.echo.controller.BaseController;
import cn.treeshell.echo.model.param.CategoryParam;
import cn.treeshell.echo.service.CategoryService;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

/**
 * Category controller.
 *
 * @author panjing
 */
@RestController
@RequestMapping("/admin/category")
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryController extends BaseController {

    private final CategoryService categoryService;

    /**
     * 新增分类
     */
    @PostMapping("/create")
    public ApiResponse create(@RequestBody @Valid CategoryParam categoryParam) {
        categoryService.create(categoryParam);
        return this.success();
    }

    /**
     * 更新分类
     */
    @PostMapping("/update/{id}")
    public ApiResponse update(@RequestBody @Valid CategoryParam categoryParam,
                              @PathVariable("id") @NonNull Integer id) {
        categoryService.update(categoryParam, id);
        return this.success();
    }

    /**
     * 删除分类
     */
    @PostMapping("/delete/{id}")
    public ApiResponse delete(@PathVariable("id") @NonNull Integer id) {
        categoryService.delete(id);
        return this.success();
    }

    /**
     * 根据父分类id查询子分类集合
     */
    @GetMapping("/list/{parentId}")
    public ApiResponse list(@PathVariable("parentId") @NonNull Integer parentId) {
        return this.success(categoryService.listCategoryVO(parentId));
    }
}

