package com.learn.oop.oopprogressExtends.oopprogressExtends05;

public class Phone extends SmartDevice{
//    调用父类的方法，如果一点不想用，直接重写全部就行
//    如果需要用就可以通过super关键字调用父类的方法，再继续重写
    @Override
    public double countPrice() {
//        在父类的方法基础上，进行修改
        double newPrice  = super.countPrice();
        return newPrice*0.9;

    }
}
