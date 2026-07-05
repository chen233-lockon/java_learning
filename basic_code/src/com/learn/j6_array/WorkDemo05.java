package com.learn.j6_array;

import java.util.Scanner;

public class WorkDemo05 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入班级的人数:");
        int num = sc.nextInt();
        double[] arr = new double[num];
        for (int i = 0; i < num; i++) {
            System.out.println("请输入第" + (i+1) +"个人的分数:");
            arr[i] = sc.nextDouble();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
