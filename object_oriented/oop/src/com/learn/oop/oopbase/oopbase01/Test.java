package com.learn.oop.oopbase.oopbase01;

public class Test {
//    带mian方法的类叫测试类
     public static void main( String[] args) {
//         创建对象
         Dog d1 = new Dog();
//         赋值
         d1.name = "小白";
         d1.age = 2;
         d1.weight = 5.0;
         d1.hairColor = "白色";
//         打印第一只小狗的信息
         System.out.println(d1.name);
         System.out.println(d1.age);
         System.out.println(d1.weight);
         System.out.println(d1.hairColor);
         System.out.println("----------------");

//         创建第二个对象，管理第二只小狗
         Dog d2 = new Dog();
         d2.name = "大黄";
         d2.age = 3;
         d2.weight = 10.0;
         d2.hairColor ="黄色";
         System.out.println(d2.name);
         System.out.println(d2.age);
         System.out.println(d2.weight);
         System.out.println(d2.hairColor);
         System.out.println("----------------");
        Student s1 = new Student();
        s1.name = "小王";
        s1.age = 18;
        s1.gender = "男";
        s1.height = 180.0;
         System.out.println(s1.name);
    }
}
