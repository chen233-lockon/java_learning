package com.learn.oop.oopprogressExtends.oopprogressExtends07;

public class Student extends Person {
    String grade;
//空参构造方法
    public Student() {
        System.out.println("子类Student无参构造方法执行了");
    }

//带全部参构造函数（指的是父类加子类的所有成员变量）
//    父类中的成员变量，通过super传递给父类构造函数初始化赋值
//    子类中的成员变量，自己赋值this赋值
    public Student(String name, int age, String grade) {
        //    父类中的成员变量，通过super传递给父类构造函数初始化赋值
        super(name,age);
        //    子类中的成员变量，自己赋值this赋值
        this.grade = grade;
        System.out.println("子类Student带参构造方法执行了");
    }
}
