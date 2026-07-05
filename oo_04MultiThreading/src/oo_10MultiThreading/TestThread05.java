package oo_10MultiThreading;

import cn.hutool.core.io.FileUtil;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.concurrent.*;

/**
 * 1.创建一个类实现Callable接口，重写call方法，有返回值
 * 2.创建FutureTask(runnable子类)对象，构造方法中传入Callable接口实现类对象
 * 3.创建Thread对象，构造方法中传入FutureTask对象
 * 4.启动线程，调用start方法
 * 5.获取结果，调用FutureTask对象get方法,获取call方法返回的结果
 * */
public class TestThread05  implements Callable<Long> {
    @Override
    public Long call() throws Exception {
//        统计某个文件夹的大小
        File file = new File("D:\\JavaProject");
        long sized = FileUtil.size(file, true);
        return sized;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {
        Callable<Long> callable = new TestThread05();
//        本质是一个有返回值的runnable孙子类
        FutureTask<Long> task = new FutureTask<>(callable);
        Thread t = new Thread(task);
        t.start();
//        获取task返回的结果
//        设置超时时间（可选）
        Long l = task.get(5, TimeUnit.SECONDS);//阻塞主线程，等待子线程执行完毕
        System.out.println("文件夹大小为：" + l);
    }
}
