package com.learn.j4_method;

public class MethodDemo03_exercise02 {
    public static void main(String[] args) {
//        遍历数组[2,3,4,5,6,7,8,9]
        int[] arr = {2,3,4,5,6,7,8,9};
        getLiterate(arr);
    }
    public static void getLiterate(int[] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.print("]");
    }
}
