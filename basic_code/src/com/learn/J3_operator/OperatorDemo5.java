package com.learn.J3_operator;

public class OperatorDemo5 {
    public static void main(String[] args) {
//        字符串运算只有+操作,进行拼接产生新的字符串
//        任意数据 + 字符串都是拼接操作,并返回新的字符串
        String str = "hello" + "abc";
        System.out.println(str);
        String str1 = 10 + 8 + "岁";
        System.out.println(str1);
        String str2 = 10 + 8 + "岁" + 1 + 2;//从左到右进行运算，结果为字符串拼接
        System.out.println(str2);
    }
}
