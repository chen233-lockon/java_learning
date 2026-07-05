package com.learn.oop.oopprogressXAbstract;

public abstract class Animal {
    private String name;
    private String color;

    public Animal() {
    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //行为
    public void water(){
        System.out.println("喝水");
    }
//    alt + Enter idea自动修复错误
    //抽象方法
    public abstract void eat();
}
