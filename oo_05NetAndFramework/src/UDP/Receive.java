package UDP;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Receive {
    public static void main(String[] args) {
        try (DatagramSocket socket = new DatagramSocket(8888)) {
            byte[] bytes = new byte[1024*64];
            DatagramPacket packet = new DatagramPacket(bytes,0, bytes.length);
            System.out.println("接收开始");
            socket.receive(packet);
            System.out.println("接收完毕");
            byte[] data = packet.getData();
            int length = packet.getLength();
            System.out.println(new String(data,0,length));
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
