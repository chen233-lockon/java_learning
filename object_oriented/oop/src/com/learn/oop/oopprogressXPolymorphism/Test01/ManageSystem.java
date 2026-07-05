package com.learn.oop.oopprogressXPolymorphism.Test01;


public class ManageSystem {
    //定义一个方法表示注册
//    参数是Person对象，可以传递本类和所有子类的对象
    public void register(Person person){
//        输出：姓名为张三的同学注册成功，账号zhangsan，密码123456
        System.out.println("姓名为" + person.getName() + "注册成功，账号" + person.getUsername() + "，密码" + person.getPassword());
//        传递不同的对象，执行不同的行为
        person.work();
    }
}
