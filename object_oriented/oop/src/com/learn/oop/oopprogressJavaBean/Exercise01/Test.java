package com.learn.oop.oopprogressJavaBean.Exercise01;

public class Test {
    public static void main(String[] args) {
//        练习 继承的作业1（餐饮菜品推荐）
//        经理
//        成员变量: 工号，姓名，工资，管理奖金
//        成员方法: 工作(管理其他人)，吃饭(吃米饭)
//        厨师
//        成员变量: 工号，姓名，工资
//        成员方法: 工作(炒菜)，吃饭(吃米饭)
        Manager m = new Manager("1001","小王",5000,"10");
        System.out.println(m.managerReward);
        m.work();
        m.eat();
        System.out.println("---------");
        Cook c = new Cook("1002","小李",5000);
        c.work();
    }
}
