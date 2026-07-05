package o_03List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

//List接口(ArrayList,LinkedList)因为有索引,所以多了很多索引相关的方法
public class Test {
    public static void main(String[] args) {
//void add(int index,E);
//E remove(int index);
//E set(int index,E);
//E get(int index);
// 通用三种,迭代器,增强for循环,forEach方法
// 加上普通for循环和ListIterator,支持倒叙
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        list.add("孙七");
        System.out.println("--------------------");
        System.out.println( list);
//       倒叙遍历
//        获取列表迭代器对象,传入最后的索引
        ListIterator<String> listIterator = list.listIterator(list.size());
        while(listIterator.hasPrevious()){//倒叙是否有前一个元素
            String a = listIterator.previous();//获取元素,并前移指针
            System.out.println(a);
        }
//  删除元素,但是索引动态变化(倒序)
//  最好用迭代器删除,ListIterator同理
        Iterator<String> it = list.iterator();
        while (it.hasNext()){
            String a = it.next();
            if ("王五".equals(a)){
//                迭代器遍历的同时list删除,触发并发修改异常
//                list.remove(a);//不能这样ConcurrentModificationException
//                应该使用迭代器的remove方法
                it.remove();
                list.add("我21");//添加也会触发并发修改异常
//                用ListIterator的add方法
            }
        }
    }
}
