package com.learn.oop.oopprogressJavaBean.Exercise01;

public class Manager extends Staff{
    public String managerReward;

    public Manager() {

    }

    public Manager(String id, String name, double salary, String managerReward) {
        super(id, name, salary);
        this.managerReward = managerReward;
    }

    public String getManagerReward() {
        return managerReward;
    }

    public void setManagerReward(String managerReward) {
        this.managerReward = managerReward;
    }

    @Override
    public void work() {
        System.out.println("经理" + super.getName() + "正在管理其他人");
    }

}
