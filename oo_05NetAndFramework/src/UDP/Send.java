package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Send {
    public static void main(String[] args) {
//        发送数据
        try (DatagramSocket socket = new DatagramSocket()) {
            byte[] bytes = "老师 菜菜 教教".getBytes();
            InetAddress inetAddress = InetAddress.getLocalHost();
            int port = 8888;
            DatagramPacket packet = new DatagramPacket(bytes,0, bytes.length, inetAddress, port);
            socket.send(packet);
            System.out.println("发送完毕");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
