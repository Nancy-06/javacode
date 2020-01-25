package net网络.TCP.echo.threadpool;




import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/1/9
 */
//线程池进行长连接,有多个
// 客户端
public class Client {
    public static void main(String[] args) throws IOException {
        String messages="cat\r\ndog\r\nfish\r\n";
        //里面是目标的IP+目标的port
        Socket socket=new Socket("127.0.0.1",8888);
        /**
        Socket socket=new Socket();
        socket.bind(本地IP+本地port);
        socket.connect(目标IP+目标port);
         */
        InputStream is=socket.getInputStream();
        Scanner 读本地用户发送的Scanner=new Scanner(is,"UTF-8");
        OutputStream os=socket.getOutputStream();
        Scanner 读本地用户发送的scanner=new Scanner(System.in);
        while(true){
            System.out.print("请提交命令：");
            String message=读本地用户发送的scanner.nextLine();
            byte[] sendBuffer=message.getBytes("UTF-8");
            os.write(sendBuffer);
            os.write('\r');
            os.write('\n');
            System.out.println(读本地用户发送的Scanner.nextLine());
        }

    }
}
