package com.learn.oop.oopprogressExtends.oopprogressExtends05;

public class SmartDevice {
    String name;
    double price;
    public  double countPrice(){
        if(price>=10000){
            return price*0.7;
        }
        else if (price >= 5000) {
            return price*0.8;
        }
        else if (price >= 1000) {
            return price*0.9;
        }
        else if (price>=0) {
            return price;
        }
        return 0.0;
    }
}
