package com.learn.oop.oopprogress02;

public class Circle {
    private double raduis;
    private final double PI = 3.1415926;

    public Circle() {
    }

    public Circle(double raduis) {
        this.raduis = raduis;
    }
//默认没有生成setPI方法，因为PI是final的，不能被修改
    public double getPI() {
        return PI;
    }

    public double getRaduis() {
        return raduis;
    }

    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }
//    计算周长和面积
    public double getCircleArea(double r){
        return PI*r*r;
    }
    public double getCirclePerimeter(double r){
        return 2*PI*r;
    }
}
