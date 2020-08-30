package company.offer;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Udpdemo1 {
    public static void main(String args[]) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String str = " i  love  you";
        //将数据封装到数据包中
        DatagramPacket packet = new DatagramPacket(str.getBytes(), str.length(), InetAddress.getByName("localhost"), 8000);
        //发送
        socket.send(packet);

        byte[] buff = new byte[100];
        DatagramPacket packet2 = new DatagramPacket(buff, 100);
        //接受
        socket.receive(packet2);
        System.out.println(new String(buff, 0, packet.getLength()));
        socket.close();


    }
}
