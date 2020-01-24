package net网络.TCP.echo.short_connection;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/1/9
 */
//短连接,一次一条
    //服务端
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        while(true){
            System.out.println("等待连接");
            Socket socket=serverSocket.accept();
            System.out.println("连接建立");
            InputStream is=socket.getInputStream();
            OutputStream os=socket.getOutputStream();
            PrintStream out=new PrintStream(os,false,"UTF-8");

            Scanner scanner=new Scanner(is,"UTF-8");
            System.out.println("等待对方输入");
            String message=scanner.nextLine();
            System.out.println("接受了对方的输入："+message);
            String echoMessage=message;
            socket.shutdownInput();

            out.println(echoMessage);
            out.flush();
            socket.close();
        }

    }
}
