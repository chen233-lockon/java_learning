package com.learn.oop.oopprogressYInnerClass.Test04;

public class Outer {
    int b = 20;
    //局部内部类
    public  void show(){
        int a = 10;
//        可以修饰局部变量的修饰符都可以修饰局部内部类
        class Inner{
            String name = "小王";
            int age;
             public void show(){
                 System.out.println("局部内部类的方法一");
             }
             public static void showStatic(){
                 System.out.println("局部内部类的方法二");
             }
        }
        //    创建局部内部类对象
        Inner i = new Inner();
        System.out.println(i.name);
        System.out.println(i.age);
        i.show();
        Inner.showStatic();

    }


}
