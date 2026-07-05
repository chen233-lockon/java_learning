package com.learn.oop.oopprogressJavaBean;
//带继承的标准的JavaBean类
public class Test {
    public static void main(String[] args) {
           /*
    本科学生：
        属性：姓名、年龄、年级
        行为：吃饭、睡觉、学习（攻读学士学位）

    专业课老师：
        属性：姓名、年龄、学科
        行为：吃饭、睡觉、教书（教专业课知识）

    硕士研究生：
        属性：姓名、年龄、年级
        行为：吃饭、睡觉、学习（攻读硕士学位）

    通识课老师：
        属性：姓名、年龄
        行为：吃饭、睡觉、教书（教通识课知识）

    过了一段时间，硕士研究生住宿条件升级，在豪华版学生公寓睡觉
    */
        UnderGraduate us = new UnderGraduate("陈韬",23,"大四");
        System.out.println(us.getName() + "," + us.getAge() + "," + us.getGrade());
        us.study();
        us.eat();
    }
}
