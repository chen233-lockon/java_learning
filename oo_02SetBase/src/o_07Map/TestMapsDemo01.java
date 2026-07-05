package o_07Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//Map双列集合，由键值对构成，Java中用Entry对象表示键值对对象
//键不能重复，值可以重复且可以是任意类型
//TreeMap:有序
//HashMap:无序、无索引、无重复（key）哈希表的加载因子0.75,初始容量为16，每次扩容(变成新数组)2倍，阈值也扩两倍
//LinkedHashMap:继承自HashTable，保证存取顺序，但是效率比HashMap低、无索引、无重复（key）
public class TestMapsDemo01 {
    public static void main(String[] args) {
//        TreeMap
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
        tm.put("h南京","025");
        System.out.println( tm);
//        HashMap
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("张三",18);//自动装箱\拆箱
        hm.put("李四",20);
        hm.put("李四",21);//键同名会修改值
        hm.put("王五",19);
        hm.put("赵六",19);
        System.out.println( hm);
//        LinkedHashMap
        LinkedHashMap<String,Double> lhm = new LinkedHashMap<>();
        lhm.put("辽宁卫视",0.89);
        lhm.put("北京卫视",0.78);
        lhm.put("上海卫视",0.65);
        lhm.put("广东卫视",0.45);
        lhm.put("江苏卫视",0.23);
        lhm.put("浙江卫视",0.12);
        lhm.put("湖南卫视",0.46);
        lhm.put("四川卫视",0.13);
        System.out.println(lhm);
//        Map常见API
//        put添加和修改，返回修改前的值
//        remove根据key删除，返回被删除的元素
//        clear清空集合
//        containsKey判断集合中是否包含指定的key
//        containsValue判断集合中是否包含指定的value
//        isEmpty判断集合是否为空
//        size获取集合大小
        showMap();
    }
//    Map常见方法
    public static void showMap(){
        Map<String,String> map = new HashMap<>();
        String value = map.put("张三", "成都");
        System.out.println( value);
        value = map.put("张三", "武汉");
        System.out.println( value);
        boolean empty = map.isEmpty();
        System.out.println( empty);
        int size = map.size();
        System.out.println( size);
        boolean key = map.containsKey("张三");
        System.out.println( key);
        boolean value1 = map.containsValue("武汉");
        System.out.println( value1);
        String removed = map.remove("张三");//返回被删除的元素
        System.out.println( removed);
        boolean removed1 = map.remove("张三", "武汉");//根据键值对删除，返回是否删除成功
        System.out.println( removed1);
        map.clear();
        System.out.println( map);
    }
}
