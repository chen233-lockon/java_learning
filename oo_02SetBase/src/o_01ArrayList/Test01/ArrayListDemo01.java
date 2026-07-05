package o_01ArrayList.Test01;

import java.util.ArrayList;

//ArrayList
public class ArrayListDemo01 {
    public static void main(String[] args) {
//        ArrayList长度可变原理，底层还是数组
//        1.当创建ArrayList集合容器时，底层存在一个长度为10的空数组。现在已经变成空的Object[]，懒加载用的时候调用grow()方法扩容为10或者当前传元素的长度
//        2.扩容时扩容原数组的1.5倍的新数组，再将老数组7拷贝过来。
//        一、
//        1、new创建,不推荐
        test1();
//        2、泛型创建//推荐,限制数据类型，提高安全性
        test2();
//        二、ArrayList 集合常用成员方法
//      public boolean  add()//添加元素到尾部，源码恒为true
//        不能跳索引，会报IndexOutOfBoundsException
//      public void add(index,element)//在指定位置添加元素
//      public E get(index)//返回指定索引的元素0~size()-1
//      public int size()//返回集合元素的个数
//      public E remove(index)//删除指定索引的元素并返回
//      public Boolean remove(Object)//删除指定的元素，返回是否成功
//      public E set(index,element)//修改指定位置的元素，返回被修改的元素
        test3();

    }

    private static void test3() {
        ArrayList<String> list3 = new ArrayList<>();
        list3.add("张三");
        list3.add("李四");
        list3.add("王五");
        System.out.println(list3.get(1));
        System.out.println(list3.size());
        //遍历集合
        System.out.println("------------------");
        for (int i = 0; i < list3.size(); i++) {
            System.out.println(list3.get(i) + " ");
        }
        System.out.println("------------------");
        String remove = list3.remove(0);
        System.out.println( remove);
        boolean isSuccess = list3.remove("李四");
        System.out.println(isSuccess);
        System.out.println(list3.size());
        System.out.println("-----------------");
        list3.add("张三");
        list3.add("李四");
        String setted = list3.set(0, "赵六");
        System.out.println(setted);
        System.out.println(list3);

    }

    private static void test2() {
//      2、泛型创建//推荐,限制数据类型，提高安全性
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("张三");//限制类型，只能添加String类型
        list2.add("李四");
        System.out.println(list2);//重写过toString()
    }

    private static void test1() {
//        1、new
        ArrayList list1 = new ArrayList();
        //添加元素//任意类型Object
        list1.add("张三");
        list1.add(123);//包装类
        list1.add(true);
        System.out.println(list1);
    }
}
