package com.learn.oop.oopprogressJavaBean;

public class Student extends Person{
    private String grade;

    public Student() {
    }

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
    //行为
    public void study(){
        System.out.println("学生" + super.getName() + "正在学习");
    }
}
