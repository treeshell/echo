package cn.treeshell.echo.util;

import cn.hutool.crypto.digest.DigestUtil;

/**
 * Security util.
 *
 * @author panjing
 */
public class SecurityUtil {

    /**
     * 加密
     * @param value 原始值
     * @param salt 盐值
     * @return 加密后的值
     */
    public static String encrypt(String value, String salt) {
        return DigestUtil.md5Hex(value + DigestUtil.md5Hex(salt));
    }
}
