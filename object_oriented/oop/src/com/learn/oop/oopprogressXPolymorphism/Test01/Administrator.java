package com.learn.oop.oopprogressXPolymorphism.Test01;


public class Administrator extends Person {
    public Administrator() {
    }

    public Administrator(String name, String username, String password) {
        super(name, username, password);
    }

    @Override
    public void work() {
        System.out.println("管理员的工作是管理系统");
    }
}
