package o_01ArrayList.HomeWorl01;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Scanner;

@Data
@NoArgsConstructor
public class StudentManager {
    private final ArrayList<Student> list = new ArrayList<>();
    private final Scanner sc = new Scanner(System.in);

    //    显示菜单
    public void showMenu() {
        String menu = """
                --------------------欢迎使用学生管理系统-----------------
                                    1. 添加学生信息
                                    2. 删除学生信息
                                    3. 修改学生信息
                                    4. 查询学生信息
                                    5. 打印所有学生信息
                                    6. 退出系统
                                    请输入您的选择:
                --------------------------------------------------------
                """;

        loop:
        while (true) {
            System.out.println(menu);
            int op;
            try {
                op = sc.nextInt();
            } catch (Exception e) {
//                核心原理：
//                Scanner 的读取方法只有在成功读取时才会消费缓冲区数据。
//                失败时必须手动清除，否则会导致死循环。
                sc.next();// 清除缓冲区中的非法输入
                System.out.println("输入有误，请重新输入");
                continue;
            }
            switch (op) {
                case 1:
                    System.out.println("添加学生信息");
                    addStudent();
                    break;
                case 2:
                    System.out.println("删除学生信息");
                    deleteStudent();
                    break;
                case 3:
                    System.out.println("修改学生信息");
                    updateStudent();
                    break;
                case 4:
                    System.out.println("查询学生信息");
                    findStudent();
                    break;
                case 5:
                    System.out.println("打印所有学生信息");
                    printAllStudent();
                    break;
                case 6:
                    System.out.println("退出系统");
                    break loop;
                default:
                    System.out.println("输入有误，请重新输入");
                    break;
            }
        }
        System.out.println("欢迎下次再来");
    }

    //校验ID,返回对应的Student对象，或者 null
    private Student checkId(String id) {
        for (Student student : list) {
            if (student.getId().equals(id)) {
                return student;
            }
        }
        return null;
    }

    //    添加学生信息
    private void addStudent() {
        //TODO
        System.out.println("请输入ID:");
        String id = sc.next();
//        先校验id
        Student checked = checkId(id);
        if (checked != null) {
            System.out.println("该ID已存在");
        } else {
            System.out.println("请输入姓名:");
            String name = sc.next();
            System.out.println("请输入年龄:");
            int age = sc.nextInt();
            System.out.println("请输入地址:");
            String address = sc.next();
            Student newStudent = new Student(id, name, age, address);
            list.add(newStudent);
            System.out.println("添加成功");
        }
    }

    //    删除学生信息
    private void deleteStudent() {
        System.out.println("请输入要删除的ID:");
        String id = sc.next();
        Student checked = checkId(id);
        if (checked == null) {
            System.out.println("该ID不存在");
        } else {
            list.remove(checked);
            System.out.println("删除成功");
        }
    }

    //    修改学生信息
    private void updateStudent() {
        System.out.println("请输入要修改的ID:");
        String id = sc.next();
        Student checked = checkId(id);
        if (checked != null) {
            System.out.println("请输入新的姓名:");
            String name = sc.next();
            System.out.println("请输入新的年龄:");
            int age = sc.nextInt();
            System.out.println("请输入新的地址:");
            String address = sc.next();
//        给校验过的对象修改属性
            checked.setName(name);
            checked.setAge(age);
            checked.setAddress(address);
            System.out.println("修改成功");
        } else System.out.println("该ID不存在");
    }

    //    查询学生信息
    private void findStudent() {
        System.out.println("请输入要查询的ID:");
        String id = sc.next();
        Student checked = checkId(id);
        if (checked != null) {
            System.out.println("查询成功");
            System.out.println(checked);
        }
        else System.out.println("该ID不存在");
    }

    //    打印所有学生信息
    private void printAllStudent() {
        for (Student student : list) {
            if (list.isEmpty()) {
                System.out.println("当前没有学生");
                return;
            }
            System.out.println(student);
        }
    }
}
