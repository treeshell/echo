package cn.treeshell.echo.service;

import cn.hutool.core.collection.CollUtil;
import cn.treeshell.echo.common.ApiResponseCode;
import cn.treeshell.echo.common.constant.ActiveConstant;
import cn.treeshell.echo.common.constant.CategoryConstant;
import cn.treeshell.echo.exception.CategoryNameExistException;
import cn.treeshell.echo.exception.CategoryNotDeleteException;
import cn.treeshell.echo.model.entity.tables.records.CategoryRecord;
import cn.treeshell.echo.model.param.CategoryParam;
import cn.treeshell.echo.model.vo.CategoryVO;
import cn.treeshell.echo.model.vo.TagVO;
import cn.treeshell.echo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 分类相关业务类
 *
 * @author panjing
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryService {

    private final CategoryRepository categoryRepository;
    private final TagService tagService;

    /**
     * 新增分类
     * @param categoryParam 创建/更新分类参数
     */
    public void create(@NonNull CategoryParam categoryParam) {
        // 1.校验分类名是否存在
        checkNameExist(categoryParam.getName());

        // 2.新增分类
        CategoryRecord categoryRecord = new CategoryRecord();
        categoryRecord.setName(categoryParam.getName());
        categoryRecord.setParentId(Objects.isNull(categoryParam.getParentId()) ? CategoryConstant.INITIAL_ID : categoryParam.getParentId());
        categoryRepository.insert(categoryRecord);
    }

    /**
     * 更新分类
     * @param categoryParam 创建/更新分类参数
     * @param id 分类id
     */
    public void update(@NonNull CategoryParam categoryParam, @NonNull Integer id) {
        // 1.校验分类名是否存在
        checkNameExist(categoryParam.getName());

        // 2.更新分类
        CategoryRecord categoryRecord = new CategoryRecord();
        categoryRecord.setId(id);
        categoryRecord.setName(categoryParam.getName());
        categoryRecord.setParentId(Objects.isNull(categoryParam.getParentId()) ? CategoryConstant.INITIAL_ID : categoryParam.getParentId());
        categoryRepository.update(categoryRecord);
    }

    /**
     * 校验分类名是否存在
     * @param name 分类名
     */
    private void checkNameExist(String name) {
        Optional<Integer> categoryOptional = categoryRepository.getCategoryIdByName(name);
        if (categoryOptional.isPresent()) {
            // 分类名已存在
            throw new CategoryNameExistException(ApiResponseCode.CODE_CATEGORY_NAME_EXIST.getMessage());
        }
    }

    /**
     * 删除分类
     * TODO V2开发 删除分类需要考虑分类与文章的关系
     * @param id 分类id
     */
    public void delete(@NonNull Integer id) {
        // 1.校验当前分类下是否还有分类、标签、文章等
        checkHaveChildCategory(id);

        // 2.如果当前分类下没有子分类，则删除
        CategoryRecord categoryRecord = new CategoryRecord();
        categoryRecord.setId(id);
        categoryRecord.setActive(ActiveConstant.DELETED);
        categoryRepository.update(categoryRecord);
    }

    /**
     * 校验当前分类下是否还有子分类
     * @param id
     */
    private void checkHaveChildCategory(Integer id) {
        List<CategoryVO> categoryVOList = categoryRepository.listCategoryVOByParentId(id);
        List<TagVO> tagVOList = tagService.listTagVO(id);
        if (CollUtil.isNotEmpty(categoryVOList) || CollUtil.isNotEmpty(tagVOList)) {
            throw new CategoryNotDeleteException(ApiResponseCode.CODE_CATEGORY_NOT_DELETE.getMessage());
        }
    }

    /**
     * 根据父分类id查询子分类集合
     * TODO V2开发 分类与文章的关联，如分类中文章数量展示等
     * @param parentId 父分类id
     * @return 子分类集合
     */
    public List<CategoryVO> listCategoryVO(@NonNull Integer parentId) {
        return categoryRepository.listCategoryVOByParentId(parentId);
    }

}
