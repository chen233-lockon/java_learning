package com.learn.oop.oopprogressXPolymorphism.HomeWork;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

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
    public void userShapes(Shape s){
        s.calculateArea();
        s.calculatePerimeter();
        if (s instanceof Rectangle){
            Rectangle r = (Rectangle)s;
            r.show();
        } else if (s instanceof  Circle) {
            Circle c = (Circle)s;
            c.show();
        }else{
            System.out.println("错误的类型");
        }
    }
}
