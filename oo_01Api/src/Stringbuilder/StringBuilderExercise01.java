package Stringbuilder;

import java.util.Scanner;

public class StringBuilderExercise01 {
    public static void main(String[] args) {
        show();
    }
    public static void show(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString()))
        {
            System.out.println("是回文");
        }
        else{
            System.out.println("不是回文");
        }
    }
}
