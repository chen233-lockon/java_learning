package com.learn.oop.oopprogressXPolymorphism.HomeWork;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public  void show(){
        System.out.println("长方形的宽是：" + width + "，高是：" + height);
    }

    @Override
    public void calculateArea() {
        System.out.println("长方形的面积为:" + width * height);
    }

    @Override
    public void calculatePerimeter() {
        System.out.println("长方形的周长为:" + 2 * (width + height));
    }
}
