package oo_10MultiThreading;

//线程同步方案:
// 一.同步代码块synchronized(锁的对象){}
//锁对象可以是任意对象，但是需要保证多条线程的锁对象，是同一把锁
//同步可以解决多线程的数据安全问题，但是也会降低程序的运行效率
// 二.同步方法synchronized关键字
//方法分为静态和非静态
//静态方法的锁对象是字节码对象，非静态方法的锁对象是 this
// 三.Lock锁
//使用 Lock 锁，我们可以更清晰的看到哪里加了锁，哪里释放了锁
//Lock 是接口，无法直接创建对象
//构造方法：public ReentrantLock()
//void lock()上锁
//void unlock();开锁


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TestThread06 implements Runnable {
    private int ticketNumbs = 10;
    //    共用一把锁才能达到效果
    Lock lock = new ReentrantLock(true);//公平模式

    @Override
    public void run() {
//        一、同步代码块
//        synchronize();
//        二、同步方法
//        while ( true){
//            System.out.println(Thread.currentThread().getName() + "正在排队");
//            if (synchronizedMethod()) break;
//        }
//        三、Lock锁
          lockOn();
    }

    private void synchronize() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "正在排队");
//            锁住当前对象，其他线程只能排队等待操作完毕才能访问
            synchronized (this) {
                if (ticketNumbs <= 0) break;
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    System.out.println(e.getMessage());
                }
                System.out.println(Thread.currentThread().getName() + "买到了第" + ticketNumbs-- + "张票");
            }
        }
    }

    private synchronized boolean synchronizedMethod() {
        if (ticketNumbs <= 0) return true;
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(Thread.currentThread().getName() + "买到了第" + ticketNumbs-- + "张票");
        return false;
    }

    private void lockOn() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + "正在排队");
            lock.lock();
            if (ticketNumbs <= 0) {
                lock.unlock();//全部情况都要释放锁
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + "买到了第" + ticketNumbs-- + "张票");
            lock.unlock();
        }
    }


    //    测试类
    public static void main(String[] args) {
//        创建一个卖票任务
        Runnable t = new TestThread06();
//        三种买票渠道
        new Thread(t, "小陈").start();
        new Thread(t, "小奉").start();
        new Thread(t, "黄牛").start();
    }
}
