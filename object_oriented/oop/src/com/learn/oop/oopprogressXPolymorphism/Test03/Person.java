package com.learn.oop.oopprogressXPolymorphism.Test03;

public class Person  {
    private String name;
    private int age;
    private String gender;

    public Person() {
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    //行为驾驶所有交通工具
    public  void drive(Vehicle v){
        //当前的交通工具正在行驶
        v.move();
        //响铃
        //if判断对象类型,保证和转换后和真实的类型一致
        if (v instanceof Bicycle){
            Bicycle bicyle = (Bicycle) v;
            //强制类型转换（向下）响铃
            bicyle.ringBell();
        }
        // 鸣笛
        else if (v instanceof Car){
            Car car = (Car) v;
            car.honk();
        }else System.out.println("没有这个类型");


    }
}
