package com.learn.oop.oopprogressYInnerClass.Test02;

public class Outer {
    int a = 10;
    class Inner{
        static int c = 10;
        int a = 20;
        public  void show(){
            int a = 30;
            System.out.println(a);//30
            System.out.println(this.a);//20
//           内部类和外部类的字节码文件独立，内部类内里会存储外部类的引用Outer.this
            System.out.println(Outer.this.a);//10
        }
    }
//    外部类提供内部类对象，类似getter
    public Inner getInner(){
        return new Inner();
    }
}
