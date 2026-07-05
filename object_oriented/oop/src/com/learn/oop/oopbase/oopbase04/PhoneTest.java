package com.learn.oop.oopbase.oopbase04;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.setBrand("华为P90");
        p1.setColor("冷锋蓝");
        p1.setPrice(7990);
        System.out.println(p1.getBrand());
        System.out.println(p1.getColor());
        System.out.println(p1.getPrice());
        System.out.println("----------------");
        p1.Call();
        p1.SendMessage();
        System.out.println("----------------");
        Phone p2 = new Phone();
        p2.setBrand("iphone 17 pro max 1Tb");
        p2.setColor("深空灰色");
        p2.setPrice(19990);
        System.out.println(p2.getBrand());
        System.out.println(p2.getColor());
        System.out.println(p2.getPrice());
        p2.Call();
        p2.SendMessage();
        System.out.println("----------------");
        Phone p3 = new Phone();
        System.out.println(p3.getBrand());
        System.out.println(p3.getColor());
        System.out.println(p3.getPrice());
        System.out.println("----------------");
        p3.printThis();
    }
}
