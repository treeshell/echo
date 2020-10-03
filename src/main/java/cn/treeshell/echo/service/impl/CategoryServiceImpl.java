package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.mapper.CategoryMapper;
import cn.treeshell.echo.model.entity.Category;
import cn.treeshell.echo.service.CategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * 文章分类表 服务实现类
 *
 * @author panjing
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
