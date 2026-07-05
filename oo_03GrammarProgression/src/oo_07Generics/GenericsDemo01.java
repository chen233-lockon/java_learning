package oo_07Generics;
//认识泛型,Java中泛型只在编译器阶段有效，在运行阶段会自动擦除，不能在运行阶段访问。
//定义类、接口、方法时，同时声明了一个或者多个类型变量（如：ArrayList<E>、HashMap<K,V>），称为泛型类、泛型接口，泛型方法。
//作用：泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力！
//原理：使用泛型时会用具体的数据类型替代泛型变量
//类型变量建议用大写的英文字母，常用的有：E、T、K、V 等
//泛型只支持引用数据类型，不能使用基本数据类型（包装一下）

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo01 {
    public static void main(String[] args) {
//        通配符和上下限
//        “?” ，可以在“使用泛型”的时候代表一切类型；
//        E T K V 是在定义泛型的时候使用。
// 泛型上限:    <? extends Animal>:  ? 代表能接收的必须是Animal或者其子类 。
// 泛型下限：  <? super Dog> :  ? 代表能接收的必须是Dog或者其父类。
List<Animal> list = new ArrayList<>();
List<Dog> list2 = new ArrayList<>();
    }
    public static<T> void printList(List<?  extends Animal > list){
        System.out.println( list);
//        上限集合
//        读无限制，写都不能写
    }
    public static<T> void printList2(List<? super Dog> list){
        System.out.println( list);
//        下限集合
//        读无限制，写有限制且只能写Dog，父类不能写
    }
}
