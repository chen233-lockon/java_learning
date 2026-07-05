package com.learn.oop.oopbase.oopbase04;

public class Phone {
    private String brand;
    private String color;
    private double price;
//    this 关键字用来访问本类属性，区别成员和局变量
//    this就是本类对象(所在方法调用者的内存地址)
//    没有使用this，局部变量和成员变量同名时，就近原则
//    无参数构造函数
    public Phone(){
        this.brand = "小米17";//手动设置默认值，不然为null
        this.color = "小米白";
        this.price = 4999;//手动设置默认值，不然为0
    }
//     全参数的构造函数
    public Phone(String brand,String color,double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
//    品牌
    public void setBrand(String b){
        this.brand = b;
    }
    public String getBrand(){
        return this.brand;
    }
//    颜色
    public void setColor(String c){
        this.color = c;
    }
    public String getColor(){
        return this.color;
    }
//    价格
    public void setPrice(double p){
        this.price = p;
    }
    public double getPrice(){
        return this.price;
    }
//    打电话
    public void Call(){
        System.out.println(this.price +"块的"+this.brand + "(" +this.color+")"+"正在打电话");
    }
//    发短信
    public void SendMessage(){
        System.out.println(this.price +"块的"+this.brand + "(" +this.color+")"+"正在发短信");
    }
//    打印this值
    public void printThis(){
        System.out.println(this);
    }
}
