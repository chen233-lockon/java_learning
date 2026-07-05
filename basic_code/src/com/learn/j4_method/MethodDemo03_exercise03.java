package com.learn.j4_method;

public class MethodDemo03_exercise03 {
    public static void main(String[] args) {
//        打印99乘法表
        printMultiply();
    }
    public static void printMultiply(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d*%d=%d ",j,i,i*j);
            }
            System.out.println();
        }
    }
}
