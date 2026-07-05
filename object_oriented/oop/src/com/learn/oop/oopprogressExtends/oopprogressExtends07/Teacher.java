package com.learn.oop.oopprogressExtends.oopprogressExtends07;

public class Teacher extends Person {
    String subject;
//无参构造函数
    public Teacher() {
        this("语文");//调用本类其他构造方法
        System.out.println("子类Teacher无参构造方法执行了");
    }
    public Teacher(String subject){
        this.subject = subject;
    }
//全参数构造函数
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("子类Teacher全参构造方法执行了");
    }
}

