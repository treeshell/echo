package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.ArticleLikeMapper;
import cn.treeshell.echo.model.entity.ArticleLike;
import cn.treeshell.echo.service.ArticleLikeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户点赞文章表 服务实现类
 *
 * @author panjing
 */
@Service
public class ArticleLikeServiceImpl extends ServiceImpl<ArticleLikeMapper, ArticleLike> implements ArticleLikeService {

}
