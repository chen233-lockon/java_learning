package oo_01CodeBlock;

public class Animal {
    public Animal() {
        System.out.println("Animal无参构造函数");
    }
    static {
        System.out.println("Animal静态代码块");
    }
    {
        System.out.println("Animal普通代码块");
    }
}
