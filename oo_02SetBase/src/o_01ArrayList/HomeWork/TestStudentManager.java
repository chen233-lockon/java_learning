package o_01ArrayList.HomeWork;

import java.util.ArrayList;

public class TestStudentManager {
    public static void main(String[] args) {
        Student s1 = new Student(1, "小王", 20);
        Student s2 = new Student(2, "小李", 19);
        Student s3 = new Student(3, "小赵", 18);
        Student t1 = new Student(4, "小奉", 23);
        ArrayList<Student> listStudent = new ArrayList<>();
        listStudent.add(s1);
        listStudent.add(s2);
        listStudent.add(s3);
        StudentManager sm = new StudentManager(listStudent);
        sm.addStudent(t1);
        System.out.println( sm);
        System.out.println("--------------");
        sm.deleteById(2);
        System.out.println( sm);
        System.out.println("--------------");
        sm.updateStudent(new Student(3, "小赵", 22));
        System.out.println( sm);
        System.out.println("--------------");
        System.out.println(sm.findStudentById(4));
    }
}
