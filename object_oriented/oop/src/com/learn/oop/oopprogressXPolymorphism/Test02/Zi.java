package com.learn.oop.oopprogressXPolymorphism.Test02;

public class Zi extends  Fu{
    String name = "zi";
    //子类独有的方法
    public  void ziShow(){
        System.out.println("子类的ziShow方法调用了");
    }
    //重写父类的show方法

    @Override
    public void show() {
        System.out.println("子类重写的show方法调用了");
    }
}
