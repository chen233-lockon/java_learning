package com.learn.oop.oopprogressXAbstract;
//抽象方法:将共性的方法抽取到父类后，因为子类的方法体不一样
//         在父类不能确定具体的方法体，就定义为抽象方法。
//抽象类abstract:用来描述抽象的对象
//       1.如果类有抽象方法，那么类必须定义为抽象类,
//       2.如果抽象类被继承，子类必需重写抽象方法(规范子类方法)
//注意事项:
//       1.抽象类不能实例化
//       2.1抽象类中不一定有抽象方法(作用：不让外界创建本类的对象)
//       2.2但抽象方法一定是抽象类
//       3.抽象类可以有构造方法
//       4.抽象类的子类：
    //       4.1要么重写所有的抽象方法
    //       4.2要么声明为抽象类
public class Test {
    public static void main(String[] args) {
           /*
          Animal类（抽象类）：
            属性：名字，颜色
            行为：eat()抽象方法，喝水

          猫类：
            行为：猫吃鱼，猫抓老鼠

          狗类：
            行为：狗吃骨头，狗看家，喝水
         */
        Cat cat = new Cat("咪咪","白色");
        cat.eat();
        cat.catchMouse();
        System.out.println("----------");
        Dog dog = new Dog("小黄","黄色");
        dog.eat();
        dog.lookHome();
//        Animal a = new Animal() {
//        }
    }
}
