package o_07Map;


import java.util.Map;
import java.util.TreeMap;

//底层原理
//Set的底层就是Map，只用键，没用值
//TreeMap:红黑树
//HashMap:哈希表(数组、链表、红黑树),链表长度超过8，且数组初始为（16）扩容(2倍)过两次（长度超过64），自动将链表转成红黑树
//封装成Entry对象，利用key的hashCode和equals方法(为true更新数据)进行判断，JDK8以前是头插法，以后是尾插法
//LinkedHashMap:哈希表(数组、链表、红黑树) + 双链表
public class TestMapsDemo03 {
    public static void main(String[] args) {
        String s = "aababcabcdabcde";
        Map<Character, Integer> counted = countChars(s);
        counted.forEach((k,v)-> System.out.println(k + "(" + v + ")"));
    }
    public static Map<Character, Integer> countChars(String s){
        Map<Character,Integer> map = new TreeMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c,1);
            }else{
                Integer count = map.get(c);
//               重新设置值
                map.put(c,++count);
            }
        }
        return map;
    }
}
