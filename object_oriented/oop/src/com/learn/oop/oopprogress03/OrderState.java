package com.learn.oop.oopprogress03;

public enum OrderState {
    //    细节：
    //    1.每一个枚举项都是该枚举类的对象，都是通过构造方法创建的
    //    2.所有的枚举项(底层就是常量)，默认都是public static final修饰的
    //    3.第一行必须罗列当前类(枚举类)的所有对象(枚举项)
    //    4.enum构造函数私有化private，不需要setter方法,不让外界创建本类的对象
    //    5.编译器默认给枚举类新增values()和valueOf(String name)方法
//    values()方法，返回枚举类对象数组,获取所有枚举项
//    valueOf(String name)方法，返回枚举类对象，获取指定名称的枚举项
//    OrderState PAYMENT_PENDING = new OrderState("待支付");
    PAYMENT_PENDING("待支付"),
    PROCESSING("处理中"),
    SHIPPED("已发货 "),
    OUT_FOR_DELIVERY("配送中 "),
    DELIVERED("已送达 "),
    CANCELED("已取消 ");

    private final String name;
//  枚举类构造方法默认private修饰，可以省略不写
     private OrderState(String name) {
        System.out.println("枚举项创建了");
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
