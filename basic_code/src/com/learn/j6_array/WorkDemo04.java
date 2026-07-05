package com.learn.j6_array;

public class WorkDemo04 {
    public static void main(String[] args) {
//        筛选大于平均值的元素，编写一个方法，
//        返回整型数组中所有大于平均值的元素（返回新数组）。
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] result = getGreatAvg(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
    public static int[] getGreatAvg(int[] arr){
        int index = 0;
        int aver = getAvg(arr);
        System.out.println( aver);
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > aver){
                index ++;
            }
        }
        int[] result = new int[index];
        index = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > aver){
                result[index] = arr[i];
                index ++;
            }
        }
        return result;
    }
    public static int getAvg(int[] arr){
        int sum =0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
