package com.learn.oop.oopprogressExtends.oopprogressExtends06;

public class Student {
    String name;
    int age;
    public void study(){
        System.out.println("学习");
    }
////        所有类都继承Object类
////        Object的toString方法是返回对象的地址值
////        现在重写toString方法，返回当前类的数据
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
