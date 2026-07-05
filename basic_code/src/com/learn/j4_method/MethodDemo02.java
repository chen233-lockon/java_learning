package com.learn.j4_method;

import java.util.Scanner;

public class MethodDemo02 {
    public static void main(String[] args) {
//    方法的重载:只通过参数类型、参数个数、参数顺序来区分方法
//        键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数:");
        int b = sc.nextInt();
        int result = getMax(a,b);
        System.out.println("较大值为:" + result);
        calculateArea(3);
        calculateArea(3,4);
        calculateArea(3,4,5);
    }
// 需求：定义一个方法，方法中定义两个整数变量，求出最大值并打印在控制台
//分析：
// 根据格式编写方法，方法名自己给出 (见名知意 小驼峰命名法)
// 方法内部定义出两个 int 类型变量
// 求出最大值
// 调用该方法，让内部的逻辑执行起来
    public static int getMax(int a,int b){
        return Math.max(a, b);
    }
//    方法的重载:同一个类中只通过参数类型、参数个数、参数顺序来区分方法
//    和返回值无关，返回值类型可以不一样
//    求圆的面积
    public static void calculateArea(double r){
//        math包在java.lang包中，不需要导包，直接用
        System.out.printf("%.2f\n",Math.PI * r * r);
    }
    //    求矩形的面积
    public static void calculateArea(double h,double w){
        System.out.println(h*w);
    }
    //    求梯形的面积
    public static void calculateArea(double top,double bottom,double height){
        System.out.println((top + bottom)*height/2);
    }
}
