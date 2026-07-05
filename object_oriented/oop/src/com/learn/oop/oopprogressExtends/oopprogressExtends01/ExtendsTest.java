package com.learn.oop.oopprogressExtends.oopprogressExtends01;

//Java只支持单继承，不支持多继承，但支持多层继承
//直接继承的父类叫直接父类，间接继承的爷爷等叫做间接父类
//顶级父类Object，Java每个类都直接或间接继承于Object
public class ExtendsTest {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "小诗诗";
        s.age = 12;
        s.grade = "一年级";
        System.out.println(s.name + "," + s.age +"," + s.grade);
        s.eat();
        s.study();
        System.out.println("------------------");
        Teacher t = new Teacher();
        t.name = "小王老师";
        t.age = 45;
        t.subject = "计算机学科";
        System.out.println(t.name+t.age + t.subject );
        t.teach();
        t.eat();
    }
}
