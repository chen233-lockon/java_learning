package oo_10MultiThreading;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
@AllArgsConstructor
@NoArgsConstructor
//练习：多线程下载图片
public class TestThread02 extends Thread {
    private String url;//图片url
    private String path;//文件名
    @Override
    public void run() {
        WebDownloader dl = new WebDownloader();
        dl.downloader(url,path);
        System.out.println("下载完成");
        System.out.println("文件名为：" +  path);
    }

    public static void main(String[] args) {

        TestThread02 t1 = new TestThread02("https://img0.baidu.com/it/u=2975129035,1682864465&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500","1.jpg");
        TestThread02 t2 = new TestThread02("https://img0.baidu.com/it/u=2975129035,1682864465&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500","2.jpg");
        TestThread02 t3 = new TestThread02("https://img0.baidu.com/it/u=2975129035,1682864465&fm=253&fmt=auto&app=138&f=JPEG?w=500&h=500","3.jpg");
//        线程同时执行
        t1.start();
        t2.start();
        t3.start();
    }
}
//下载器
class WebDownloader{
//  下载方法
    public void downloader(String url,String path){
        try {
            FileUtils.copyURLToFile(new URL(url),new File(path));
        } catch (IOException e) {
            System.out.println("IO异常，downloader方法失败");
        }
    }
}
