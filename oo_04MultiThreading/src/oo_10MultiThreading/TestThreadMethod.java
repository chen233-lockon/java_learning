package oo_10MultiThreading;
//    getName() 获取当前线程名称
//    setName() 设置当前线程名称,构造方法也行
//    sleep() 线程休眠
//    currentThread() 获取当前正在执行的线程对象
//    setPriority() 设置当前线程的优先级[1,10];
//    getPriority() 获取当前线程的优先级
//    设置为守护线程后,当所有非守护线程执行完毕后,守护线程会自动结束
//    setDaemon() 设置当前线程为守护线程
public class TestThreadMethod {
    public static void main(String[] args) throws InterruptedException {
//        testPriority();
        testDaemon();
    }
    public static void testPriority(){
        Thread t1 = new Thread(() -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 100; i++) {
                System.out.println(name +  "->>" +i);
            }
        }, "线程1");
        t1.setPriority(Thread.MIN_PRIORITY);
        Thread t2 = new Thread(() -> {
            String name = Thread.currentThread().getName();
            for (int i = 0; i < 100; i++) {
                System.out.println(name + "->>" +i);
            }
        }, "线程2");
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
    public static void testDaemon() throws InterruptedException {
        System.out.println("测试开始");
        Thread t = new Thread(() -> {
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("守卫线程" + i);
            }
        }, "守卫线程");
        t.setDaemon(true);
        t.start();
        Thread.sleep(2000);
        System.out.println("测试结束");
    }
}
