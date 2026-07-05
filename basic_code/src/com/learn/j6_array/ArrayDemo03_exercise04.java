package com.learn.j6_array;

import java.util.Random;

public class ArrayDemo03_exercise04 {
    public static void main(String[] args) {
//        数组去重
//        需求:获取10个1~100之间的随机数并存入到数组中，保证数据唯一
        int[] arr = new int[10];//默认值为0
        Random r = new Random();
//       如果存在相同的时候，会存储默认值0
        for (int i = 0; i < arr.length;) {
//            r.nextInt(100)的取值范围为0~99，+1后取值范围为1~100
            int num = r.nextInt(100) + 1;
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[j] == num){
                    count++;
                    break;
                }
            }
            if(count == 0){
                arr[i] = num;
//                当数组中添加了不重复的随机数，i才会自增1
                i++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
