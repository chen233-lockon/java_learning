package com.learn.J3_operator;

import java.util.Scanner;

public class OperatorDemo6 {
    public static void main(String[] args) {
//        自增自减运算符++，--，没单独使用时注意位置
//        赋值运算符=，+=,-=,*=,/=,%=运算符优先级最低//隐含了强制类型转换
//        比较运算符==，!=，>，<，>=，<=
//        练习一：键盘录入两个数据表示我和我哥们的身高，判断我和我哥们谁高
        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入我的身高：");
//        double myHeight =sc.nextDouble();
//        System.out.println("请输入我好大儿的身高：");
//        double sonHeight =sc.nextDouble();
//        System.out.println(myHeight >= sonHeight);
//        if (myHeight >= sonHeight){
//            System.out.println("我高");
//        }else{
//            System.out.println("我的好大儿高");
//        }
////        键盘录入一个数据，判断该数据是否为3的倍数
//        Scanner sc1 = new Scanner(System.in);
//        System.out.println("请输入一个数据：");
//        int num = sc1.nextInt();
//        if (num % 3 == 0) {
//            System.out.println("该数据是3的倍数");
//        }else{
//            System.out.println("该数据不是3的倍数");
//        }
////        逻辑运算符：&，|，!，^(异或)java不能1<a<10连写python可以
////        短路逻辑运算符：&&，||，可以减少运算次数&&第一个为假时直接为假，||第一个为真时直接为真
////        键盘录入一个四位数，判断该数是否是回文数
//        Scanner sc2 = new Scanner(System.in);
//        System.out.println("请输入一个四位数：");
//        int num1 = sc2.nextInt();
//        //判断是否是回文数
//        int a = num1%10;
//        int b = num1/10%10;
//        int c = num1/100%10;
//        int d = num1/1000%10;
//        boolean result =  a == d && b == c;
//        System.out.println(result);
////       输入一个两位数，判断该数是否是7的有缘数，即带7或者7的倍数
//        Scanner sc3 = new Scanner(System.in);
//        System.out.println("请输入一个两位数：");
//        int num2 = sc3.nextInt();
//        boolean res1 = num2%10 == 7 || num2/10 == 7 || num2%10 == 0;
//        System.out.println(res1);
//        三元运算符 (表达式)?ture:false
        System.out.println("请输入两个数，用三元运算符比较大小：");
        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        System.out.printf("%d和%d中，较大的是:",a1,b1);
        System.out.println(a1 > b1?a1:b1);
        System.out.println("---------------");
        int a = 10;
        int b = 20;
        int c = 30;
        int d = (a>b?a:b)>c?(a>b?a:b):c;
        int e = a>b?(a>c?a:c):(b>c?b:c);
        System.out.println("最大值为:" + d + "----" + e);
//        优先级
//        &>^>|>&&>||>?:
    }
}
