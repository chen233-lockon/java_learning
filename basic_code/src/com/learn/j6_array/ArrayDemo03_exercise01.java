package com.learn.j6_array;

import java.util.Scanner;

public class ArrayDemo03_exercise01 {
    public static void main(String[] args) {
//        数组练习
//        查找数据，录入一个数据判断是否存在，
//        如果多次出现，显示第一次的索引
        int[] arr = {33,5,22,44,55,33};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你想查找的数据:");
        int data = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == data){
                System.out.println("存在，索引为:" + i);
                flag = true;
                break;
            }
//            if (i == arr.length-1) {
//                System.out.println("该数据不存在！！！");
//            }
        }
        if(!flag){
            System.out.println("该数据不存在！！！");
        }
    }
}
