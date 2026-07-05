package oo_01CodeBlock;

public class Dog extends  Animal{
    //Field
    public int a;
    public   static int b;
    public  final static  int c;

    public Dog() {
        System.out.println("Dog无参构造函数");
    }
//    初始化类的静态成员变量
    static {
        System.out.println("Dog静态代码块");
        b = 20;
//      静态常量最晚在静态代码块中完成初始化
        c = 30;
    }
//    初始化实例变量,在构造函数之前
    {
        System.out.println("Dog普通代码块");
        a = 10;
        b = 21;
    }
//    类加载的触发时机
//    1. 创建对象
//    2. 调用静态成员变量,(方法),final修饰的静态变量除外；
//    3. 初始化子类
//    被动引用，不会触发初始化
//    1.子类引用父类的静态变量
//    2.数组定义引用类
//    3.访问常量值
}
