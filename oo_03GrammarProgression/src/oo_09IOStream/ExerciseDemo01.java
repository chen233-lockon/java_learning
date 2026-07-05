package oo_09IOStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
//文件拷贝
public class ExerciseDemo01 {
    public static void main(String[] args) {
// 创建输入流对象读取文件
//创建输出流对象关联数据目的
//读写操作
//关流释放资源
        String sourcePath = "D:\\classfile\\java入门\\day16-多线程、网络编程\\ppt\\19.第十九章：网络编程.pptx";
        String targetPath = "D:\\\\classfile\\\\java入门\\\\day15-File、IO流\\\\ppt\\\\19.第十九章：网络编程.pptx";
        try(FileInputStream fis = new FileInputStream(sourcePath);
            FileOutputStream fos = new FileOutputStream(targetPath)) {

            byte[] bytes = new byte[1024*8];
            int len;

            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes,0,len);
            }

            System.out.println("复制完成");
            System.out.println("源文件：" + sourcePath);
            System.out.println("目标文件：" + targetPath);

        }catch ( IOException e){
            System.out.println("文件复制失败" + e.getMessage());
            e.printStackTrace();
        }
    }
}
