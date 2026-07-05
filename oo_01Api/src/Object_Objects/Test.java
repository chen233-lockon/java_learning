package Object_Objects;

//Object类是所有类的父类，根类，所有对象都继承Object类
//常用方法：toString()，默认返回对象地址值
//         equals()，默认比较地址值，返回布尔值
//Objects类与Object是继承关系，且Objects类是静态类
//常用方法：equals()，比较两个对象是否相等，返回布尔值
//         isNull()，判断对象是否为null，返回布尔值
public class Test {
    public static void main(String[] args) {
        Person p1 = new Person("小王",18);
        Person p2 = new Person("小王",20);
        System.out.println(p1.equals(p2));
    }
}
