package oo_09IOStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.function.Consumer;

//Properties其实就是一个Map集合
//注意：内部键和值都是 String 字符串
//内部存在着两个方法，可以很方便的将集合中的键值对写入文件，也可以方便的从文件中读取将来加载配置文件的时候很方便
//1.Properties 作为集合的使用
//2.Properties 中和流有关的方法(操作配置文件)
public class IO06PropertiesDemo {
    public static void main(String[] args) throws IOException {

//        一、Properties 作为集合的使用(了解)
        show1();
        System.out.println("------------------");
//        二、Properties 中和流有关的方法(使用配置文件)
        show2();
    }
    public static void show1(){
        Properties properties = new Properties();
        properties.setProperty("username","张三");//添加(修改)键值对
        properties.setProperty("username","李四");
        properties.setProperty("password","123456");
        System.out.println(properties.getProperty("username"));//获取
        System.out.println("----------------");
        properties.stringPropertyNames().forEach(key -> {
            System.out.println(key + ":" + properties.getProperty(key));
        });//stringPropertyNames()获取所有的key
    }
    //        load(加载)和store(写入) 方法
    public static void show2() throws IOException {
        System.out.println("---------load---------");
        Properties properties = new Properties();
//        创建文件输入流,管理配置文件myConfig
        FileReader fr = new FileReader("myConfig.properties");
//        加载配置文件
        properties.load(fr);
//        遍历
        properties.forEach((k,v) ->{
            System.out.println(k + ":" + v);
        });
        fr.close();
        System.out.println("-------store----------");
//        store模拟用户配置信息（写入）
        Properties properties1 = new Properties();
        properties1.setProperty("username","zhangsan");
        properties1.setProperty("password","123456");
        properties1.setProperty("url","jdbc:mysql://localhost:3306/test");
//        创建一个文件输出流
        FileWriter fw = new FileWriter("myConfig.properties");
//        写入配置文件
        properties1.store(fw,"用户配置信息");
        fw.close();
    }
}
