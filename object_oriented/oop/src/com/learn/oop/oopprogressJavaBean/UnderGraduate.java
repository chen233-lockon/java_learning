package com.learn.oop.oopprogressJavaBean;

public class UnderGraduate extends Student{
    //私有化成员变量没有不写
    //构造方法

    public UnderGraduate() {
    }
    //间接父类+直接父类+子类
    public UnderGraduate(String name, int age, String grade) {
        super(name, age, grade);
    }
    //getter和setter不写

    @Override
    public void study() {
        System.out.println("本科学生正在学习本科内容");
    }
}
