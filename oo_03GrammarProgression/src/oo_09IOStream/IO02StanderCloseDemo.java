package oo_09IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

//标准的异常IO处理try-catch-finally
public class IO02StanderCloseDemo {
    public static void main(String[] args){
        //        JDK7以前的处理方式
        test1();
        //        JDK7后的处理方式
        test2();
        //        实现AutoCloseable接口重写close方法，都可以自动关闭资源
        test3();
    }
    private static void test1() {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("data.txt", true);
            fos.write(97);
            fos.write(98);
            fos.write(99);
            byte[] bytes = "HelloWorld".getBytes();
            fos.write(bytes);
            byte[] bytes1 = {97,98,99,100,101,102,103};
            fos.write(bytes1,1,3);
        }catch (IOException e){
            System.out.println("文件输出异常");
        }finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            }catch (IOException e){
                System.out.println("文件关闭异常");
            }
        }
    }

    private static void test2() {
//        try-with-resources自动关闭资源，只要实现了AutoCloseable接口的类重写close，都可以放在try()中
//        将资源放在try()中，自动调用close()方法
        try (FileOutputStream fos = new FileOutputStream("data.txt", true)) {
                fos.write(97);
                fos.write(98);
                fos.write(99);
                byte[] bytes = "HelloWorld".getBytes();
                fos.write(bytes);
                byte[] bytes1 = {97, 98, 99, 100, 101, 102, 103};
                fos.write(bytes1, 1, 3);
        } catch (IOException e) {
            System.out.println("文件输出异常");
        }
    }

    private static void test3() {
        try(MyAutoCloseable myAutoCloseable = new MyAutoCloseable()){

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
