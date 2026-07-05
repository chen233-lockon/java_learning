package com.learn.oop.oopprogressJavaBean.Exercise02;

public class ClothProduction extends BaseProduction {
    private String size;
    private String color;

    public ClothProduction() {

    }

    public ClothProduction(String name, double price, String size, String color) {
        super(name, price);
        this.size = size;
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void showInfo() {
        System.out.println("ClothProduction信息:" + this.getName() + "," + this.getPrice() + "," + this.size + "," + this.color);
    }
}
