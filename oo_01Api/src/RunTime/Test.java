package RunTime;

import java.io.IOException;

//RunTime与JVM运行时环境交互，
// 单例模式，通过静态方法RunTime.getRuntime()获取运行时对象
public class Test {
    public static void main(String[] args) throws IOException {
//        不能在外部实例化
        Runtime rt = Runtime.getRuntime();//获取运行时对象
        int processors = rt.availableProcessors();//获取CPU的核数
        System.out.println( processors);//我的电脑是8核
        System.out.println("-----------------");
        System.out.println(rt.totalMemory()*1.0/1024/1024 + "MB");//获取JVM总内存
        System.out.println(rt.freeMemory()*1.0/1024/1024 + "MB");//获取JVM空闲内存
        System.out.println(rt.maxMemory()*1.0/1024/1024 + "MB");//获取JVM最大内存
        System.out.println("-----------------");
        rt.gc();//手动运行垃圾回收器
//        执行外部命令shutdown /r关机,/a 取消关机
        rt.exec("shutdown /r");

    }
}
