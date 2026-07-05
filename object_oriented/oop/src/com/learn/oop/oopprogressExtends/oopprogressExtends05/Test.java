package com.learn.oop.oopprogressExtends.oopprogressExtends05;

public class Test {
    public static void main(String[] args) {
//        练习 方法重写的练习（计算商品价格）
//        某电商项目售卖智能设备，智能设备包括：手机，笔记本电脑，平板
//        1，所有的智能设备有以下属性：商品名，商品价格
//           行为：计算商品价格：
//                [ 0 ~ 1000 ) 元，不打折
//                [ 1000 ~ 5000 ) 元，9折
//                [ 5000 ~ 10000 ) 元，8折
//                超出10000 元，7折
//        2，手机享受额外补贴，在原有的基础上基础打9折。
//        3，笔记本电脑和平板电脑没有不享受额外补贴。
//        创建
        Phone p = new Phone();
        p.name = "小米";
        p.price = 4999;
        System.out.println(p.countPrice());
        System.out.println("---------------");
        Laptop p1 = new Laptop();
        p1.name = "MacBook";
        p1.price = 9999;
        System.out.println(p1.countPrice());
        System.out.println("---------------");
        Computer c = new Computer();
        c.name = "华硕";
        c.price = 8999;
        System.out.println(c.countPrice());
    }
}
