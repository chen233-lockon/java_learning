package Stringbuilder.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;//自动写getter，setter,重写toString()
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor//创建全参构造
@NoArgsConstructor//创建无参构造
public class Student {
    private String id;
    private String name;
    private int age;
    private double score;
    @Override
    public String toString() {
        return "学生信息:{" +
                "学号:'" + id + '\'' +
                ", 姓名:'" + name + '\'' +
                ", 年龄:" + age +
                ", 成绩:" + score +
                '}';
    }
}
