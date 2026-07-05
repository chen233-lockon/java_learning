package com.learn.oop.oopprogress02;

public class FinalTest {
    public static void main(String[] args) {
//        final 1.修饰变量时,此时叫做常量
//          特点1:只能被赋值一次,无法再次修改;
//          特点2:常量通常全大写,多个单词使用下划线_连接;
//              2.修饰类时，不可被继承,final类中的所有方法默认为final
//              3.修饰方法时，不可被重写,可以被子类继承，但不能被重写(只能继承)
//              4.成员变量被final修饰后，必须在构造方法结束前赋值。
//  细节:
//        基本数据类型:
//        byte,short,int,long,float,double,char,boolean
//        记录的是真实的数据
        final int A = 100;//变量里储存的数据无法改变
//        引用数据类型:
//        其他所以数据类型都是引用数据类型
//        int[],Random,String,Student,Dog...
//        记录的是地址值
        final Student s = new Student();//不可改变的是地址值
        s.name = "小王";
//        1.定义一个常量
        final int NUMBER = 100;
//        2.使用常量
        System.out.println(NUMBER + 100);
//        NUMBER  = 200;//报错.无法将值赋给 final 变量 'NUMBER'
//        定义引用数据类型
        final Student STU = new Student("张三",18);//常量全大写
//        STU = new Student();//无法将值赋给 final 变量 'STU'
//        final修饰的地址值没有修改，修改成员变量或方法无所谓
        STU.name = "小李";
        STU.age = 40;
        System.out.println(STU.getName());
        System.out.println(STU.getAge());
    }
}
