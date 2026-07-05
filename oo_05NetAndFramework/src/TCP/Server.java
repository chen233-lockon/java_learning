package TCP;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ThreadPoolExecutor;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        serverSocket.setReuseAddress(true);//端口复用
        serverSocket.bind(new InetSocketAddress(3550));
        try (serverSocket) {
            ThreadPoolExecutor pool = ThreadPool.threadPool();
            System.out.println("等待连接中.......");
            while (true) {
                Socket socket = serverSocket.accept();
                System.out.println("连接成功");
                pool.execute(() -> handleClient(socket));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    private static void handleClient(Socket socket) {
        try (InputStream is = socket.getInputStream()) {
            byte[] bytes = is.readAllBytes();
            System.out.println(new String(bytes));
        } catch (Exception e) {
            System.out.println(e);
        }
        try {
            socket.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
