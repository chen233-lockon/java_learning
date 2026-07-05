package com.learn.oop.oopprogress01;

public class TestStudentStatic {
//    测试类
//    main方法公共,静态,返回值类型为void,固定名称
    public static void main(String[] args) {
        StudentStatic stu1 = new StudentStatic();
        stu1.name = "小诗诗";
        stu1.age = 19;
//        stu1.teacher = "小王老师";//不推荐
        StudentStatic.teacher = "小雯老师";
        StudentStatic stu2 = new StudentStatic();
        stu2.name = "小丹丹";
        stu2.age = 20;
        System.out.println("--------static修饰成员属性--------");
//       打印老师
        System.out.println(stu1.name + "的老师是" + stu1.teacher);
        System.out.println(stu2.name + "的老师是" + stu2.teacher);
        System.out.println("--------修改后--------");
        stu1.teacher = "阿伟老师";
        System.out.println(stu1.name + "的老师是" + stu1.teacher);
        System.out.println(stu2.name + "的老师是" + stu2.teacher);
        System.out.println("--------static修饰成员方法(应用：工具类)--------");
//      报错，因为私有化构造方法了
//        UtilStatic ur = new UtilStatic();
//        创建数组
        int[] arr = {10,20,30,40,50};
//        遍历数组//使用工具类的方法。类名.方法名
        String result =  UtilStatic.printArr(arr);
        System.out.println(result);
//        获取平均数//使用工具类
        double avg = UtilStatic.getAverage(arr);
        System.out.println("平均值为:"+avg);
    }
}
