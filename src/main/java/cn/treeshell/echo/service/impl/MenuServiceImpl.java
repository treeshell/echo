package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.MenuMapper;
import cn.treeshell.echo.model.entity.Menu;
import cn.treeshell.echo.service.MenuService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 系统菜单表 服务实现类
 *
 * @author panjing
 */
@Service
public class MenuServiceImpl extends ServiceImpl<MenuMapper, Menu> implements MenuService {

}
