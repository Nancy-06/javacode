package net网络;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

/**
 * @author guoyao
 * @create 2020/1/7
 */
//客户端
public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        String message = "宫保鸡丁";
        byte[] sendBuffer = message.getBytes("UTF-8");
        InetAddress address = InetAddress.getLocalHost();
        int port = 8888;
        DatagramPacket sendPacket = new DatagramPacket(
                sendBuffer, 0,
                sendBuffer.length, address, port
        );
        socket.send(sendPacket);
        byte [] receiveBufer=new byte[4096];
        DatagramPacket receivePacket=new DatagramPacket(receiveBufer,0,receiveBufer.length);
        socket.receive(receivePacket);
        String echoMessage=new String(receiveBufer,0,receivePacket.getLength(),"UTF-8");
        System.out.println(echoMessage);
        socket.close();

    }
}
