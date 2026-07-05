package com.learn.oop.oopprogressYInnerClass.Test03;

public class Outer {
    int a = 10;
    static  int b = 20;
//    静态内部类
    static class  Inner{
        public void show(){
            Outer o = new Outer();
            System.out.println(o.a);//访问外部类的非静态内容必须创建外部类对象
            System.out.println("非静态方法被调用了");
        }
        public static void showStatic(){
            System.out.println("静态方法被调用了");
        }
    }
}
