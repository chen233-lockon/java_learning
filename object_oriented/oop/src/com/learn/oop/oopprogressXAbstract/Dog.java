package com.learn.oop.oopprogressXAbstract;

public class Dog extends  Animal{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    public void lookHome(){
        System.out.println("狗看家");
    }
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }
}
