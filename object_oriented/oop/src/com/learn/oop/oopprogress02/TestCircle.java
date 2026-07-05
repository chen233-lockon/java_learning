package com.learn.oop.oopprogress02;

public class TestCircle {
    public static void main(String[] args) {
        Circle c1 = new Circle(1.5);
//        获取成员变量
        System.out.println(c1.getRaduis());
        System.out.println(c1.getPI());
//        方法
        System.out.println(c1.getCircleArea(c1.getRaduis()));
        System.out.println(c1.getCirclePerimeter(c1.getRaduis()));
    }

}
