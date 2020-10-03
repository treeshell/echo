package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.UserMapper;
import cn.treeshell.echo.model.entity.User;
import cn.treeshell.echo.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户表 服务实现类
 *
 * @author panjing
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
