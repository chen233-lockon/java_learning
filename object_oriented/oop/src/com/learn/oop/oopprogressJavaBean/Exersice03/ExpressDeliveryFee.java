package com.learn.oop.oopprogressJavaBean.Exersice03;

public class ExpressDeliveryFee {
    private String Number;
    private int weight;
    private String recipient;

    public ExpressDeliveryFee() {
    }

    public ExpressDeliveryFee(String number, int weight, String recipient) {
        Number = number;
        this.weight = weight;
        this.recipient = recipient;
    }

    public String getNumber() {
        return Number;
    }

    public void setNumber(String number) {
        Number = number;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
    //行为
    public  int calculateFee(){
        return this.weight * 10;
    }
}
