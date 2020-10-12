package cn.treeshell.echo.util;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Date util.
 *
 * @author panjing
 */
public class DateUtil {

    private static final String DATE_FORMAT_FULL = "yyyy-MM-dd HH:mm:ss";

    /**
     * 获取当前时间，格式为 "yyyy-MM-dd HH:mm:ss"
     * @return 格式化后的时间
     */
    public static Timestamp getLocalDateTime() {
        return Timestamp.valueOf(dateFormat(DATE_FORMAT_FULL));
    }

    private static String dateFormat(String format) {
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern(format));
    }
}
