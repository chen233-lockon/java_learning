package com.learn.oop.oopprogressJavaBean.Exercise02;

public class ElectronicProducts extends BaseProduction{
    private String brand;
    private String type;

    public ElectronicProducts() {

    }

    public ElectronicProducts(String name, double price, String brand, String type) {
        super(name, price);
        this.brand = brand;
        this.type = type;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void showInfo() {
        System.out.println("商品名称:" + this.getName() + "\n商品价格:" + this.getPrice() + "\n商品品牌:" + this.brand + "\n商品类型:" + this.type);
    }
}
