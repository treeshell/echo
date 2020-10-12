package cn.treeshell.echo.repository;

import cn.treeshell.echo.common.constant.ActiveConstant;
import cn.treeshell.echo.common.constant.UserConstant;
import cn.treeshell.echo.model.entity.tables.records.UserRecord;
import cn.treeshell.echo.model.param.RegisterParam;
import cn.treeshell.echo.model.vo.UserVO;
import lombok.RequiredArgsConstructor;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.Optional;

import static cn.treeshell.echo.model.entity.Tables.USER;

/**
 * @author panjing
 */
@Component
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class UserRepository {

    private final DSLContext dslContext;

    /**
     * 通过邮箱查询用户信息
     * @param email 邮箱
     * @return Optional<UserVO>
     */
    public Optional<UserVO> getUserByEmail(String email) {
        return dslContext.select(USER.ID, USER.PASSWORD, USER.MOBILE, USER.USERNAME, USER.EMAIL,
                USER.AVATAR_URL, USER.SIGNATURE, USER.INTRODUCTION, USER.GENDER, USER.CREATE_TIME)
                .from(USER)
                .where(USER.EMAIL.eq(email)
                        .and(USER.STATUS.eq(UserConstant.ENABLE))
                        .and(USER.ACTIVE.eq(ActiveConstant.NOT_DELETE)))
                .fetchOptionalInto(UserVO.class);
    }

    /**
     * 通过用户名查询用户信息
     * @param username 用户名
     * @return Optional<UserVO>
     */
    public Optional<UserVO> getUserByUsername(String username) {
        return dslContext.select(USER.ID, USER.PASSWORD, USER.MOBILE, USER.USERNAME, USER.EMAIL,
                USER.AVATAR_URL, USER.SIGNATURE, USER.INTRODUCTION, USER.GENDER, USER.CREATE_TIME)
                .from(USER)
                .where(USER.USERNAME.eq(username)
                        .and(USER.STATUS.eq(UserConstant.ENABLE))
                        .and(USER.ACTIVE.eq(ActiveConstant.NOT_DELETE)))
                .fetchOptionalInto(UserVO.class);
    }

    /**
     * 更新最后登录时间
     * @param id 用户id
     * @param lastLoginTime 最后登录时间
     * @return 影响的行数
     */
    public void updateLastLoginTime(Integer id, Timestamp lastLoginTime) {
        dslContext.update(USER).set(USER.LAST_LOGIN_TIME, lastLoginTime)
                .where(USER.ID.eq(id)).execute();
    }

    /**
     * 通过用户名或者邮箱查找用户
     * @param registerParam 注册参数
     * @return 用户id
     */
    public Optional<Integer> getUser(RegisterParam registerParam) {
        return dslContext.select(USER.ID)
                .from(USER)
                .where(USER.USERNAME.eq(registerParam.getUsername())
                        .or(USER.EMAIL.eq(registerParam.getEmail()))).fetchOptionalInto(Integer.class);
    }

    /**
     * 新增用户
     * @param userRecord 用户记录
     */
    public void insert(UserRecord userRecord) {
        dslContext.executeInsert(userRecord);
    }
}
