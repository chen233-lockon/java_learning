package com.learn.oop.oopprogressExtends.oopprogressExtends02;

public class ExtendsTest02 {
//    1.利用画图画出继承关系
//    2.分类
//    3.抽取共性的内容向上抽取，且父类能代表所有子类
    public static void main(String[] args) {
        Android a = new Android();
        a.brand = "小米";
        a.price = 1999;
        System.out.println(a.brand + "," +a.price);
        a.Nfc();
        a.Call();
        a.SendMessage();
        System.out.println("__________");
        IOS ios = new IOS();
        ios.brand = "苹果";
        ios.price = 9999;
        System.out.println(ios.brand + "," +ios.price);
        ios.Call();
        ios.SendMessage();
        System.out.println("__________");
        Computer c = new Computer();
        c.brand = "华硕";
        c.price = 8999;
        System.out.println(c.brand + "," +c.price);
        c.Program();

    }
}
