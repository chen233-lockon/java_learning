package com.learn.oop.oopprogressXInterface.HomeWork;

public  abstract class CompositionTemplate {
    public final void write(){
        head();
        body();
        end();
    }
    public  void head(){
        System.out.println("作文开头");
    }
    public abstract void body();
    public  void end(){
        System.out.println("作文结尾");
    }
}
