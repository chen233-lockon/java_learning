package oo_09IOStream;
//FileWriter 字符输出流
//        构造函数和FileOutputStream一样
//        方法：write(),写出单个字符、字符串、字符数组、或者字符串和字符数组的一部分

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

/**
 * 注意:字符输出流写出数据，需要调用flush或close方法，数据才会写出
 *
 * flush后可以继续写出
 * close 后不能继续写出
 * */
public class IO05FileWriterDemo {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("dataTest.txt", Charset.forName("GBK"), true)) {
//           先写入缓冲区，程序结束再一起写入文件
//            flush和close方法刷新缓冲区,立即写入文件
//           不会自动换行
            fw.write("我喜欢你\r\n");
            fw.flush();
            fw.write("你喜欢我吗？\r\n");
            fw.close();
            fw.write("我好喜欢你呀\r\n",2,3);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
