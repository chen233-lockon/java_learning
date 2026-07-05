package com.learn.j6_array;

public class ArrayDemo01 {
    public static void main(String[] args) {
//        数组存储是连续的空间，定义完成长度不可变
//        null代表空指针引用类型的空
//      1.数组的静态初始化
//        int arr[] = new int[]{1,2,3}完整写法
//        简写：int arr[] = {1,2,3}(C和C++的方式)、int[] arr = {4,5,6}（JAVA推荐）
        double[] studentHeight = {170,158,169};
        int[] studentAge = {17,15,16};
        String[] studentName = {"张三","李四","王五"};
        System.out.println(studentAge[0]);
        System.out.println(studentName[0]);
        System.out.println(studentHeight[0]);
        System.out.println("-------------");
//      2.数组的元素访问
        System.out.println(studentName[0]);
        studentName[0] = "赵六";
        System.out.println(studentName[0]);
        System.out.println("-------------");
//      3.数组的遍历
        int[] arr = {10,20,30,40,50};
        //快速创建 数组名.fori + enter
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
//        for (int j : arr) {
//            System.out.println(j);
//        }
    }
}
