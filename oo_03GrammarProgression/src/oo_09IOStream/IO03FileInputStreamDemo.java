package oo_09IOStream;
//字节输入流
//成员方法
//read()，读取一个字节，返回一个int，如果返回-1，则表示文件末尾
//read(byte[] b)，将字节读入数组，返回实际读取的字节数，如果返回-1，则表示文件末尾

import java.io.FileInputStream;
import java.io.IOException;

public class IO03FileInputStreamDemo {
    public static void main(String[] args) {
//        创建输入流对象
        try( FileInputStream fis = new FileInputStream("data.txt")) {
////            一次读一个
//            int i1 = fis.read();
//            System.out.println((char) i1);
//            int i2 = fis.read();
//            System.out.println((char)i2);
////            一次读到数组中,一次8kb最好
//            byte[] bytes = new byte[4];
//            int count = fis.read(bytes);//返回读到的字节个数
//            System.out.println(count);
//            System.out.println(Arrays.toString( bytes));
//            System.out.println("-----------------");
//            byte[] bytes1 = new byte[20];
//            int count1 = fis.read(bytes);
//            System.out.println(count1);
//            System.out.println(Arrays.toString(bytes1));
            byte[] bytes = new byte[1024*8];//缓冲区
            int len;
//            do {
//                len = fis.read(bytes);
////                将字节数组转换成字符串
//                if (len != -1){//避免读取到末尾时，越界
//                    String s = new String(bytes,0,len);//len是实际读取的字节个数
//                    System.out.println( s);
//                }
//            }while (len != -1);
            System.out.println("-----------------");
            while ((len = fis.read(bytes)) != -1){
                String s = new String(bytes,0,len);
                System.out.println(s);
            }
////            一次读完，不适合读大文件
//            byte[] readAllBytes = fis.readAllBytes();
//            String s = new String(readAllBytes);
//            System.out.println(s);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
