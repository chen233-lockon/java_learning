package com.learn.j4_method;

public class MethodDemo01 {
    public static void main(String[] args) {
//        练习一
        System.out.println(sum(10, 20));
        System.out.println(getMin(10, 20, 30));
        printInfo("张三", 18, 1.80, "男");
    }
    public static double sum(double a,double b){
        return a+b;
    }
    public static int getMin(int a,int b,int c){
        return a<b?(a<c?a:c):(b<c?b:c);
    }
    public static void printInfo(String name,int age,double height,String gender){
        System.out.println("姓名:" + name + "年龄:" + age + "身高:" + height + "性别:" + gender);
    }
}
