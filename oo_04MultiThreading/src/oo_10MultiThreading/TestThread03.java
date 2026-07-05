package oo_10MultiThreading;
//方式二、实现Runnable接口，重写run方法，执行线程需要丢入到runnable接口的实现类如（Thread）
//方便一个对象被多个线程共享
public class TestThread03 implements Runnable {//可以多实现，推荐，无返回值
    @Override
    public void run() {
        // 线程执行体
        for (int i = 0; i < 5; i++) {
            System.out.println("我在看代码");
        }
    }

    public static void main(String[] args) {
//创建runnable的实现类对象
        Runnable t = new TestThread03();//多态
//        TestThread03 t = new TestThread03();
//创建线程对象，通过线程对象来开启线程，Thread代理
//        Thread thread = new Thread(t);
//        thread.start();
        new Thread(t).start();

        for (int i = 0; i < 20; i++){
            System.out.println("我在学习多线程");
        }
    }
}