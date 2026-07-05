package String;

import java.util.Random;
import java.util.Scanner;

public class SubstringExercise01 {
    public static void main(String[] args) {
        show();
        show1();
        show2();
    }
    public static void show(){
        String string = "aAb3&c2B*4CD1";
        int countUpper = 0;
        int countLower = 0;
        int countNumber = 0;
        char[] c = string.toCharArray();
        for (int i = 0; i < c.length; i++) {
            if (c[i] >= 'A' && c[i] <= 'Z') countUpper++;
            if (c[i] >= 'a' && c[i] <= 'z') countLower++;
            if (c[i] >= '0' && c[i] <= '9') countNumber++;
        }
        System.out.println("小写字母：" + countLower + "个");
        System.out.println("大写字母：" + countUpper + "个");
        System.out.println("数字个数：" + countNumber + "个");
    }
    public static void show1(){
        String dictionary = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
//        System.out.println(dictionary.length());//62
        Random r = new Random();
        char[] chars = new char[5];
        chars[0] = dictionary.charAt(r.nextInt(26));
        chars[1] = dictionary.charAt(r.nextInt(26, 53));
        chars[2] = dictionary.charAt(r.nextInt(53, 62));
        chars[3] = dictionary.charAt(r.nextInt(62));
        chars[4] = dictionary.charAt(r.nextInt(62));
        for (int i = 0; i < chars.length; i++) {
            if (i+1 < chars.length-1) {
                int index = r.nextInt(i + 1, chars.length - 1);
                char temp = chars[i];
                chars[i] = chars[index];
                chars[index] = temp;
            }
        }
        String password = new String(chars);
        System.out.println(password);
    }
    public static void show2(){
//        要求：编写一个Java程序，将用户输入字符串中的"TMD"替换为"***"，并输出结果。
//
//        示例输入：你TMD是不是有病, 你出无尽干什么?
//
//                示例输出：你***是不是有病, 你出无尽干什么?
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的评论:");
        String comment = sc.next();
        String newComment = comment.replace("TMD", "***");
        System.out.println(newComment);
    }
}
