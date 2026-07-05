package oo_10MultiThreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test implements Runnable {
    private int num = 1;
    private static final int MAX = 50;
    Lock lock = new ReentrantLock();
    @Override
    public void run() {
        while (true){
            lock.lock();
            try {
                if (num > MAX) return;

                String name = Thread.currentThread().getName();
                    System.out.println(name + ":" + num++);
            }finally {
                lock.unlock();
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void main(String[] args) {
        Runnable runnable = new Test();
        Thread t1 = new Thread(runnable, "线程A");
        Thread t2 = new Thread(runnable, "线程B");
        t1.start();
        t2.start();
    }
}
