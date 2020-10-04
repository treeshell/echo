package cn.treeshell.echo.util;

import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.StrUtil;

/**
 * Regex util.
 *
 * @author panjing
 */
public class RegexUtil {

    /**
     * 是否是邮箱格式
     * @param email 邮箱字符串
     * @return true: 是邮箱 false: 不是邮箱
     */
    public static boolean isEmail(String email) {
        if (StrUtil.isBlank(email)) {
            return false;
        }

        String regex = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
        return ReUtil.isMatch(regex, email);
    }
}
