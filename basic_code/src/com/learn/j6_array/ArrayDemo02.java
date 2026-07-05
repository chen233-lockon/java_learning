package com.learn.j6_array;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayDemo02 {
    public static void main(String[] args) {
//        数组动态初始化
//        创建数组的时候指定长度、由系统分配初始值
//        数据类型 数组名[] = new 数据类型[长度]
//        系统分配默认值
        int[] arr = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("请输入第%d个数字:",i+1);
            try {
                arr[i] = sc.nextInt();
            }catch (InputMismatchException e){
                System.out.println(e.getMessage());
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        数字常见问题:索引越界
//        0~length()-1
//        int[] arr1 = {10,20,30,40,50};t
//        ArrayIndexOutOfBoundsException：数组越界
//        System.out.println(arr1[10]);
    }
}