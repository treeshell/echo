package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.CommentMapper;
import cn.treeshell.echo.model.entity.Comment;
import cn.treeshell.echo.service.CommentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 评论表 服务实现类
 *
 * @author panjing
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment> implements CommentService {

}
