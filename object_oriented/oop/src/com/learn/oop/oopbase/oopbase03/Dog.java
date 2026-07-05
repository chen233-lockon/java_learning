package com.learn.oop.oopbase.oopbase03;

public class Dog {
//    数据安全
//    所有的成员变量私有化,只能再本类里访问(封装)
    private String name;
    private int age;

    //所有私有化变量都要提供getter和setter方法(public)
//    堆内存存储属性的值，
//    堆只存储方法的地址，真实的方法是在元空间（方法区）中
//    元空间里是类的字节码文件(.class)
    public void setName(String n) {
//        set给对象中的属性赋值
        name = n;
    }

    public String getName() {
//        get方法是对外提供所有需要return
        return name;
    }

    public void setAge(int a) {
        if (a > 0 && a <= 15) {
            age = a;
        } else {
            System.out.println("请输入正确的年龄(0~15)");
        }
    }

    public int getAge() {
        return age;
    }

    public void printInfo() {
        System.out.println(name + "," + age + "岁");
    }

    public void eatBone() {
//        先"",再++;
        System.out.println(age + "岁的"+ name +",正在吃骨头");
    }

}
