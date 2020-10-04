package cn.treeshell.echo.util;

import java.time.LocalDateTime;

/**
 * Date util.
 *
 * @author panjing
 */
public class DateUtil {

    /**
     * 获取当前时间，格式为 "yyyy-MM-dd HH:mm:ss"
     * @return 格式化后的时间
     */
    public static LocalDateTime getCurrentTime() {
        return LocalDateTime.now().withNano(0);
    }
}
