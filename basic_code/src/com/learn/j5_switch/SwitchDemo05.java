package com.learn.j5_switch;

import java.util.Random;
import java.util.Scanner;

public class SwitchDemo05 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
//        int rValue = r.nextInt(100) + 1;//或者
        int rValue = r.nextInt(0, 100) + 1;
        int count = 1;
        while (true) {
            System.out.println("请输入您猜的数字:");
            int num = sc.nextInt();
            if (num > rValue) {
                System.out.println("猜大了");
                count++;
            } else if (num < rValue) {
                System.out.println("猜小了");
                count++;
            } else {
                System.out.println("恭喜你猜对了,猜了" + count + "次");
                break;
            }
        }
    }

}
