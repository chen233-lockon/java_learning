package com.learn.oop.oopbase.oopbase03;

public class TestDemo {
    public static void main(String[] args) {
//      如果没有任何地方使用堆里的对象，对象也会被垃圾回收器回收掉
//        方法区（元空间）里的类字节码文件一般不会被回收，除非关闭JVM（关闭idea）
        Dog d1 = new Dog();
        d1.setName("小白");
        System.out.println(d1.getName());
//        因为不在范围内，所有会有默认值
        System.out.println(d1.getAge());
        d1.printInfo();
        d1.eatBone();
    }
}
