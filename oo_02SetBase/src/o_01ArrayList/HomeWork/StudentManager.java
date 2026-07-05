package o_01ArrayList.HomeWork;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentManager {
    private  ArrayList<Student> students = new ArrayList<>();
//    添加学生
void  addStudent(Student student){
    if (students == null || students.isEmpty()) {
        System.out.println("当前没有学生");
        return;
    }
    if (student == null) {
        System.out.println("输入的参数不能为空");
        return;
    }
    for (Student value : students) {
        if (value.getId() == student.getId()) {
            System.out.println("该学号已存在");
            return;
        }
    }
    students.add(student);
}
//删除学生
void deleteById(int id){
    if (students == null || students.isEmpty()) {
        System.out.println("当前没有学生");
    }else{
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
    }
}
//修改学生
void updateStudent(Student student){
    if (students == null || students.isEmpty()) {
        System.out.println("当前没有学生");
        return;
    }
    if (student == null) {
        System.out.println("输入的参数不能为空");
        return;
    }
    for (int i = 0; i < students.size(); i++) {
        if (student.getId() == students.get(i).getId()) {
            students.set(i,student);
        }
    }
}
//查询学生
Student findStudentById(int id){
    if (students == null || students.isEmpty()) {
        System.out.println("当前没有学生");
        return null;
    }else{
        for (Student student : students) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null;
    }
}
}
