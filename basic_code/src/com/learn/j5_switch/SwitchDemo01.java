package com.learn.j5_switch;

import java.util.Scanner;

public class SwitchDemo01 {
    //    方法创建快捷键ctrl+alt+m
//    ctrl + shift + 上下键 移动代码
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入成绩：");
        int score = sc.nextInt();
        if (score >= 95 && score <= 100) {
            System.out.println("奖励自行车");
        } else if (score >= 90) {
            System.out.println("奖励游乐场");
        } else if (score >= 80) {
            System.out.println("奖励变形金刚");
        } else {
            System.out.println("奖励完整的童年");
        }
//        水仙花数
        int count = 0;
        for (int i = 100; i < 1000; i++) {
            int g = i % 10;
            int s = i / 10 % 10;
            int b = i / 100;
            if (g * g * g + s * s * s + b * b * b == i) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("个数：" + count);
//        珠穆朗玛峰8848860mm
        double mountain = 8848860;
        double paper = 0.1;
        int count1 = 0;
        while (paper < mountain){
            count1 ++;
            paper *= 2;
        }
        System.out.println("折叠次数为：" + count1);
//        do-while
        int age;
        do {

            System.out.println("请输入您的年龄:");
            age = sc.nextInt();
        } while (age < 18 || age > 100);
        System.out.println("age = " + age);
//        continue跳出本次循环，继续下次循环 和 break跳出本轮循环
    }
}