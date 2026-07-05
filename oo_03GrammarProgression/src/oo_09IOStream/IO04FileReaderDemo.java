package oo_09IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;

//FileReader 字符输入流:用于读取纯文本文件，解决中文乱码问题
//构造方法接收String fileName或File file，以字符串或文件的形式给出,等
//方法
//int read()，读取单个字符，返回一个int，如果返回-1，则表示文件末尾
//int read(char[] c)将字符读入数组，返回实际读取的字符个数，如果返回-1，则表示文件末尾
public class IO04FileReaderDemo {
    public static void main(String[] args) {
//        读取data.txt文件
//        通过Charset.defaultCharset()和Charset.forName()指定编码集
        try( FileReader fr = new FileReader("data.txt", Charset.defaultCharset())) {
//            返回的是字符的编码
            int read = fr.read();
            System.out.println( read);
            System.out.println( (char) read);
            System.out.println( "------------------");
//            字符缓冲区
            char[] buffer = new char[20];
//            返回的是有效的字符个数
//            String的构造器转换为字符串
            if (read != -1){
                int read1 = fr.read(buffer);
                System.out.println(read1);
                String readStr = new String(buffer, 0, read1);
                System.out.println(readStr);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
