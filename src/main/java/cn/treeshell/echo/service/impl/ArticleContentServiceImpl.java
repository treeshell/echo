package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.ArticleContentMapper;
import cn.treeshell.echo.model.entity.ArticleContent;
import cn.treeshell.echo.service.ArticleContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章内容表 服务实现类
 *
 * @author panjing
 */
@Service
public class ArticleContentServiceImpl extends ServiceImpl<ArticleContentMapper, ArticleContent> implements ArticleContentService {

}
