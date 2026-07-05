package com.learn.oop.oopprogressXInterface.Test01;
//接口interface:接口就是一个规则，独立于继承的规则(理解为干爹)
//接口和类是实现关系，通过implements关键字实现
//注意点：
//      1.接口不能实例化
//      2.接口的子类(实现类),要么重写接口中的所有抽象方法，要么实现类是一个抽象类
//      亲爹只能有一个，干爹可以有无数个
//      3.一个类可以实现(implement)多个接口，也可以在继承的同时实现多个接口
//接口的成员特点，详见Swim接口
//接口作为接口类定义成父类引用指向子类对象，实现接口的多态
public class Test {
    public static void main(String[] args) {
   /*
    青蛙Frog
        属性：名字，颜色        行为：吃虫子，蛙泳
    狗Dog
        属性：名字，颜色        行为：吃骨头，狗刨
    兔子Rabbit
        属性：名字，颜色        行为：吃胡萝卜
    */
        Frog f = new Frog("小青","青色");
        f.eat();
        f.swim();
        System.out.println("----------------");
        Rubbit r = new Rubbit("小兔子","白色");
        r.eat();
        System.out.println("----------------");
        Dog d = new Dog("小狗","黑色");
        d.eat();
        d.swim();
    }
}
