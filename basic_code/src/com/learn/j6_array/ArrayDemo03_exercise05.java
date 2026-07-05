package com.learn.j6_array;

public class ArrayDemo03_exercise05 {
    public static void main(String[] args) {
//        快慢指针(不是c语言的指针，只是变量)
//        慢指针：存储数据的索引位置
//        快指针：找不重复的数据
//        如果快指针的元素和慢指针的元素相同，则舍弃该快指针位置数据(快指针++)
//        如果不等于慢指针的元素，(则慢指针++,将快指针的元素赋给慢指针)(然后快指针++继续查找)
//        给定义的递增有序数组，去除重复的元素
        int[] arr = {1,2,2,3,3,3,4,4,5,5,6,6,7,8,8,8,9,10,10};
        int slot = 0;
//        for (int fast = 1; fast < arr.length;) {
//            if(arr[fast] == arr[ slot]){
////                快指针++
//                fast++;
//            }
//            else{
//                slot++;
//                arr[slot] = arr[fast];
//                fast++;
//            }
//        }
//        todo优化版本
        for (int fast = 1; fast < arr.length;fast++) {
            if(arr[fast] != arr[slot]){
                arr[++slot] = arr[fast];
            }
        }
//        遍历输出
        for (int i = 0; i < slot+1; i++) {
            System.out.println(arr[i]);
        }
    }
}
