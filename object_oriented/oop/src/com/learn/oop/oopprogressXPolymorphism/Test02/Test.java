package com.learn.oop.oopprogressXPolymorphism.Test02;

public class Test {
    public static void main(String[] args) {
        /*
        * 多态,java多态仅仅指方法重写带来的动态多态性，成员变量不存在多态性
        * 变量调用：
        *       编译看左边，运行也看左边
        * 方法调用：
        *       编译看左边，运行看右边*/
    Fu fu = new Zi();//多态实现,自动向上转型
//        变量调用：
//               编译看左边(当java文件编译成class文件时，看父类有没有这个变量，如果有编译成功)
//               运行也看左边(当代码正在运行的时候，使用父类中的变量)
        System.out.println(fu.name);
//        方法调用：
//               编译看左边(当父类没有这个方法时编译报错)
//               运行看右边(运行时调用子类重写后的方法，如果没有重写，就调用父类的方法)
        fu.show();
//        弊端：不能去调用子类的特有的方法，使用强制类型转换大到小
//        当父类调用子类特有的方法时，会报错，遵循编译看左边，运行看右边。
//        fu.zishow();
//         解决弊端
//        1.判断fu是不是Zi类,推荐先instanceof 判断
        if (fu instanceof Zi) {
//            强制类型转换
            Zi zi = (Zi)fu;//不能跨继承转换
            zi.ziShow();
        }
        else System.out.println("fu不是Zi类");
        //2.新语法,不用强转
        if (fu instanceof Zi z){
            z.ziShow();
        }

    }
}
