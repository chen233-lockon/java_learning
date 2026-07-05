package com.learn.j4_method;

import java.util.Random;

public class MethodDemo03_exercise01 {
    public static void main(String[] args) {
//        需求:获取10个1~100之间的随机数并存入到数组中，保证数据唯一
        int[] arr = getRandomArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static int[] getRandomArray(){
        int[] arr = new  int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; ) {
            int num = r.nextInt(100) + 1;//加一是因为0~99 + 1 = 1~100
            boolean flag = contain(num, arr);
            if(!flag){
                arr[i] = num;
                i++;
            }
        }
        return arr;
    }
    public static boolean contain(int num,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(num == arr[i]){
                return true;
            }
        }
        return false;
    }
}

