package com.learn.oop.oopprogressJavaBean.Exersice03;

public class LocalDelivery extends ExpressDeliveryFee{
    public LocalDelivery() {
    }

    public LocalDelivery(String number, int weight, String recipient) {
        super(number, weight, recipient);
    }

    @Override
    public int calculateFee() {
        return super.calculateFee() + 10;
    }
}
