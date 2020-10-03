package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.RoleMapper;
import cn.treeshell.echo.model.entity.Role;
import cn.treeshell.echo.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 系统角色表 服务实现类
 *
 * @author panjing
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
