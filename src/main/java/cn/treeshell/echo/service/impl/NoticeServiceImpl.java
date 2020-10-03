package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.NoticeMapper;
import cn.treeshell.echo.model.entity.Notice;
import cn.treeshell.echo.service.NoticeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 通知表 服务实现类
 *
 * @author panjing
 */
@Service
public class NoticeServiceImpl extends ServiceImpl<NoticeMapper, Notice> implements NoticeService {

}
