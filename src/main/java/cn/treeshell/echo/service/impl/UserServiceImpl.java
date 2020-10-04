package cn.treeshell.echo.service.impl;

import cn.treeshell.echo.common.ApiResponseCode;
import cn.treeshell.echo.common.constant.ActiveConstant;
import cn.treeshell.echo.common.constant.UserConstant;
import cn.treeshell.echo.exception.AccountNotFoundException;
import cn.treeshell.echo.exception.AccountRegisteredException;
import cn.treeshell.echo.exception.UsernamePasswordException;
import cn.treeshell.echo.mapper.UserMapper;
import cn.treeshell.echo.model.entity.User;
import cn.treeshell.echo.model.param.LoginParam;
import cn.treeshell.echo.model.param.RegisterParam;
import cn.treeshell.echo.model.vo.UserVO;
import cn.treeshell.echo.service.UserService;
import cn.treeshell.echo.util.DateUtil;
import cn.treeshell.echo.util.RegexUtil;
import cn.treeshell.echo.util.SecurityUtil;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.update.LambdaUpdateWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 * 用户表 服务实现类
 *
 * @author panjing
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Override
    public UserVO login(@NonNull LoginParam loginParam) {
        // 1.根据用户名密码查询用户信息
        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery();
        if (RegexUtil.isEmail(loginParam.getUsername())) {
            // 如果是邮箱登录
            queryWrapper.eq(User::getEmail, loginParam.getUsername());
        } else {
            // 如果是用户名登录
            queryWrapper.eq(User::getUsername, loginParam.getUsername());
        }
        queryWrapper.eq(User::getActive, ActiveConstant.NOT_DELETE)
                .eq(User::getStatus, UserConstant.ENABLE)
                .select(User::getId, User::getPassword, User::getMobile,
                        User::getUsername, User::getEmail, User::getAvatarUrl,
                        User::getSignature, User::getIntroduction, User::getGender,
                        User::getCreateTime);

        User user = this.baseMapper.selectOne(queryWrapper);
        if (user == null) {
            throw new AccountNotFoundException(ApiResponseCode.CODE_ACCOUNT_NOT_FOUND.getMessage());
        }

        String encryptPassword = SecurityUtil.encrypt(loginParam.getPassword(), user.getCreateTime().toString());
        if (!Objects.equals(encryptPassword, user.getPassword())) {
            throw new UsernamePasswordException(ApiResponseCode.CODE_ACCOUNT_OR_PASSWORD_ERROR.getMessage());
        }

        user.setLastLoginTime(DateUtil.getCurrentTime());
        UserVO userVO = new UserVO();
        BeanUtils.copyProperties(user, userVO);

        // 2.更新最后登录日期
        LambdaUpdateWrapper<User> updateWrapper = Wrappers.lambdaUpdate();
        updateWrapper.set(User::getLastLoginTime, DateUtil.getCurrentTime())
                .eq(User::getId, user.getId());
        this.baseMapper.update(user, updateWrapper);

        return userVO;
    }

    @Override
    public void register(@NonNull RegisterParam registerParam) {
        // 1.校验账户是否已经存在A
        LambdaQueryWrapper<User> queryWrapper = Wrappers.lambdaQuery();
        queryWrapper.eq(User::getEmail, registerParam.getEmail())
                .or().eq(User::getUsername, registerParam.getUsername())
                .eq(User::getStatus, UserConstant.ENABLE)
                .eq(User::getActive, ActiveConstant.NOT_DELETE)
                .select(User::getId);
        User user = this.baseMapper.selectOne(queryWrapper);
        if (user != null) {
            throw new AccountRegisteredException(ApiResponseCode.CODE_ACCOUNT_REGISTERED.getMessage());
        }

        // 2.该账户不存在，执行插入操作
        user = new User();
        LocalDateTime now = DateUtil.getCurrentTime();
        user.setUsername(registerParam.getUsername());
        user.setEmail(registerParam.getEmail());
        user.setCreateTime(now);
        user.setPassword(SecurityUtil.encrypt(registerParam.getPassword(), now.toString()));
        // TODO v2版本开发 默认情况下是禁用，需要邮箱收取激活连接之后点击启用
        this.baseMapper.insert(user);
    }
}
