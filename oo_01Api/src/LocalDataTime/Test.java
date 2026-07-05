package LocalDataTime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

//不可变类，修改返回新对象，线程安全
public class Test {
    public static void main(String[] args) {
//        LocalDate类：年月日
//        LocalTime类：时分秒
//          使用toLocalDate()、toLocalTime()转换类型
//        LocalDateTime类：年月日时分秒
//        DateTimeFormatter类：格式化时间

//        通过.now()获取当前时间，而不是创建对象
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);
//        通过.of()设置修改时间
        LocalDate localDate1 = LocalDate.of(2020, 10, 10);
        LocalTime localTime1 = LocalTime.of(10, 10, 10);
        LocalDateTime localDateTime1 = LocalDateTime.of(2020, 10, 10, 10, 10, 10);
//        各种get..........
//        返回新的日期对象
//        各种With，修改并返回新的对象
//        各种plus，添加并返回新的对象
//        各种minus，减去并返回新的对象
//        equals，判断两个对象是否相等
//        isBefore，判断当前对象是否在参数对象之前
//        isAfter，判断当前对象是否在参数对象之后
//        计算时间差利用Duration类
        Duration duration = Duration.between(localDateTime, localDateTime1);
        System.out.println( duration);
//        格式化器DateTimeFormatter
//        1.预定义的格式化机器
        LocalDateTime now = LocalDateTime.now();
//          使用预定义的格式化器
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE));     // 2023-11-15
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_TIME));     // 14:30:45.123
        System.out.println(now.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME)); // 2023-11-15T14:30:45.123
//        2.自定义模式
//        yyyy-MM-dd HH:mm:ss  注意M是月，m是分，H是24小时制，h是12小时制，s是秒，S是毫秒，a 是上午下午，E是星期几
//        通过静态方法ofPattern()创建，类的內部创建实例
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
//        调用时间对象的format()方法，传入格式化器对象
        String formattedDateTime = now.format(formatter);  // 格式化
        System.out.println(formattedDateTime);
//         parse方法，将字符串转换为时间对象，和模板匹配
//        模式不匹配会报，DateTimeParseException
        String dateTimeString = "2023-11-15 14:30:45";
        LocalDateTime ldt = LocalDateTime.parse(dateTimeString, formatter);
        System.out.println(ldt.getDayOfMonth());
        System.out.println(ldt instanceof LocalDateTime);
    }
}
