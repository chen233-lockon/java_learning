package com.learn.oop.oopprogressYInnerClass.Test04;

//局部内部类LOCAL INNER CLASS，定义在方法内部,类似局部变量
//     外界无法使用，需要在方法内部创建对象使用
//     该类可以直接访问外部类的成员，也可以访问方法内的局部变量
public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.show();
    }
}
