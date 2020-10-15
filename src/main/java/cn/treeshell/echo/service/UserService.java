package cn.treeshell.echo.service;

import cn.treeshell.echo.common.ApiResponseCode;
import cn.treeshell.echo.exception.AccountNotFoundException;
import cn.treeshell.echo.exception.AccountRegisteredException;
import cn.treeshell.echo.exception.UsernamePasswordException;
import cn.treeshell.echo.model.entity.tables.records.UserRecord;
import cn.treeshell.echo.model.param.LoginParam;
import cn.treeshell.echo.model.param.RegisterParam;
import cn.treeshell.echo.model.vo.UserVO;
import cn.treeshell.echo.repository.UserRepository;
import cn.treeshell.echo.util.DateUtil;
import cn.treeshell.echo.util.RegexUtil;
import cn.treeshell.echo.util.SecurityUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;

/**
 * 用户相关业务类
 *
 * @author panjing
 */
@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

    private final UserRepository userRepository;

    /**
     * 用户登录
     * TODO V2开发 手机号、验证码登录
     * @param loginParam 登录参数
     * @return UserVO
     */
    public UserVO login(@NonNull LoginParam loginParam) {
        // 1.根据用户名密码查询用户信息
        Optional<UserVO> userOptional;
        if (RegexUtil.isEmail(loginParam.getUsername())) {
            // 如果是邮箱登录
            userOptional = userRepository.getUserByEmail(loginParam.getUsername());
        } else {
            // 如果是用户名登录
            userOptional = userRepository.getUserByUsername(loginParam.getUsername());
        }

        if (!userOptional.isPresent()) {
            // 用户不存在
            throw new AccountNotFoundException(ApiResponseCode.CODE_ACCOUNT_NOT_FOUND.getMessage());
        }

        UserVO userVO = userOptional.get();
        String encryptPassword = SecurityUtil.encrypt(loginParam.getPassword(), userVO.getCreateTime().toString());

        if (!Objects.equals(encryptPassword, userVO.getPassword())) {
            // 密码错误
            throw new UsernamePasswordException(ApiResponseCode.CODE_ACCOUNT_OR_PASSWORD_ERROR.getMessage());
        }

        // 2.更新最后登录时间
        Timestamp lastLoginTime = DateUtil.getLocalDateTime();
        userVO.setLastLoginTime(lastLoginTime);
        userRepository.updateLastLoginTime(userVO.getId(), lastLoginTime);

        return userVO;
    }

    /**
     * 注册
     * TODO V2开发 手机号、邮箱注册
     * @param registerParam 注册参数
     */
    public void register(@NonNull RegisterParam registerParam) {
        // 1.校验账户是否已经存在A
        Optional<Integer> idOptional = userRepository.getUser(registerParam);

        if (idOptional.isPresent()) {
            // 用户已存在
            throw new AccountRegisteredException(ApiResponseCode.CODE_ACCOUNT_REGISTERED.getMessage());
        }

        // 2.该账户不存在，执行插入操作
        UserRecord userRecord = new UserRecord();
        Timestamp now = DateUtil.getLocalDateTime();
        userRecord.setUsername(registerParam.getUsername());
        userRecord.setEmail(registerParam.getEmail());
        userRecord.setCreateTime(now);
        userRecord.setPassword(SecurityUtil.encrypt(registerParam.getPassword(), now.toString()));
        // TODO V2开发 默认情况下是禁用，需要邮箱收取激活连接之后点击启用
        userRepository.insert(userRecord);
    }
}
