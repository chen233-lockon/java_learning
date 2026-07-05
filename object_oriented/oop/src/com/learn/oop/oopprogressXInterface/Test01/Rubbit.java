package com.learn.oop.oopprogressXInterface.Test01;

public class Rubbit extends Animal{
    public Rubbit() {
    }

    public Rubbit(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("兔子吃胡萝卜");
    }
}
