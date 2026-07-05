package oo_10MultiThreading;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//安全问题出现的条件:1.是多线程环境2.有共享数据3.多条语句访问同一个数据(上锁可以解决)
//多个线程访问同一个资源，线程不安全
//抢购演唱会票,出现重复
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TestThread04 implements Runnable {
    private int ticketNumbs = 10;
    @Override
    public void run() {
        while (true){
            if(ticketNumbs <= 0) break;
//        模拟延时
            try {
                Thread.sleep(200);
            }catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
            System.out.println(Thread.currentThread().getName() + "买到了第" + ticketNumbs-- + "张票");
        }
    }

//    测试类
    public static void main(String[] args) {
//        创建一个卖票任务
        Runnable t = new TestThread04();
//        三种买票渠道
        new Thread(t,"小陈").start();
        new Thread(t,"小奉").start();
        new Thread(t,"黄牛").start();
    }
}

