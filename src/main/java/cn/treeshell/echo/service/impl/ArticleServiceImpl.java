package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.ArticleMapper;
import cn.treeshell.echo.model.entity.Article;
import cn.treeshell.echo.service.ArticleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章表 服务实现类
 *
 * @author panjing
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
