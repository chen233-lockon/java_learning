package com.learn.J3_operator;

import java.util.Scanner;

public class OperatorDemo1 {
     public static void main(String[] args) {
//        java注意点：两个整数除法结果为整数（python中/运算的为浮点数），精度不准确
//        数字拆分公式：
//        个位：数字%10
//        十位：数字/10%10
//        百位：数字/100%10
//        千位：数字/1000%10
//        万位：数字/10000%10
        Scanner sc = new Scanner(System.in);//alt + enter 引入Scanner类
        int num = sc.nextInt();
        int a = num/100%10;
        int b = num/10%10;
        int c = num%10;
        //加号作为字符串拼接符
        System.out.println("您输入的数为：" + num + "，个位为：" + c + "，十位为：" + b + "，百位为：" + a);
//        alt + p强制弹出参数提示
    }
}
