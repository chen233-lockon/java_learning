package oo_06Exception;
//异常：指的是程序在编译或执行过程中，出现的非正常的情况 (错误)

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
*注意:语法错误, 不是异常
 **/
//继承体系       throwable(异常根体系)
//       Error                            Exception
//                RuntimeException(运行时异常)     其他所有非RuntimeException都是编译时异常
public class ExceptionDemo01 {
    public static void main(String[] args) {
//异常的默认处理流程：
//        1.jvm在异常处自动创建一个异常对象：ArithmeticException
//        2.异常会从方法中出现的点这里抛出给调用者，调用者最终抛出给JVM虚拟机
//        3.jvm接收到异常对象后，先在控制台直接输出异常信息数据
//        4.终止 Java 程序的运行
//异常的处理方式
////        一、捕获异常 try catch finally 把大的异常放后面
        try {
            int a = 10;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("出现了异常");
////throwable常用方法
//  getMessage()获取异常信息
//  printStackTrace()打印异常信息
            System.out.println(e.getMessage());
            System.out.println("-------------");
            e.printStackTrace();
        } finally {
            System.out.println("finally代码块");
        }
////        二、抛出异常
//        throw用在方法中, 后面跟的是异常对象, 其作用是抛出异常对象
//        throws:用在方法上，作用是声明，声明这个方法中的异常是抛出处理
//        抛出编译时异常必须使用 throws 声明
//        注意:子类重写父类方法时，不能抛出父类没有的异常, 或者比父类更大的异常
////        三、自定义异常
//        1、自定义编译时异常
//        定义一个异常类继承Exception.
//                重写构造器
//        2、自定义运行时异常
//        定义一个异常类继承RuntimeException.
//                重写构造器。
        test1();
        login();
    }
    public static void test1(){
        while ( true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入18~38的年龄:");
            try {
                int age = scanner.nextInt();
                if (age < 18 || age > 38){
                    System.out.println("范围不对！！！");
                }else {
                    System.out.println("恭喜你，进入游戏");
                    break;
                }
            } catch (InputMismatchException e){
                System.out.println("请输入正确的年龄" + e.getMessage());
                scanner.next();//清空缓存
            }

        }
    }
    public static void login(){
//        模拟登录
        String username = "admin";
        String password = "123456";
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String name = scanner.next();
        System.out.println("请输入密码:");
        String pwd = scanner.next();
        if (username.equals(name) && password.equals(pwd)){
            System.out.println("登录成功");
        }else {
            System.out.println("用户名或密码错误");
            //暴露异常
            throw new UsernameOrPasswordException("用户名或密码错误(自定义的喔)");
        }
    }
}
