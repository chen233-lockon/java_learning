package com.learn.oop.oopprogressXPolymorphism.Test03;

public class Test {
    public static void main(String[] args) {
//        多态的综合练习
//        自行车：
//        属性：品牌，行驶速度
//        行为：移动move，响铃ringBell（）
//        汽车：
//        属性：品牌，行驶速度
//        行为：移动move，鸣笛honk（）
//        人：
//        属性：名字，年龄，性别
//        行为：行驶交通工具（能使用所有交通工具）
//        测试类中创建Person的对象，让这个人使用任意一款交通工具
        Person p = new Person("小诗诗",20,"女");
        System.out.println(p.getName() + "," + p.getAge() + "," + p.getGender());
        p.drive(new Bicycle("凤凰",10));
        p.drive(new Car("小米su7",10));
    }
}
