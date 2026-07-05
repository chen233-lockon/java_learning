package oo_09IOStream;

public class MyAutoCloseable implements AutoCloseable {
    @Override
    public void close() throws Exception {
        System.out.println("我的资源关闭了");
    }
}
