package oo_08File;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo01 {
    public static void main(String[] args) throws IOException {
        File file0 = new File("D:\\JavaProject\\oo_03GrammarProgression\\src\\oo_08File\\text1.txt");
        File file1 = new File("D:\\", "text1.txt");
        System.out.println("-----------------");
        System.out.println(file0);
        System.out.println(file1);
        System.out.println("------------------");
        String path = file0.getAbsolutePath();
        System.out.println(path);
        System.out.println("-------------------");
        File file2 = new File("b.txt");
        System.out.println("-------------");
//        判断方法
        System.out.println(file0.exists());//判断文件是否存在
        System.out.println(file0.isFile());//判断是否是文件
        System.out.println(file0.isDirectory());//判断是否是文件夹
//        常用方法
//        只能拿到文件的大小，文件夹无法直接获取大小
        System.out.println(file0.length());//拿到文件大小
        System.out.println(file0.lastModified());//拿到最后修改时间(毫秒值)
        System.out.println(file0.getPath());//拿到创建时路径
        System.out.println(file0.getName());//拿到文件名
        System.out.println("-------------------");
//        创建文件
        file2.createNewFile();
//        创建文件夹
        File file3 = new File("D:\\JavaProject\\oo_03GrammarProgression\\src\\oo_08File\\image");
        System.out.println(file3.mkdir());//创建单级文件夹
//        System.out.println(file3.mkdirs());//创建多级文件夹
        System.out.println("--------");
//        删除文件//deleteOnExit()//虚拟机退出时删除
//        file2.delete();//删除文件
//        删除文件夹，不走回收站
//        注意删除多层文件夹时，只能删除最里面的一层
//        文件夹不为空删不掉
//        file3.delete();
        System.out.println("-----------------");
//        遍历File类,适用文件夹
//        listFiles()拿到当前目录下的一级文件或文件夹
        File file4 = new File("D:\\JavaProject\\oo_03GrammarProgression\\src\\oo_07Generics");
        File[] files = file4.listFiles();
        for (File file : files) {
            System.out.println(file.getName());
        }

//        练习
        System.out.println("-------------------");
//        test01();
        System.out.println(test02(20));
        System.out.println("-----------------");
        File file = new File("D:\\JavaProject\\oo_03GrammarProgression\\src\\oo_07Generics");
        test03( file);
    }

    public static void test01() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入文件夹路径：");
            String path = scanner.nextLine();
            File file = new File(path);
            if (!file.exists()) {
                System.out.println("文件夹不存在");
                continue;
            }
//            判断是否为文件夹
            if (!file.isDirectory()) {
                continue;
            }
//            方式一
//            File[] files = file.listFiles();
//            for (File file1 : files) {
//                if (file1.getName().endsWith(".java")) {
//                    System.out.println(file1.getName());
//                }
//            }
//            方式二
            File[] files = file.listFiles(new FilenameFilter() {
                @Override
                public boolean accept(File dir, String name) {
                    return name.endsWith(".java");
                }
            });
            for (File file1 : files) {
                System.out.println(file1.getName());
            }
        }
    }

    public static int test02(int n) {
        if (n == 1) return 1;
        if (n == 2) return 1;
        return test02(n - 1) + test02(n - 2);
    }

    public static void test03(File file) {
        if (!file.exists()) return;
        if (file.isFile()) return ;
        if (!file.isDirectory()){
            System.out.println(file.getName());
            return;
        }
        File[] files = file.listFiles();
        if (files == null) {
            System.out.println("文件夹不可访问");
            return;
        }
        if (files.length == 0) return;
        for (File f : files) {
//            f可能是文件也可能是文件夹
            if (f.isFile()) {
                if (f.getName().endsWith(".java")) {
                    System.out.println(f.getName());
                }
            } else {
                test03(f);
            }
        }
    }
}
