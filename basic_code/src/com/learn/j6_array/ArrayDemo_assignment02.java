package com.learn.j6_array;

public class ArrayDemo_assignment02 {
    public static void main(String[] args) {
//        合并有序数组,合并后的大数组也有序
        int[] arr1 = {1,3,5,7,9};
        int[] arr2 = {2,4,6,8,10};
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
        while (i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }
        for (int i1 = 0; i1 < arr3.length; i1++) {
            System.out.println(arr3[i1]);
        }
    }
}
