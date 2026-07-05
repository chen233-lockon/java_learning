package TCP;

import java.util.concurrent.*;

public class ThreadPool {
    private static final BlockingQueue<Runnable> queue = new LinkedBlockingQueue<>(5);
    private static final ThreadFactory factory = new ThreadFactory() {
        private int count = 0;
        @Override
        public Thread newThread(Runnable r) {
            return new Thread(r, "Server-Thread-" + (++count));
        }
    };
    public static ThreadPoolExecutor threadPool() {
//        创建线程池
        ThreadPoolExecutor executor = new ThreadPoolExecutor(
                3,
                5,
                1,
                TimeUnit.SECONDS,
                queue,
                factory,
                new ThreadPoolExecutor.DiscardOldestPolicy()
                //四种策略：1.CallerRunsPolicy(谁在调用谁处理) 2.DiscardOldestPolicy(丢最老的) 3.DiscardPolicy(丢弃) 4.AbortPolicy()（默认丢弃抛异常）
        );
        return executor;
        }
}
