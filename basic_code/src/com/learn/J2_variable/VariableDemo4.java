package com.learn.J2_variable;

import java.util.Scanner;

public class VariableDemo4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        double w = sc.nextDouble();
        System.out.println("你的BMI为：" + w/(h*h) );
    }
}
