package com.learn.J3_operator;

public class OperatorDemo2 {
    static void main() {
//        1.定义变量记录秒数
        int seconds = 3661;
//        2.获取小时数
        int hours = seconds/3600;
        System.out.println("小时数为：" +  hours);
//        3.获取分钟数 总秒数减去小时数，再除以60
//        3661%3600为分钟的秒数
        int minutes = seconds%3600/60;
        System.out.println("分钟数为：" + minutes);
//        4.获取秒数
        int seconds1 = seconds%3600%60;
        System.out.println("秒数为：" + seconds1);
    }
}
