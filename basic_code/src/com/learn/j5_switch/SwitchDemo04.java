package com.learn.j5_switch;

public class SwitchDemo04 {
    public static void main(String[] args) {
//        String a = "world";
//        System.out.println("hello");//输出并换行
//        System.out.printf("hello %s",a);//格式化输出，不换行
//        System.out.print("hello");//不换行
//        System.out.print("hello");
//        外行内列
        printRectangle();
        printTriangle();
        printReTriangle();
        printWhiteAndBlack();
        printMultiply();
        exhancedFor();
    }


    private static void exhancedFor() {
        int[] arr = {1,2,3,4,5};
//        for(元素类型 变量 : 数组/集合)
//        增强for循环//语法糖，编译底层仍是普通for循环
        for (int j : arr) {
            //注意:J不是索引，就是数组元素本身
            System.out.println(j);
        }
    }

    public static void printRectangle(){
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------");
    }
    public static void printTriangle(){
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------");

    }
    public static void printReTriangle(){
        for (int i = 5; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("--------------");

    }
    public static void printWhiteAndBlack(){
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if((i + j)%2 ==0){
                    System.out.print(" □ ");
                }
                else{
                    System.out.print(" ■ ");
                }
            }
            System.out.println();
        }
        System.out.println("--------------");

    }
    public static void printMultiply(){
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d×%d=%d ",j,i,i*j);
            }
            System.out.println();
        }
        System.out.println("--------------");
    }
}
