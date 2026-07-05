package o_02Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

//单列集合Collection接口,包含List(有序 有索引 可重复)接口和Set(无序 没有索引 不可重复)接口,共同方法add();
//双列集合Map接口,包含Map接口,共同方法put();
public class Test {
//    Collection  List(ArrayList,LinkedList) Set(HashSet,LinkedHashSet(有序),TreeSet)
//    add方法
public static void main(String[] args) {
    Collection<String> list = new ArrayList<>();//多态
    list.add("张三");
    list.add("李四");
    list.add("王五");
    System.out.println(list);
    System.out.println(list.size());
    System.out.println(list.isEmpty());
//    contains判断集合中包不包含某个对象
    System.out.println(list.contains("张三"));
//    remove删除某个对象,依据索引删除是ArrayList特有的方法
    System.out.println(list.remove("张三"));
    list.removeIf(new Predicate<String>() {
        @Override
        public boolean test(String s) {
            return "张三".equals(s);
        }
    });//快捷删除
    list.clear();//清空集合
//    删除和包含底层会使用equals
//  注意:集合里面一般要重写equals方法,比较数据,而不是地址
//    通用Collection遍历方法
//    1.迭代器Iterator
    System.out.println("----------遍历----------");
    Collection<String> list1 = new ArrayList<>();
    list1.add("张三");
    list1.add("李四");
    list1.add("王五");
    list1.add("赵六");
//    1.1获取迭代器对象
        Iterator<String> it = list.iterator();
//    while循环遍历
    while(it.hasNext()){//1.2判断指针是否为size
//        1.3获取数据,并将指针后移一位
        String a = it.next();
        System.out.println(a);
    }
//    2.增强for循环(语法糖)字节码中仍然是迭代器
//    for (String a : list) {
//        System.out.println(a);
//    }
//    3.forEach方法,集合自带,本质还是迭代器
//    Consumer<String> consumer = new Consumer<>() {
//        @Override
//        public void accept(String str) {//就是当前遍历到的元素
//            System.out.println(str);
//        }
//    };
//    Consumer<String> consumer = str -> System.out.println(str);
//    Consumer<String> consumer = System.out::println;
    list.forEach(System.out::println);
}
}
