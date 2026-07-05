package com.learn.oop.oopprogressExtends.oopprogressExtends06;

public class ObjectTest {
    public static void main(String[] args) {
//        所有类都继承Object类
//        Object的toString方法是返回对象的地址值,效果和打印对象名一样
//        (打印对象时，会调用toString方法)
//        现在重写toString方法，返回当前类的数据,打印对象时，会调用toString方法
    Student student = new Student();
        student.name = "小王";
        student.age = 18;
        System.out.println(student);
        System.out.println(student.toString());
    }
}
