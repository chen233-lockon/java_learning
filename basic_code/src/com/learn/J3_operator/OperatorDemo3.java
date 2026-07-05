package com.learn.J3_operator;

public class OperatorDemo3 {
     public static void main(String[] args) {
//        数字运算：类型不一样不能运算，必须先转成同类型(按照取值范围来，浮点数采用科学计数法)
//        （byte(1)<short(2) & char(2)<int(4)<long(8)<float(4)<double(8)）
//        1.从小转成大(隐式转换)前面补0
//        1.1 byte和 short和char自动提升为int参与计算
//        1.2 取值范围小的提升为取值范围大的参与计算
//        1.3 布尔值不参与运算
        byte a = 10;
        byte b = 20;
        int c = a + b;//结果为int类型
        byte A = 10;
        double B = 20.3;
        double C = A + B;//结果为double类型
//        2.从大转成小(显式转换)(强制转换，去0可能会丢失精度)
        int a1 = 13;
        byte b1 = (byte) a1;
         System.out.println(b1);
        byte a2 = 10;
        byte b2 = 20;
        byte c2 = (byte) (a2 + b2);
         System.out.println(c2);
//       练习一
        byte d = 100;
        short e = 200;
        double f = 20.3;
//        说出在计算时的类型转换情况
//        1(d + e)转换为int类型
//        2结果（d+e）+f 转换为double类型
        double result = d + e + f;
        System.out.println(result);
     }
}
