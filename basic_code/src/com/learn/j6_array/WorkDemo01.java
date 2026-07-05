package com.learn.j6_array;

import java.util.Random;
import java.util.Scanner;

public class WorkDemo01 {
//    要求使用随机数填充数组，
//    产生10个1-100之间的随机数，并找出最大值、最小值、总和、平均值。
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        getMaxMin(arr);
        getSumAvg(arr);
    }
    public static void getMaxMin(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println("最大值是:" + max + " 最小值是:" + min);
    }
    public static void getSumAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("和值是:" + sum + " 平均值是:" + sum / arr.length);
    }
}

