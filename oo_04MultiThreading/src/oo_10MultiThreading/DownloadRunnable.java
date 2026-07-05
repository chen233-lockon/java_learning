package oo_10MultiThreading;

public class DownloadRunnable implements Runnable{
    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 1; i <= 100; i++) {
            System.out.println(name + "下载了" + i + "%");
        }
    }

    public static void main(String[] args) {
        Runnable runnable = new DownloadRunnable();
        Thread t = new Thread(runnable);
        t.start();
    }
}
