package com.learn.oop.oopprogressJavaBean.Exercise01;

public class Cook extends Staff{
    public Cook() {
    }

    public Cook(String id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("厨师" + super.getName() + "正在炒菜");
    }
}
