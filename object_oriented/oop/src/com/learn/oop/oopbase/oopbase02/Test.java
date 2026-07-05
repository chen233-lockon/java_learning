package com.learn.oop.oopbase.oopbase02;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        t1.name = "王风硕";
        t1.age = 50;
        System.out.println(t1.name);
        System.out.println(t1.age);
        t1.eat();
        t1.teach();
        t1.sleep();
        System.out.println("----------------");
        Cook c1 = new Cook();
        c1.name = "新东方陈师傅";
        c1.age = 50;
        c1.rating = 5;
        System.out.printf("%s\t年龄%d\t厨师等级为:%d\n",c1.name,c1.age,c1.rating);
        c1.cooking();
        System.out.println("----------------");
        Worker w1 = new Worker();
        w1.name = "王风硕";
        w1.age = 30;
        w1.workAge = 10;
        w1.working();
    }
}
