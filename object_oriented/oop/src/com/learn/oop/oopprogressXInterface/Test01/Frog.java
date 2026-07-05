package com.learn.oop.oopprogressXInterface.Test01;

public class Frog extends Animal implements Swim {
    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("青蛙在吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙在蛙泳");
    }
}
