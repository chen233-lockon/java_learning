package o_07Map;

import java.util.*;
import java.util.function.BiConsumer;

public class TestMapsDemo04
{
//    江苏省 = 南京市，扬州市，苏州市，无锡市，常州市
//    湖北省 = 武汉市，孝感市，十堰市，宜昌市，鄂州市
//    四川省 = 成都市，绵阳市，自贡市，攀枝花市，泸州市
    public static void main(String[] args) {
        Map<String, Set<String>> map = created();
        map.forEach((s, strings) -> System.out.println(s + " = " + strings));
    }

    private static Map<String, Set<String>> created() {
        Map<String, Set<String>> map = new TreeMap<>();
        Set<String> value = new LinkedHashSet<>();
//        Collections工具类批量添加,不要add单次添加
        Collections.addAll(value, "南京市", "扬州市", "苏州市", "无锡市", "常州市");
        map.put("江苏省", value);
        Set<String> value1 = new LinkedHashSet<>();
        Collections.addAll(value1, "武汉市", "孝感市", "十堰市", "宜昌市", "鄂州市");
        map.put("湖北省", value1);
        Set<String> value2 = new LinkedHashSet<>();
        Collections.addAll(value2, "成都市", "绵阳市", "自贡市", "攀枝花市", "泸州市");
        map.put("四川省", value2);
        return map;
    }
}
