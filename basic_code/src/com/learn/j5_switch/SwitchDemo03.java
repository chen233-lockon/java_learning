package com.learn.j5_switch;

import java.util.Scanner;

public class SwitchDemo03 {
    public static void main(String[] args) {
        getStudentSystem();
    }

    private static void getStudentSystem() {
        Scanner sc = new Scanner(System.in);
//  给循环取名字（名字:），用于给break 跳出指定的循环
        loop: while (true){
            String systemStudents = """
                --------欢迎使用学生管理系统-------------
                1.添加学生
                2.删除学生
                3.修改学生
                4.查询学生
                5.退出系统
                请输入操作(1~5):
                """;
            System.out.println(systemStudents);
            int op = sc.nextInt();
            switch (op) {
                case 1:{
                    System.out.println("添加成功");
                    break ;
                    }
                case 2:{
                    System.out.println("删除成功");
                    break ;
                }
                case 3:{
                    System.out.println("修改成功");
                     break;}
                case 4 :{
                    System.out.println("查询成功");
                    break;}
                case 5 : {
                    System.out.println("感谢你的使用，再见！");
                    break loop;
                }
                default :
                    System.out.println("输入错误！！！！");
        };
        }
    }

}
