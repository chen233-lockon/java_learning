package com.learn.oop.oopprogress03;

public class EnumTest {
//    枚举类，特殊的javabean类，对象是有限的(每个都成为枚举项)
public static void main(String[] args) {
/*
                * 电商项目中，订单的状态只要一下六种，实现一下
                * 待支付 PAYMENT_PENDING
                * 处理中 PROCESSING
                * 已发货 SHIPPED
                * 配送中 OUT_FOR_DELIVERY
                * 已送达 DELIVERED
                * 已取消 CANCELED

*                 javabean ----> 枚举类
* */
//获取枚举类的所有对象
//    细节：所有的枚举项，默认都是public static final修饰的
//    OrderState o1 = OrderState.PAYMENT_PENDING;
//    System.out.println(o1);//PAYMENT_PENDING
//    System.out.println(o1.getName());//待支付
////    匹配
//    switch (o1){
//        case PAYMENT_PENDING -> System.out.println("待支付状态");
//        case PROCESSING -> System.out.println("处理中状态");
//        case SHIPPED -> System.out.println("已发货状态");
//        case OUT_FOR_DELIVERY -> System.out.println("配送中状态");
//        case DELIVERED -> System.out.println("已送达状态");
//        case CANCELED -> System.out.println("已取消状态");
//    }
    System.out.println("---------------------");
    OrderState o2 = OrderState.PROCESSING;
    System.out.println(o2.getName());
    System.out.println("---------------------");
    OrderState[] arr = OrderState.values();
    for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
    System.out.println("---------------------");
//    等同于：OrderState shipped = OrderState.SHIPPED;
    OrderState shipped = OrderState.valueOf("SHIPPED");
    System.out.println(shipped);
    System.out.println(">>>>>>>>>>>>>>>>>>>>>>");
    OrderState shipped1 = OrderState.SHIPPED;
    System.out.println(shipped1);
}
}
