package com.learn.oop.oopprogressXAbstract;

public class Cat extends  Animal{
    public Cat() {
    }

    public Cat(String name, String color) {
        super(name, color);
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
