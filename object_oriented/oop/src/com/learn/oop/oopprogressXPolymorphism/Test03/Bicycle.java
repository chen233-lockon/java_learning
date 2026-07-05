package com.learn.oop.oopprogressXPolymorphism.Test03;

public class Bicycle extends Vehicle {
    public Bicycle() {

    }

    public Bicycle(String brand, double speed) {
        super(brand, speed);
    }

    @Override
    public void move() {
        System.out.println(super.getBrand() + "品牌的自行车正在以" + super.getSpeed() + "km/h的速度移动");
    }


    public  void ringBell(){
        System.out.println("linglingling");
    }
}
