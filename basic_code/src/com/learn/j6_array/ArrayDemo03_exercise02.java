package com.learn.j6_array;

public class ArrayDemo03_exercise02 {
    public static void main(String[] args) {
//        求最大值
        int[] arr = {33,5,22,44,55};
//        赋值为arr[0]会多比一次,别赋值为0,一定要是数组里的数值
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxValue){
                maxValue = arr[i];
            }
        }
        System.out.println("攻击力最大的是:" + maxValue);
//        求最小值
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < minValue){
                minValue = arr[i];
            }
        }
        System.out.println("攻击力最小的是:" + minValue);
    }
}
