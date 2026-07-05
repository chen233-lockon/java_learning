package com.learn.oop.oopprogressJavaBean;

public class Person {
    private String name;
    private int age;
//无参构造方法
    public Person() {
    }
//有参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
//getter和setter方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
//    行为
    public  void eat(){
        System.out.println("吃饭");
    }
    public  void sleep(){
        System.out.println("睡觉");
    }
}
