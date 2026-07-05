package TCP;

import java.io.OutputStream;
import java.net.Socket;

public class Cilent {
    public static void main(String[] args) {
//        创建Socket对象
//        在构造器中就要连接服务器(三报文握手)了
        try (Socket socket = new Socket("127.0.0.1", 3550)) {
//            说明连接成功
            OutputStream os = socket.getOutputStream();
            os.write("AAA建材王哥-19245860102".getBytes());//转换为字节数组发送
            os.close();
        }catch (Exception e){
            System.out.println( e);
        }
    }
}
