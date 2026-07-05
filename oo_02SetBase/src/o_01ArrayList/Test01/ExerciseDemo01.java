package o_01ArrayList.Test01;

import java.util.ArrayList;
import java.util.Scanner;

public class ExerciseDemo01 {
    public static void main(String[] args) {
//需求：创建一个存储字符串的集合，内部存储3个字符串元素，使用程序实现在控制台遍历该集合
        ArrayList<String> list = new ArrayList<>();
        list.add("Python");
        list.add("Java");
        list.add("C++");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
//需求：创建一个存储学生对象的集合，存储3个学生对象，使用程序实现在控制台遍历该集合
//          学生的姓名和年龄来自于键盘录入
        ArrayList<Student> students = new ArrayList<>();
        appendStudent(students);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }
    }
    public static void appendStudent(ArrayList< Student>  students){
        for (int i = 0; i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入学生姓名：");
            String name = sc.next();
            System.out.println("请输入学生年龄：");
            int age = sc.nextInt();
            Student student = new Student(name, age);
            students.add(student);
        }
    }
}
