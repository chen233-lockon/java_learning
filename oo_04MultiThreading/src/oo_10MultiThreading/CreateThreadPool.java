package oo_10MultiThreading;

import java.util.concurrent.*;

public class CreateThreadPool {
    public static void main(String[] args) {
//       创建任务队列
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(100);
//        创建线程工厂
        ThreadFactory factory = Thread::new;
//        创建线程池
        try (ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3,
                6,
                1,
                TimeUnit.SECONDS,
                queue,
                factory,
                new ThreadPoolExecutor.CallerRunsPolicy()
        )) {
            executor.execute(() -> {
                String name = Thread.currentThread().getName();
                System.out.println(name + "开始下载文件");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + "下载完成");
            });
        }
    }
}
