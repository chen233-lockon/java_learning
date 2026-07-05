package com.learn.oop.oopprogressXPolymorphism.Test01;
//多态
public class Test01 {
    public static void main(String[] args) {
                /*
        学生类：
            属性：姓名，账号，密码
            行为：work：学生的工作是学习

        老师类：
            属性：姓名，账号，密码
            行为：work：老师的工作是教书

        管理员：
            属性：姓名，账号，密码
            行为：work：管理员的工作是管理网站

        学生管理系统：
            行为：注册register
            要求：能注册所有的角色
            输出：姓名为张三的同学注册成功，账号zhangsan，密码123456

        */
//        多态：1.有继承\实现关系 2.父类引用指向子类对象 3.子类重写父类方法(可选)
//        好处：
//        1.方法中使用父类类型作为参数，可接收父类对象+所有子类对象
//        2.如果子类重写了父类方法，可以调用不同子类的重写的方法
        Person person = new Student("张三", "zhangsan", "123456");
        Person person1 = new Teacher("李四", "lisi", "654321");
        Person person2 = new Administrator("王五", "wangwu", "109876");
        ManageSystem ms = new ManageSystem();
        ms.register(person);
        System.out.println("------------------");
        ms.register(person1);
        System.out.println("------------------");
        ms.register(person2);
    }
}
