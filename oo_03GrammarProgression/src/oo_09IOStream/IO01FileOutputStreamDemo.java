package oo_09IOStream;

import java.io.FileOutputStream;
import java.io.IOException;

//IO流体系结构：
//        字节流(万能流)：(抽象类)InputStream和OutputStream -> (实现类)FileInputStream和FileOutputStream
//        字符流(纯文本文件)：(抽象类)Reader和Writer ->(实现类)FileReader和FileWriter
public class IO01FileOutputStreamDemo
{
    public static void main(String[] args) throws IOException {
//        todo:FileOutputStream在当前项目中写出去一个文件，内容是abc
//        创建FileOutputStream对象
//        文件不存在会自动创建
//        一、创建流对象(打开文件)
//        构造函数：FileOutputStream(String path 或者 File file)，还有可选追加模式
        FileOutputStream fos = new FileOutputStream("data.txt", true);//追加模式
//        二、、写入数据
        fos.write(97);
        fos.write(98);
        fos.write(99);
//        写一串字符
//        默认字符集为UTF-8
        byte[] bytes = "HelloWorld".getBytes();
        fos.write(bytes);
        byte[] bytes1 = {97,98,99,100,101,102,103};
        fos.write(bytes1,1,3);//数组、起始索引、长度
//        释放流
//        三、关闭文件
        fos.close();
    }
}
