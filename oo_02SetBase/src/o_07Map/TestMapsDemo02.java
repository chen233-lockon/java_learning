package o_07Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.BiConsumer;

//Map的三种遍历方式
//1.根据键找值 get()根据键查值,keySet()获取所有的键到集合中，遍历集合
//2.根据Entry找键和值 entrySet()得到Map.Entry类,遍历集合，使用getKey()和getValue()获取
//3.forEach()方法遍历
public class TestMapsDemo02 {
    public static void main(String[] args) {
        TreeMap<String,String> tm = new TreeMap<>();
//        添加数据put(k,v)
        tm.put("c成都","028");
        tm.put("b上海","021");
        tm.put("a北京","010");
        tm.put("d广州","020");
        tm.put("e深圳","020");
        tm.put("f西安","029");
        tm.put("g杭州","0571");
        tm.put("i武汉","027");
        Test1(tm);
        System.out.println("----------------");
        Test2(tm);
        System.out.println("----------------");
        Test3(tm);
    }

    private static void Test1( TreeMap<String,String> tm) {
        //        方式一
//        将Map中的所有Key拿出来，保存到一个Set集合中
        Set<String> keys = tm.keySet();
//        遍历Set集合
        for (String key : keys) {
            System.out.println(key + "=" + tm.get(key));
        }
    }
    private static void Test2(TreeMap<String,String> tm) {
        //        方式二
//将Map转成Set集合
        Set<Map.Entry<String, String>> entries = tm.entrySet();
//        遍历Set集合
        Iterator<Map.Entry<String, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
//            获取键和值
            System.out.println(entry.getKey() + "=" + entry.getValue());
        }
    }
    private static void Test3(TreeMap<String,String> tm) {
        //        方式三
//        forEach()方法遍历
//        tm.forEach(new BiConsumer<String, String>() {
//            @Override
//            public void accept(String k, String v) {
//                System.out.println(k + "=" + v);
//            }
//        });
//        tm.forEach((k,v)-> System.out.println(k + "=" + v));
        tm.forEach((k,v)-> System.out.println(k + "=" + v));
    }
}
