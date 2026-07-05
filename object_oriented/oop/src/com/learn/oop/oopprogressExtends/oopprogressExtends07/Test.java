package com.learn.oop.oopprogressExtends.oopprogressExtends07;
//        继承中构造方法的特点
//        1.父类中的构造方法不会被继承，只能通过super关键字调用
//        2.子类的构造方法第一行，有一个JVM默认添加的super()，不写JVM自动加。
//        3.如果要访问父类的构造方法，必须通过super(参数)调用
//        4.创建子类对象时，先执行父类的构造方法，再执行子类的构造方法
//        新版本不强制顺序
//        5.父类没有无参构造时(定义了有参构造器，没写无参构造)，super()报错，必须super(参数)
//         $$拓展:this()(调用本类的其他构造方法(写在第一行)，常用来设置默认值)，以及和super()的区别
//          1.如果子类有多个this()，不能互相调用，一定要留一个调用super().
//          2.构造方法写了this()，就不能写super()，JVM也不会默认调用
//
public class Test {
    public static void main(String[] args) {
            // 练习 继承中构造方法的练习
            //根据下面的描述定义继承结构
            //学生： 老师：
            //属性：姓名、年龄、年级 属性：姓名、年龄、学科
        Student s = new Student("小王",18,"java");
        System.out.println(s.name+","+s.age+","+s.grade);
        Teacher t = new Teacher("小王",18,"java");
        //继承注意细节
//        子类真正能继承父类的是什么？
//        （非final、static、private修饰的方法）是虚方法
//        根类Object有五个虚方法，通过虚方法表继承到子类添加子类的虚方法，一直传递
    //        1.成员方法：虚方法是通过虚方法表的形式被子类继承的
    //        2.final修饰的最终方法不能被继承，可以被调用
    //        3.static修饰的静态方法不能被继承，可以被调用
    //        4.private修饰的私有方法不能被继承，不能被调用
    //        5.方法重写：子类替换虚方法表里面方法的地址值
    }
}
