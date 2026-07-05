package Stringbuilder.HomeWork;


public class StudentManager {
    private Student[] students;

    public StudentManager(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }
    public  void  updateStudent(Student student){
//方法：修改学生,根据学生的id，使用新的Student对象替换数组中老的Student对象
        for (int i = 0; i < students.length; i++) {
            if (students[i].getId().equals(student.getId())){
                System.out.println("修改前:" + students[i]);
                students[i] = student;
                System.out.println("修改后:" + students[i]);
                return;
            }
        }
        System.out.println("没有找到该学生");
    }
    public void findTopStudent(){
//         可以添加逻辑判断，防止数组为空，为null
//        if (students == null || students.length == 0) return null;
        double maxScore = students[0].getScore();//可以直接接收对象，if判断再对比成绩
        int studentIndex = 0;
        for (int i = 1; i < students.length; i++) {
            if(maxScore < students[i].getScore()){
                maxScore = students[i].getScore();
                studentIndex = i;
            }
        }
        System.out.println("最高分的学生:" + students[studentIndex]);
    }
}
