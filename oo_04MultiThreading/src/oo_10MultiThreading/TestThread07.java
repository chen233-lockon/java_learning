package oo_10MultiThreading;

import java.util.concurrent.*;

//线程池(ThreadPoor)：将线程对象交给线程池维护可以降低系统成本从而提升程序的性能
//JDK提供的线程池：
// Executors创建不推荐
//(等一分钟退出
// newCachedThreadPool()创建一个默认的线程池
//一直不会退出，懒加载
// newFixedThreadPool()创建一个指定最多线程数量的线程池)

public class TestThread07 {
    public static void main(String[] args) {
        //        不推荐
//        newCachedThreadPoolTest();
        //推荐自定义线程池,一般封装为工具类
//        创建任务队列,空参代表无界队列
        BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(5);
//        创建线程工厂
//        ThreadFactory factory = new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                return new Thread(r);
//            }
//        };
        ThreadFactory factory = Thread::new;
//        创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3,
                5,
                1,
                TimeUnit.SECONDS,
                queue,
                factory,
                new ThreadPoolExecutor.AbortPolicy()
                //四种策略：1.CallerRunsPolicy(谁在调用谁处理) 2.DiscardOldestPolicy(丢最老的) 3.DiscardPolicy(丢弃) 4.AbortPolicy()（默认丢弃抛异常）
        );
//        测试
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


    private static void newCachedThreadPoolTest() {
        Executor executorService = Executors.newCachedThreadPool();
//       执行任务runnable
        executorService.execute(new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                System.out.println(name + "开始下载文件");
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(name + "下载完成");
            }
        });
    }
}
