package com.learn.j7_algorithm;

import java.util.Scanner;

public class AlgorithmDemo03 {
    public static void main(String[] args) {
//        二路归并找中位数
//    给定两个正序数组，合并后寻找中位数
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6};
        int [] arr3 =getSumArr(arr1, arr2);
        for (int i = 0; i < arr3.length; i++) {
            System.out.print(arr3[i] + " ");
        }
        System.out.println();
        if(arr3.length % 2 == 0){
            int index1 = arr3.length/2;
            int index2 = arr3.length/2 -1;
            System.out.println((arr3[index1] + arr3[index2])/2.0);
        }
        else{
            int index = arr3.length/2;
            System.out.println(arr3[index]);
        }

    }
    public static int[] getSumArr(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];
        int i = 0,j = 0,k = 0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i] <= arr2[j]){
                arr3[k] = arr1[i];
                i++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
            }
            k++;
        }
        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j < arr2.length){
            arr3[k] = arr1[j];
            j++;
            k++;
        }
        return arr3;

    }
}
