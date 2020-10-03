package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.PrivateMessageMapper;
import cn.treeshell.echo.model.entity.PrivateMessage;
import cn.treeshell.echo.service.PrivateMessageService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 悄悄话表 服务实现类
 *
 * @author panjing
 */
@Service
public class PrivateMessageServiceImpl extends ServiceImpl<PrivateMessageMapper, PrivateMessage> implements PrivateMessageService {

}
