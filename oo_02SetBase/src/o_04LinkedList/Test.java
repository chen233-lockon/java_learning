package o_04LinkedList;

import java.util.LinkedList;

public class Test {
    public static void main(String[] args) {
//        ArrayList 底层是Object数组,所以增删慢,查询快
//        LinkedList 底层是双链表,所以增删首尾快,查询慢,假索引
//       void addFirst(e);//列表开头添加
//       void addLast(e);
//       E getFirst();
//       E getLast();
//       E removeFirst();
//       E removeLase();
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("张三");
        list.addFirst("李四");
        list.addFirst("王五");
        list.addFirst("赵六");
        System.out.println("----------");
        System.out.println(list);
        System.out.println("------------");
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println("-------------");
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());


    }
}
