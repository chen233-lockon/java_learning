package com.learn.oop.oopprogressJavaBean.Exersice03;

public class Test {
    public static void main(String[] args) {
//        练习 继承的作业5（物流快递运费计算）
//        业务场景：
//        快递公司需要计算运费，基础快递包含单号String、重量int、收件人String
//        行为：计算快递费（计算规则每公斤10元，不需要考虑小数部分）
//        额外还有两种由基础快递衍生出来的特殊情况
//        同城速递：
//        重新计算快递费，在原有的基础上 + 10元
//        异地空运：
//        重新计算快递费，在原有的基础上 + 15元
        LocalDelivery l = new LocalDelivery("123", 1, "张三");
        int fee = l.calculateFee();
        System.out.println( fee);
        System.out.println("------------");
        LongDistanceAirTransport l1 = new LongDistanceAirTransport("456", 1, "李四");
        int fee1 = l1.calculateFee();
        System.out.println( fee1);
    }
}
