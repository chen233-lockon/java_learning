package oo_09IOStream;
//常用工具类FileUtil,IOUtil,HttpUtil等
import cn.hutool.core.io.FileUtil;
import cn.hutool.http.HttpUtil;

import java.util.List;

public class IO07HuTool {
    public static void main(String[] args) {
//        复制文件文件夹
        FileUtil.copy("D:\\JavaProject\\a.txt","D:\\JavaProject\\b.txt",true);
        List<String> strings = FileUtil.readLines("D:\\JavaProject\\b.txt", "utf-8");
        System.out.println( strings);
//        删除移动读写等功能
//        http
//        System.out.println(HttpUtil.get("https://www.baidu.com"));
    }
}
