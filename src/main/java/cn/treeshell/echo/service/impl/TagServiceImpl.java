package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.TagMapper;
import cn.treeshell.echo.model.entity.Tag;
import cn.treeshell.echo.service.TagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章标签表 服务实现类
 *
 * @author panjing
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements TagService {

}
