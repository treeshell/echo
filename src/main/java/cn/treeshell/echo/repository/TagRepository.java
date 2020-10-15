package cn.treeshell.echo.repository;

import cn.treeshell.echo.common.constant.ActiveConstant;
import cn.treeshell.echo.model.entity.tables.records.TagRecord;
import cn.treeshell.echo.model.vo.TagVO;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

import static cn.treeshell.echo.model.entity.Tables.TAG;

/**
 * @author panjing
 */
@Repository
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TagRepository {

    private final DSLContext dslContext;

    /**
     * 新增标签
     * @param tagRecord 标签记录
     */
    public void insert(TagRecord tagRecord) {
        dslContext.executeInsert(tagRecord);
    }

    /**
     * 更新标签
     * @param tagRecord 标签记录
     */
    public void update(TagRecord tagRecord) {
        dslContext.executeUpdate(tagRecord);
    }

    /**
     * 通过标签名查找标签
     * @param name 标签名
     * @return 标签id
     */
    public Optional<Integer> getTagIdByName(String name) {
        return dslContext.select(TAG.ID).from(TAG)
                .where(TAG.NAME.eq(name)).fetchOptionalInto(Integer.class);
    }

    /**
     * 获取当前分类下的所有标签
     * @param categoryId 分类id
     * @return 标签集合
     */
    public List<TagVO> listTagVOByCategoryId(Integer categoryId) {
        return dslContext.select(TAG.ID, TAG.NAME).from(TAG)
                .where(TAG.CATEGORY_ID.eq(categoryId)
                        .and(TAG.ACTIVE.eq(ActiveConstant.NOT_DELETE)))
                .fetchInto(TagVO.class);
    }
}
