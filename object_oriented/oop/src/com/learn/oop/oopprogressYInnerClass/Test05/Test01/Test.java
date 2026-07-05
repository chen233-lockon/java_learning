package com.learn.oop.oopprogressYInnerClass.Test05.Test01;

//重点点点点: 匿名内部类,没有名字的内部类
//作用:在继承一个类或接口时少些一个文件，也是lambda的前置知识点
//格式: new 抽象父类/抽象接口(){
//        重写抽象方法
// }
//使用场景，实现类只使用一次使用匿名内部类简化代码,也可以直接当中参数传递
//简单理解：近似理解，给接口和抽象类，创建对象，并重写抽象方法。对普通类也行，且重写方法。
public class Test {
    public static void main(String[] args) {
        //    要求：在测试类中调用下面的goSwimming方法
//        传统方式：在调用这个方法时，需要传递这个接口的实现对象Student
//        Student s = new Student();
//        调用方法
//        goSwimming(s);
//        问题：如果方法执行次数少，确要新建类文件，使用匿名内部类可以避免
//        匿名内部类就是让少定义一个类文件
//

//        没有名字大java类，大括号
//        Swim，就是这个没有名字的java类实现了Swim接口，并重写swim的抽象方法
//        new关键字是new的后面这个没有名字的java类
//        整体：创建了一个Swim实现类的对象，只不过没有是名字而已
//        多态的体现
//        Swim s = new Swim() {
//            @Override
//            public void swim() {
//                System.out.println("学生正在游泳");
//            }
//
//        };
//        此方法不用定义student类，直接使用匿名内部类
//        Swim s = new Swim() {
//            @Override
//            public void swim() {
//                System.out.println("学生正在游泳");
//            }
//
//            @Override
//            public void shopping() {
//                System.out.println("学生正在购物");
//            }
//        };
//        goSwimming(s);
        //   匿名内部类当中参数传递
        goShopping(new Swim() {
            @Override
            public void swim() {
                System.out.println("学生正在游泳");
            }

            @Override
            public void shopping() {
                System.out.println("学生正在购物");
            }
        });
    }



//    在调用这个方法时，需要传递这个接口的实现对象Student
    public static void goSwimming(Swim s){
        s.swim();
    }

    public static void goShopping(Swim s){
        s.shopping();
    }
}

