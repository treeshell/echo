package cn.treeshell.echo.repository;

import cn.treeshell.echo.common.constant.ActiveConstant;
import cn.treeshell.echo.model.entity.tables.records.CategoryRecord;
import cn.treeshell.echo.model.vo.CategoryVO;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

import static cn.treeshell.echo.model.entity.Tables.CATEGORY;

/**
 * @author panjing
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CategoryRepository {

    private final DSLContext dslContext;

    /**
     * 新增分类
     * @param categoryRecord 分类记录
     */
    public void insert(CategoryRecord categoryRecord) {
        dslContext.executeInsert(categoryRecord);
    }

    /**
     * 更新分类
     * @param categoryRecord 分类记录
     */
    public void update(CategoryRecord categoryRecord) {
        dslContext.executeUpdate(categoryRecord);
    }

    /**
     * 通过分类名查找分类
     * @param name 分类名
     * @return 分类id
     */
    public Optional<Integer> getCategoryIdByName(String name) {
        return dslContext.select(CATEGORY.ID).from(CATEGORY)
                .where(CATEGORY.NAME.eq(name)).fetchOptionalInto(Integer.class);
    }

    /**
     * 获取当前父分类下的所有子分类
     * @param parentId 父分类id
     * @return 子分类集合
     */
    public List<CategoryVO> listCategoryVOByParentId(Integer parentId) {
        return dslContext.select(CATEGORY.ID, CATEGORY.NAME).from(CATEGORY)
                .where(CATEGORY.PARENT_ID.eq(parentId)
                        .and(CATEGORY.ACTIVE.eq(ActiveConstant.NOT_DELETE)))
                .fetchInto(CategoryVO.class);
    }
}
