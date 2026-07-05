package com.learn.j6_array;

public class WorkDemo03 {
    public static void main(String[] args) {
//        定义一个方法，将整型数组反转（例如{1, 2, 3} → {3, 2, 1}）。
//        要求：方法签名：public static void reverseArray(int[] arr)
//        不能使用额外数组
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        reverseArray(arr);

    }
    public static void reverseArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

