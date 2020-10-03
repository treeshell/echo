package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.UserRoleMapper;
import cn.treeshell.echo.model.entity.UserRole;
import cn.treeshell.echo.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 用户角色关系表 服务实现类
 *
 * @author panjing
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
