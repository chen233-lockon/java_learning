package oo_03MethodReference;

import java.util.Arrays;
import java.util.Comparator;

//方法引用通过方法的名字来指向一个方法。
//方法引用可以使语言的构造更紧凑简洁，减少冗余代码。
//注意只能替代函数式接口的实现，和lambda表达式
//方法引用使用一对冒号 ::
//工厂方法设计模式:将对象的创建延迟到子类
//构造器引用：它的语法是Class::new，或者更一般的Class< T >::new
//静态方法引用：它的语法是Class::static_method
//特定类的任意对象的方法引用：它的语法是Class::method
//特定对象的方法引用：它的语法是instance::method，先创建对象
//String类中的方法引用，它的语法是String::method
public class Test {
    public static void main(String[] args) {
        // 示例：使用方法引用来替代 Lambda 表达式

        // 原始 Lambda 表达式写法：
        // Arrays.sort(arr, (a, b) -> Integer.compare(a, b));

        // 方法引用写法（更简洁）：
        // Arrays.sort(arr, Integer::compare);

        // 演示代码
        int[] arr = {5, 2, 8, 1, 9};

        // 使用 Lambda 表达式
//         Arrays.sort(arr, (a, b) -> Integer.compare(a, b));

        // 使用方法引用 - 等价于上面的 Lambda
//        Arrays.sort(arr, Integer::compare);

        // 输出排序结果
        for (int num : arr) {
            System.out.print(num + " ");
        }
//        引用printLn
        System.out.println("printLn");
//        Runnable runnable = System.out::println;
//        System.out.println(runnable);
//        String类中的方法引用，它的语法是String::method
//        不区分大小写排序,compareToIgnoreCase方法,compareTo方法不区分大小写
        String[] arr1 =  {"Apple", "Banana", "Cherry", "apple", "banana", "cherry"};
//        区分大小写排序,注意倒序(主调改变)的话不能替换为方法引用
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));
//        Arrays.sort(arr1, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.compareToIgnoreCase(o2);
//            }
//        });
//        Arrays.sort(arr1, (o1, o2) -> o1.compareToIgnoreCase(o2));
//        因为主调o1是String的compareToIgnoreCase方法o2是实参,所以引用String类中的方法
        Arrays.sort(arr1,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(arr1));
    }
}

