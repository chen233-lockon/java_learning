package String;

import java.util.Scanner;

public class StringDemo01 {
    public static void main(String[] args) {
    show();
//    showMethodEquals();
    showMethodLiteral();
    showMethodCat();
//    showMethodReplace();
    showMethodSplit();
    }
    public static void show(){
//        不可变性
        //创建字符串对象//字符串对象重写过toString方法。底层是字节数组
//        1.字面量，存储在堆里的字符串常量池(String Pool)中
        System.out.println("------------------");
        String s1 = "hello";
//        或者通过字符数组，字节数组创建
//        2. new
        String s2 = new String();//等同于String s2 = "";
        String s3 = new String("helloWorld");
        char[] a = {'h','e','l','l','o'};
        String s4 = new String(a);
        byte[]b = {97,98,99,100,101};
        String s5 = new String(b);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        //编译器会常量折叠，包括final修饰的常量
    }
//常用方法
//    字符串比较
    public static void showMethodEquals(){
//        1.字符串比较
//        eqluals(比较字符串的内容)，返回布尔值
//        eqlualsIgnoreCase(比较字符串的内容)忽略大小写，返回布尔值
        System.out.println("----------------");
        Scanner sc = new Scanner(System.in);
        String userName = "admin";
        String password = "123456";
        for (int i = 0; i < 3; i++) {
            System.out.println("请输入用户名：");
            String name = sc.next();
            System.out.println("请输入密码：");
            String pwd = sc.next();
            if(name.equals(userName) && pwd.equals( password)){
                System.out.println("登录成功");
                return;
            }
            else {
                System.out.println("用户名或密码错误");
            }
        }
        System.out.println("登录失败");
    }
//    字符串遍历
    public static void showMethodLiteral(){
        //1.toCharArray()将字符串转换成字符数组,返回一个字符数组
        String str  = "helloWorld";
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + " ");
        }
        System.out.println();
        //2.charAt(索引)根据索引获取字符
        //3.length()获取字符串长度,注意区分数组的length属性
        int len = str.length();
        for (int i = 0; i < len; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
}
//    字符串截取
    public static void showMethodCat(){
        String str = "C:/aaa/bbb/c.txt";
        String str2 = "C:/aa.a/b.bb/c/d.d.d.d.py";
        System.out.println("---------");
//        1.substring(start)从指定索引开始截取字符串，截取到最后
        System.out.println(str.substring(12));
//        左闭右开
//        2.substring(start,end)从指定索引开始截取字符串，截取到指定索引位置的字符串（不包含end索引位置的字符）
//        配合indexOf(char c)和lastIndexOf(char c)获取前缀后缀
        int path_index = str2.lastIndexOf(".");
        System.out.println(str2.substring(path_index));
    }
//    字符串替换
    public static void showMethodReplace(){
        //replace(old，new)，返回新的字符串
        System.out.println("------------");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的评论:");
        String comment = sc.next();
        String newValue = comment.replace("TMD", "***");
        System.out.println(comment);
        System.out.println(newValue);
    }
//    字符串分隔
    public static void showMethodSplit(){
        System.out.println("----------");
//        split(regex,limit)，返回字符串数组
        String str = "001,张三,18,90,89,79,成都";
//        可以限制分隔的段数
        String[] arr = str.split(",");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "-------");
        }
        System.out.println();
       Student student = new Student();
        student.setId(arr[0]);
        student.setName(arr[1]);
//      使用Number的子类Integer和Double将字符串转换成数值
        student.setAge(Integer.parseInt(arr[2]));
        student.setC(Double.parseDouble(arr[3]));
        student.setM(Double.parseDouble(arr[4]));
        student.setE(Double.parseDouble(arr[5]));
        student.setAddress(arr[6]);
        System.out.println(student);
    }
}

