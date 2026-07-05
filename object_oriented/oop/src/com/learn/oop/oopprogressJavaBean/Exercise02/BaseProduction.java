package com.learn.oop.oopprogressJavaBean.Exercise02;

public class BaseProduction {
    private String name;
    private double price;

    public BaseProduction() {
    }

    public BaseProduction(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public  void showInfo(){
        System.out.println("商品名称:" + this.name + "\n商品价格:" + this.price);
    }
}
