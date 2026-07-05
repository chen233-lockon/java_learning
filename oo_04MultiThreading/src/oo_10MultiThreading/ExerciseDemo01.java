package oo_10MultiThreading;
//模拟龟兔赛跑
public class ExerciseDemo01 implements Runnable {
//    胜利者
    private static  String winner;
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
//            模拟兔子睡觉
            if (Thread.currentThread().getName().equals("兔子")) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
//            判断是否完成比赛
            if (gameOver(i)){
                break;
            }
            System.out.println(Thread.currentThread().getName() + "-->跑了" + i + "步");
        }
    }
//    判断是否完成比赛
    private boolean gameOver(int steps){
//        判断是否胜利
        if (winner != null){
            return true;
        }else {
            if(steps >= 100){
                winner = Thread.currentThread().getName();
                System.out.println("winner is" +  winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ExerciseDemo01 t1 = new ExerciseDemo01();
        new Thread(t1,"兔子").start();
        new Thread(t1,"乌龟").start();
    }

}
