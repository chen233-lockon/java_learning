package com.learn.oop.oopprogressYInnerClass.Test03;
//静态内部类，内部类使用static修饰
public class test {
    public static void main(String[] args) {
//      1.静态内部类只能访问外部类中的静态变量和静态方法
//      2.如果在静态内部类想要访问外部类的非静态内容，需要创建外部类的对象
//      3.创建静态内部类的对象
//        outer.inner 对象名 = new Outer.Inner();
        Outer.Inner oi = new Outer.Inner();
        //调用内部类的非静态方法
        oi.show();
//        调用内部类的静态方法 类名.方法名推荐
        Outer.Inner.showStatic();
    }
}
