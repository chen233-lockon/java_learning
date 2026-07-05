package com.learn.j6_array;

import java.util.Random;

public class ArrayDemo03_exercise03 {
    public static void main(String[] args) {
//        已知数组，要求打乱数组
//        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        前置练习，交换变量中的值
//        int a = 10;
//        int b = 20;
//        int c;
//        c = a;
//        a = b;
//        b = c;
//        System.out.println( a);
//        System.out.println( b);
//        第一步：
//        0索引上的值与随机位置上的数据交换
//        第二步：
//        1索引上的值与随机位置上的数据交换，直到数组末尾
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
//        定义随机数
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
//            获取随机索引
            int randomIndex = r.nextInt(arr.length) ;//参数为取值范围(0~len-1)，不包含该参数
            int temp = arr[i];
            arr[i] = arr[randomIndex];
            arr[randomIndex] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
