package com.learn.J2_variable;

import java.util.Scanner;//引入Scanner

public class VariableDemo3 {
    public static void main(String[] args) {
        //        键盘录入：
//            1.找到Scanner方法
        Scanner sc = new Scanner(System.in);
//            2.让Scanner干活
//    接收键盘录入的整数
        int num = sc.nextInt();
        System.out.println(num);
//    接收键盘录入的小数
        double num2 = sc.nextDouble();
        System.out.println(num2);
//    接收键盘录入的字符串
        String str = sc.next();//直接next
        System.out.println(str);
    }
}
