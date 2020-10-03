package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.RoleMenuMapper;
import cn.treeshell.echo.model.entity.RoleMenu;
import cn.treeshell.echo.service.RoleMenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 角色权限关系表 服务实现类
 *
 * @author panjing
 */
@Service
public class RoleMenuServiceImpl extends ServiceImpl<RoleMenuMapper, RoleMenu> implements RoleMenuService {

}
