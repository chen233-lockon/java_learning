package com.learn.J2_variable;

public class VariableDemo2 {
     public static void main(String[] args) {
   /* 标识符规范：
        数字：0-9
        字母：a-z && A-Z
        下划线：_
        特殊字符：$
        严格区分大小写
        标识符不能以数字开头
        标识符不能使用关键字
    Java见名知义，驼峰命名*/
//        小驼峰命名(方法、变量) name,age,height,appleX,appleCount
        /*大驼峰命名(类、接口) Apple,AppleCount,AppleX
        常量：常量名 = 值
        常量名必须使用全大写
        常量名多单词使用下划线*/
//  取值范围大小,double,float,long,int,short,byte
//  基本数据类型：整形byte(1字节) short(2字节) int(4) long(8) 浮点型float(4) double(8) 字符型char(2)(C语言中占1) 布尔值boolean(1)
    byte b = 127;
    short s = 32767;
    int i = 2147483647;
    long l = 9223372036854775807L;//注意：需要后缀L或l
    float f = 3.4028235E38f;//注意：需要后缀f或F
    double d = 1.7976931348623157E308;//注意：可不加需要后缀D或d
    char c = '哈';//注意：字符型变量需要加单引号,计算为ascll码参与运算
    char g  =123;
    boolean bool = true;
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(c);
        System.out.println(bool);
        System.out.println(g);//按照码表输出
//    计算BMI
        double height = 1.69;
        double weight = 68.2;
        System.out.println("你的BMI为:" + weight / (height * height));
//        在当前身高下，在标准BMI下，最多是多少千克
        System.out.print("在当前身高下，在标准BMI下，最多是" + 23.9*(height*height));
    }
}
