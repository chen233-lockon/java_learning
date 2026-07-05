package com.learn.oop.oopprogressXPolymorphism.Test03;

public class Car extends Vehicle{
    public Car() {
    }

    public Car(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(super.getBrand() + "品牌的车正在以" + super.getSpeed() + "km/h的速度移动");
    }
    public void honk(){
        System.out.println("正在鸣笛中");
    }
}
