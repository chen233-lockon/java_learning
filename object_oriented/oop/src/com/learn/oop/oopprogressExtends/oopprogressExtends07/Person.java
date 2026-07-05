package com.learn.oop.oopprogressExtends.oopprogressExtends07;

public class Person {
    String name;
    int age;

    public Person() {
        System.out.println("父类无参构造方法执行了");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类全参构造方法执行了");
    }
}
