package o_05Set;

import java.util.HashSet;
//时间复杂度接近O(1)；
//HashSet(底层是哈希表(增删改查很好)(JDK8之前是数组加链表，之后是数组链表红黑树))
//当链表长度超过八，且数组初始为（16）扩容(2倍)过两次（长度超过64），自动将链表转成红黑树
//HashSet想要保证元素唯一，必须重写hashCode和equals方法
//如果haseCode方法返回固定的索引，所以的元素都会挂在同一索引下
//如果hash冲突，就会使用equals方法进行判断，如果返回true，则认为两个元素相等（不存）
public class HashSetDemo01 {

    public static void main(String[] args) {
        HashSet<Person> hs = new HashSet<>();
        hs.add(new Person("张三", 18));
        hs.add(new Person("李四", 20));
        hs.add(new Person("王五", 19));
        hs.add(new Person("张三", 18));
        System.out.println(hs);
    }
}
