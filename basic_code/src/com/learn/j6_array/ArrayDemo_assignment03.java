package com.learn.j6_array;

import java.util.Scanner;

public class ArrayDemo_assignment03 {
    public static void main(String[] args) {
//        给定一个递增有序数组和一个目标值，
//        查找目标值是否在数组中，如果在打印索引，否则打印应该插入的索引位置
        int[] arr = {1,3,5,7,9};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length;i++) {
            if(arr[i] == target){
                System.out.println(i);
                break;
            }
            if(arr[i] > target){
                System.out.println(i);
                break;
            }
            if(i == arr.length-1){
                System.out.println(i+1);
            }
        }
    }
}
