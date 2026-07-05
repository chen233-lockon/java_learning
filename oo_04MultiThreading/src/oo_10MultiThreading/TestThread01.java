package oo_10MultiThreading;
//方式一、1.继承Thread类，2.重写run方法，3.创建自定义线程对象使用start方法启动线程
//注意：线程开启不一定立即执行，而是由CPU调度

public class TestThread01 extends  Thread {//限制了类的单继承性，不推荐
    @Override
    public void run() {
        // 线程执行体
        for (int i = 0; i < 5; i++) {
            System.out.println("我在看代码");
        }
    }

    public static void main(String[] args) {
//        创建线程对象，调用start方法启动该线程
        TestThread01 t = new TestThread01();
        t.start();//调用run方法会先后顺序执行，而不是交替
//        main主线程
        for (int i = 0; i < 40; i++) {
            System.out.println("我在学习多线程");
        }
//        两条线程，执行结果是交替执行
    }
}
