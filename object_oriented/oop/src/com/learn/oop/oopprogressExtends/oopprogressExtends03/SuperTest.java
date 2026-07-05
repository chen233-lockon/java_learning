package com.learn.oop.oopprogressExtends.oopprogressExtends03;
//继承中成员变量的特点
//就近原则,先找局部，再找本类，再找父类，逐级望上，直到Object没有就报错
public class SuperTest {
    public static void main(String[] args) {
        Zi zi = new Zi();
        zi.ziShow();
    }
}
class  Ye{
    String name = "YE";
}
class Fu extends Ye{
    String name = "FU";
    String address ="南京";
}
class  Zi extends Fu{
    String name = "ZI";

    public  void ziShow(){
        String name = "ZiShow";
//        就近原则，使用this和super去访问本类或父类的属性
        System.out.println( name);//ZiShow
        System.out.println(this.name);//ZI
        System.out.println(super.name);//FU
//        super只能访问直接父类的属性，
//        System.out.println(super.super.name);//YE
        System.out.println("-------练习-----");
        //要求：输出ZI
//        如果没有局部变量name可以直接，name访问
        System.out.println(this.name);
        //要求：输出FU
        System.out.println(super.name);
        //要求：输出南京
        System.out.println(address);
//        this先访问本类属性，没有则访问父类属性
        System.out.println(this.address);
        System.out.println(super.address);


    }
}
