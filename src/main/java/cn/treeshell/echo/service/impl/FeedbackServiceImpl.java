package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.FeedbackMapper;
import cn.treeshell.echo.model.entity.Feedback;
import cn.treeshell.echo.service.FeedbackService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 反馈表 服务实现类
 *
 * @author panjing
 */
@Service
public class FeedbackServiceImpl extends ServiceImpl<FeedbackMapper, Feedback> implements FeedbackService {

}
