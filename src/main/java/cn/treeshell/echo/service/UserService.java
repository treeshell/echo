package cn.treeshell.echo.service;

import cn.treeshell.echo.model.entity.User;
import cn.treeshell.echo.model.param.LoginParam;
import cn.treeshell.echo.model.param.RegisterParam;
import cn.treeshell.echo.model.vo.UserVO;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.lang.NonNull;

/**
 * 用户表 服务类
 *
 * @author panjing
 */
public interface UserService extends IService<User> {

    /**
     * 登录
     * TODO 认证授权相关逻辑暂时未添加
     * @param loginParam
     * @return UserVO
     */
    UserVO login(@NonNull LoginParam loginParam);

    /**
     * 注册
     * @param registerParam
     */
    void register(@NonNull RegisterParam registerParam);
}
