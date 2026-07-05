package com.learn.J3_operator;

import java.lang.reflect.Type;

public class OperatorDemo4 {
     public static void main(String[] args) {
//        字符运算
        char a = 'A';//转换为ascll码参与计算0~ 65535
        int b = 1;
        System.out.println(a + b);
//        A--> a
//        在计算时65 + 32 = 97，结果时int类型
//        判断'A' + 32的类型
        System.out.println((char)('A' + 32));
        char a1 = 'A' + 32;//大写A（65）比小写小32
        System.out.println(a1);
        StringBuffer sb = new StringBuffer("哈哈啊哈");
         System.out.println( sb);
         sb.append("!!!!");//可变追加
         System.out.println( sb);
    }
}
