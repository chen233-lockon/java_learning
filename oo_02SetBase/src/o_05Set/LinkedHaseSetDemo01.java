package o_05Set;

import java.util.LinkedHashSet;

//LinkedHashSet基于哈希表和双链表，但是额外多了给双链表的机制记录前后元素位置有序
//保证存取顺序
public class LinkedHaseSetDemo01 {
    public static void main(String[] args) {
        LinkedHashSet<Person> lhs = new LinkedHashSet<>();
        lhs.add(new Person("张三", 18));
        lhs.add(new Person("李四", 20));
        lhs.add(new Person("王五", 19));
        lhs.add(new Person("张三", 18));
        System.out.println(lhs);

    }
}
