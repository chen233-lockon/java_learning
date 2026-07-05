package Stringbuilder.HomeWork;

public class TestStudentManager {
    public static void main(String[] args) {
    Student s1 = new Student("001","张三",18,98.5);
    Student s2 = new Student("002","李四",19,67.5);
    Student s3 = new Student("003","王五",20,89);
    Student[] students = {s1,s2,s3};
    StudentManager sm = new StudentManager(students);
    sm.findTopStudent();
    System.out.println("------------------");
    sm.updateStudent(new Student("001","赵六",22,70));
    System.out.println("----------");
    }
}
