package com.learn.j5_switch;

import java.util.Scanner;

public class SwitchDemo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个月份，用于判断季节:");
        int month = sc.nextInt();
//        switch——case匹配语句，需要case退出switch
//        switch (month) {
//            case 3,4,5:
//                System.out.printf("%d月是春季", month);
//                break;
//            case 6:
//            case 7:
//            case 8:
//                System.out.printf("%d月是夏季", month);
//                break;
//            case 9:
//            case 10:
//            case 11:
//                System.out.printf("%d月是秋季", month);
//                break;
//            case 12:
//            case 1:
//            case 2:
//                System.out.printf("%d月是冬季", month);
//                break;
//            default:
//                System.out.println("输入错误！！！！");
//                break;
//        }
//      switch新特性
//        一、箭头标签,不需要break了且不会触发case穿透，两种写法不兼容
//        二、case跟多个值
//        三、switch可以有运行结果
//        四、yield关键字
        String season = switch (month) {
//             只有一行可以简写,yield也是
            case 3, 4, 5 -> {
                yield "春季";
            }
            case 6, 7, 8 -> "夏季";
            case 9, 10, 11 -> "秋季";
            case 1, 2, 12 -> "冬季";
            default -> null;
        };
        System.out.println(season);
//        练习：switch模拟计算器
        System.out.println("请输入第一个数:");
        double a = sc.nextDouble();
        System.out.println("请输入第二个数:");
        double b = sc.nextDouble();
        System.out.println("请输入操作符:");
        String op = sc.next();
        double result = switch (op) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            case "/" -> a / b;
            default -> 0;
        };
        System.out.printf("%10.2f %s %-10.2f = %.2f", a, op, b, result);

    }
}
