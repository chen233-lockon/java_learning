package com.learn.oop.oopprogressXInterface.HomeWork01;

public interface Calculator {
    int add(int a, int b);
    default void  printResult(int result){
        System.out.println("结果为:" + result);
    };

}
