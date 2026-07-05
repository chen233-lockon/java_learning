package com.learn.oop.oopbase.oopbase01;

public class Dog {
//    描述一类事物的类成为javabean类,不需要写main方法,方法不写static
//    标准的javabean类
//    1.成员变量私有化(private)
//    2.提供getter和setter方法访问成员变量
//    2.1（注意this指针访问当前对象的属性和方法（类似python（self）））
//    3.提供无参的构造方法(最好全参构造函数也写(类似python __init__()))
//    狗狗类(名字，年龄，体重，毛发颜色)
    String name;
    int age;
    double weight;
    String hairColor;
}
