package com.learn.oop.oopprogressJavaBean.Exercise01;

public class Staff {
    private String Id;
    private String name;
    private double salary;

    public Staff() {
    }

    public Staff(String id, String name, double salary) {
        Id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public  void work(){
        System.out.println("员工正在工作");
    }
    public  void eat(){
        System.out.println("员工正在吃米饭");
    }
}
