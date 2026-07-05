package com.learn.j6_array;

import java.util.Scanner;

public class ArrayDemo_assignment01 {
    public static void main(String[] args) {
//        给定一个整数数组nums和一个目标整数target，
//        请你在该数组中找出和为目标值的那两个整数的第一组，并返回它们的数组下标。
        int[] nums = {3,7,2,15,4,6,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int target = sc.nextInt();
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if(flag){
                break;
            }
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    System.out.println(i+","+j);
                    flag = true;
                    break;
                }
            }
        }
        if (!flag){
            System.out.println("没有找到");
        }
    }
}
