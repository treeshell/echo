package cn.treeshell.echo.service;

import cn.treeshell.echo.common.ApiResponseCode;
import cn.treeshell.echo.common.constant.ActiveConstant;
import cn.treeshell.echo.common.constant.TagConstant;
import cn.treeshell.echo.exception.TagNameExistException;
import cn.treeshell.echo.model.entity.tables.records.TagRecord;
import cn.treeshell.echo.model.param.TagParam;
import cn.treeshell.echo.model.vo.TagVO;
import cn.treeshell.echo.repository.TagRepository;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * 标签相关业务类
 *
 * @author panjing
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class TagService {

    private final TagRepository tagRepository;

    /**
     * 新增标签
     * @param tagParam 创建/更新标签参数
     */
    public void create(@NonNull TagParam tagParam) {
        // 1.校验标签名是否存在
        checkNameExist(tagParam.getName());

        // 2.新增标签
        TagRecord tagRecord = new TagRecord();
        tagRecord.setName(tagParam.getName());
        tagRecord.setCategoryId(Objects.isNull(tagParam.getCategoryId()) ? TagConstant.INITIAL_ID : tagParam.getCategoryId());
        tagRepository.insert(tagRecord);
    }

    /**
     * 更新标签
     * @param tagParam 创建/更新标签参数
     * @param id 标签id
     */
    public void update(@NonNull TagParam tagParam, @NonNull Integer id) {
        // 1.校验标签名是否存在
        checkNameExist(tagParam.getName());

        // 2.更新分类
        TagRecord tagRecord = new TagRecord();
        tagRecord.setId(id);
        tagRecord.setName(tagParam.getName());
        tagRecord.setCategoryId(Objects.isNull(tagParam.getCategoryId()) ? TagConstant.INITIAL_ID : tagParam.getCategoryId());
        tagRepository.update(tagRecord);
    }

    /**
     * 校验标签名是否存在
     * @param name 标签名
     */
    private void checkNameExist(String name) {
        Optional<Integer> tagOptional = tagRepository.getTagIdByName(name);
        if (tagOptional.isPresent()) {
            // 标签名已存在
            throw new TagNameExistException(ApiResponseCode.CODE_TAG_NAME_EXIST.getMessage());
        }
    }

    /**
     * 删除标签
     * TODO V2开发 删除标签需要考虑标签与文章的关系
     * @param id
     */
    public void delete(@NonNull Integer id) {
        TagRecord tagRecord = new TagRecord();
        tagRecord.setId(id);
        tagRecord.setActive(ActiveConstant.DELETED);
        tagRepository.update(tagRecord);
    }

    /**
     * 根据分类id查询标签集合
     * TODO V2开发 标签与文章的关联，如标签中文章数量展示等
     * @param categoryId 分类id
     * @return 标签集合
     */
    public List<TagVO> listTagVO(@NonNull Integer categoryId) {
        return tagRepository.listTagVOByCategoryId(categoryId);
    }
}
