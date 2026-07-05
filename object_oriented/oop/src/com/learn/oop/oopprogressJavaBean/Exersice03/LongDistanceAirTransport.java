package com.learn.oop.oopprogressJavaBean.Exersice03;

public class LongDistanceAirTransport extends ExpressDeliveryFee{
    public LongDistanceAirTransport() {
    }

    public LongDistanceAirTransport(String number, int weight, String recipient) {
        super(number, weight, recipient);
    }

    @Override
    public int calculateFee() {
        return super.calculateFee() + 15;
    }
}
