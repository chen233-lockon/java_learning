package oo_02Lambda;
// JDK8新增的一种语法形式，它以函数的形式表示对象，语法格式为：（参数列表）->{方法体}。
// 仅仅用于替代函数式接口（只有一个抽象方法）的匿名内部类对象，简化匿名内部类的写法，让程序更简洁。
//有且仅有一个抽象方法的接口可以有其他非抽象方法。的接口叫做函数式接口，通常会有@FunctionalInterface注解

import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
//注意事项：
//        参数类型全部可以省略不写。
//        如果只有一个参数，参数类型省略的同时“()”也可以省略，但多个参数不能省略“()”
//        如果Lambda表达式中只有一行代码，大括号可以不写，同时要省略分号“;”如果这行代码是return语句，也必须去掉return。
//        String[] arr = {"apple", "banana", "cherry"};
//        Arrays.sort(arr, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length() - o2.length();
//            }
//        });
//        // 使用lambda表达式
//        Arrays.sort(arr,(o1,o2) -> o1.length() - o2.length());
//        for (String string : arr) {
//            System.out.println(string);
//        }
        Calculator c = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        Calculator c1 = (a,b) -> a + b;
        System.out.println(c.calculate(1, 2));
        System.out.println(c1.calculate(2, 3));
    }
}
