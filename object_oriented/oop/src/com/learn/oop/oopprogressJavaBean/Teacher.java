package com.learn.oop.oopprogressJavaBean;

public class Teacher extends Person {
    private String subject;

    public Teacher() {
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
    //行为
    public  void teach(){
        System.out.println("老师" + super.getName() + "正在教书");
    }
}
