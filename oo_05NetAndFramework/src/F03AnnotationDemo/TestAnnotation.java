package F03AnnotationDemo;
//自定义注解
//理解：注释是给人看的，注解是给编译器或虚拟机看的。
//通过注解可以给类增加额外的信息。
//编译器或JVM可以根据注解来完成对应的功能
//属性类型 :
            //基本数据类型
            //String
            //Class
            //注解
            //枚举
            //以上类型的一维数组
//理论可以再任意位置使用，但是一般会加一个注解(元注解)限制位置
//元注解@ Target，@Retention

/**
 * 生命周期
 * 1.源码阶段，只在源码阶段可见
 * 2.字节码阶段,只在字节码阶段可见,但是加载字节码时会被删除(默认)
 * 3.运行阶段，在运行时可见
 * */
public class TestAnnotation {
//反射获取Student的注解，以及对象的属性值
//    获取字节码对象
public static void main(String[] args) {
    Class<Student> studentClass = Student.class;
//    获取注解对象
    MyAnnotation annotation = studentClass.getAnnotation(MyAnnotation.class);
    String name = annotation.name();
    int age = annotation.age();
    System.out.println("name:" + name + " age:" + age);
}
}
