package com.learn.oop.oopprogressXInterface.Test01;

public interface Swim {
//    成员特点:(没有成员方法\构造方法\成员变量)
//    1.成员变量只能是常量，默认是public static final,不用写
//    2.没有构造方法，因为没有成员变量
//    可以有的方法如下:JDK8之前只能有抽象方法
//    3.没有成员方法，只能是抽象方法，默认是public abstract,不用写
//    4.默认方法，default,默认且只能public,不用写
//    5.静态方法，默认也是public,不用写
//    6.私有方法

//    接口和类的关系:
//    1.类与类,继承extends,只能单继承,可以多层继承
//    2.类与接口,实现implements,可以多实现
//    3.接口与接口,继承extends,可以多继承
//    接口继承相同的抽象方法不怕冲突，因为没有函数体逻辑
//    而继承相同的默认方法会冲突报错。必须重写冲突方法，
//    并且想要调用父接口的默认方法，必须使用(父接口名.super.show())
    int NUM = 10;
//    默认方法等同于普通的成员方法，可以被继承等(因为后来开发团队反悔了)
    default  void show(){
        System.out.println("接口中的默认方法");
    }
    static  void show1(){
        System.out.println("接口中的静态方法");
    }
//    因为是私有，所有是服务于接口内默认方法的
    private void show2(){
        System.out.println("接口中的私有方法");
    }
    public abstract void swim();
}
