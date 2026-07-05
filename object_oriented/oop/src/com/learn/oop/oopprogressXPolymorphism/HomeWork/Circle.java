package com.learn.oop.oopprogressXPolymorphism.HomeWork;

public class Circle extends Shape{
    private double radius;
    static final double PI = 3.14;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public  void show(){
        System.out.println("圆的半径为" + radius);
    }

    @Override
    public void calculateArea() {
        System.out.println("圆的面积为:" + PI * radius * radius);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("圆的周长为:" + 2 * PI * radius);
    }
}
