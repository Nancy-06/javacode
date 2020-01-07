package net网络;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * @author guoyao
 * @create 2020/1/7
 */
//服务端
public class server {
    public static void main(String[] args) throws IOException{
        //创建服务器socket,同时还绑定了8888端口，默认绑定的IP是所有IP
        DatagramSocket socket=new DatagramSocket(8888);
        while (true) {
            //准备了一个接受缓冲区
            byte[] buffer=new byte[4096];
            //创建了一个接受报文
            DatagramPacket receivePacket=new DatagramPacket(buffer,0,buffer.length);
            //当receive返回时，os就会把对方发送过来的数据填充到接收缓冲区
            socket.receive(receivePacket);
            //获取世纪收到了数据的长度
            int len=receivePacket.getLength();
            //把字节转化字符
            String message=new String (buffer,0,len,"UTF-8");
            //准备回给对方的消息，回声
            String echMessage=message;
            //把字符转字节
            byte[] sendBuffer=echMessage.getBytes("UTF-8");
            //创建发送报文，带有1.发送缓冲区2.对方的IP  3.对方的port
            DatagramPacket sendPacket=new DatagramPacket(
                    sendBuffer,0,
                    sendBuffer.length,receivePacket.getAddress(),
                    receivePacket.getPort());
            //发送成功只是代表数据发送到网络上，不代表对方收到了
            socket.send(sendPacket);
        }
    }

}
