package com.learn.j7_algorithm;

import java.util.Random;
import java.util.Scanner;

public class AlgorithmDemo02 {
    public static void main(String[] args) {
//        红包问题(一根绳子M长，切N-1刀,切成N段)
//        每个人至少分一分钱
//        每个人分完后，余额至少为1*(N-1)分钱
//        最后一个人直接拿最后的余额
//        int total = 4;//分
//        int num = 5;//人数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入红包总金额:");
        int total = sc.nextInt() * 100;
        System.out.println("请输入参与人数:");
        int num = sc.nextInt();
        Random r = new Random();
        if(total >= num){
            for (int i = 1; i <= num-1; i++) {
//            获取随机数单个红包
//            减去n-i是为了给后面的人预留几分钱， +1是因为范围从零开始
                int money = r.nextInt(total-(num-i)) +1;
                total -= money;
                System.out.println("第" + i +"个人获得了:" + money +"分钱");
            }
            System.out.println("第" + num +"个人获得了:" + total +"分钱");
        }else{
            System.out.println("红包金额不够,请充值");
        }
    }
}
