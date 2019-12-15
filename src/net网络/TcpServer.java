package net网络;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author guoyao
 * @create 2019/12/8
 */
//服务端,先接受后发送
public class TcpServer {
    private static final int PORT = 9999;
    public static void main(String[] args) {
        try {
            ServerSocket server = new ServerSocket(PORT);
            Socket socket = server.accept();
            // 服务端接收数据IO输入流
            InputStream inputStream = socket.getInputStream();
            InputStreamReader isr = new InputStreamReader(inputStream);
            BufferedReader reader = new BufferedReader(isr);
            // 服务端发送数据IO输出流
            OutputStream os = socket.getOutputStream();
            PrintWriter pw = new PrintWriter(os, true);
            String data = null;
            while ((data = reader.readLine()) != null) {
                System.out.println(data);
                pw.println("已经收到数据【"+data+"】");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
    }
}
