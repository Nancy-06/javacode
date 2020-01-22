package net网络.TCP.echo;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/1/9
 */
//服务端
    //你发什么，我回什么
public class Server {
    public static void main(String[] args) throws IOException {
        //监听socket
        ServerSocket serverSocket=new ServerSocket(8888);
        while(true){
            //双方通信
            System.out.println("等待client连接");
            //等待客户端连接，没人连接我就不返回；
            Socket socket=serverSocket.accept();
            System.out.println("有client连接上来");
            InputStream is=socket.getInputStream();
            OutputStream os=socket.getOutputStream();
            PrintWriter printWriter=new PrintWriter(new OutputStreamWriter(os,"UTF-8"),
                    false);
            Scanner scanner=new Scanner(is,"UTF-8");
            while(scanner.hasNext()){
                //等待对方发来的数据中找到\r\n，没找到就不往下走
                String message=scanner.nextLine();
                System.out.println("收到对方的消息："+message);
                String responseMessage=message;
                System.out.println("发给对方的消息："+responseMessage);
                printWriter.println(responseMessage);
                printWriter.flush();    //刷新
            }
            socket.close();
        }
    }
}
