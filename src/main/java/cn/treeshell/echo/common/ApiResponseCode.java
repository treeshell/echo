package cn.treeshell.echo.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author panjing
 */
@Getter
@AllArgsConstructor
public enum ApiResponseCode {
    /**
     * 通用返回码：0代表成功，负数代表系统错误
     */
    CODE_SUCCESS(0, "请求成功"),
    CODE_FAIL(-1, "请求失败"),
    CODE_PARAM_ERROR(-2, "参数错误"),
    CODE_API_NO_RESUBMIT(-3, "请勿重复提交"),
    /**
     * 返回码：6位数字（前两位为分类，后四位为该分类下的错误码）
     * 10开头：账号相关，登录、登出、角色等
     */
    CODE_ACCOUNT_OR_PASSWORD_ERROR(100001, "用户名或者密码错误"),
    CODE_ACCOUNT_REGISTERED(100002, "账号已注册"),
    CODE_ACCOUNT_VERIFY_EXPIRED(100003, "验证码已失效"),
    CODE_ACCOUNT_LOGIN_EXPIRED(100004, "登录已过期，请重新登录"),
    CODE_ACCOUNT_NOT_FOUND(100005, "该账号未注册"),

    /**
     * 20开头：分类相关
     */
    CODE_CATEGORY_NAME_EXIST(200001, "分类名已存在"),
    CODE_CATEGORY_NOT_DELETE(200002, "当前分类下含有子分类/标签/文章，无法删除"),

    /**
     * 30开头：标签相关
     */
    CODE_TAG_NAME_EXIST(300001, "标签名已存在");



    private int code;
    private String message;
}
