package com.learn.oop.oopprogressJavaBean;

public class PostGraduate extends Student{
    public PostGraduate() {
    }

    public PostGraduate(String name, int age, String grade) {
        super(name, age, grade);
    }
    //重写学习方法

    @Override
    public void study() {
        System.out.println("研究生正在攻读学位");
    }

    @Override
    public void sleep() {
        System.out.println("研究生正在高级公寓睡觉休息");
    }
}
