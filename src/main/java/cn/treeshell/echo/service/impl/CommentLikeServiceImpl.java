package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.CommentLikeMapper;
import cn.treeshell.echo.model.entity.CommentLike;
import cn.treeshell.echo.service.CommentLikeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户点赞评论表 服务实现类
 *
 * @author panjing
 */
@Service
public class CommentLikeServiceImpl extends ServiceImpl<CommentLikeMapper, CommentLike> implements CommentLikeService {

}
