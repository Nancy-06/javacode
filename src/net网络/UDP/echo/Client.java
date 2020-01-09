package net网络.UDP.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/1/7
 */
//客户端
public class Client {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        DatagramSocket socket = new DatagramSocket();
        while(true){
            System.out.println("请输入要发送的消息:");
            String message = scanner.nextLine();
            byte[] sendBuffer = message.getBytes("UTF-8");
           // InetAddress address = InetAddress.getLocalHost();
            //192.168.43.216
            InetAddress address=InetAddress.getByAddress(
                    new byte[]{(byte)192,(byte)168,43,(byte)216});
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
        }

    }
}
