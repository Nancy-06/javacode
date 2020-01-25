package net网络.TCP.echo.threadpool;



import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.concurrent.*;

/**
 * @author guoyao
 * @create 2020/1/9
 */
//线程池进行长连接,有多个
//// 服务端
public class Server {
    private static class Worker implements Runnable{
        private final Socket socket;
        Worker(Socket socket){
            this.socket=socket;
        }
        @Override
        public void run() {
            String name=Thread.currentThread().getName();
            try {
                InputStream is=socket.getInputStream();
                OutputStream os=socket.getOutputStream();
                Scanner scanner=new Scanner(is,"UTF-8");
                PrintStream out=new PrintStream(os,false,"UTF-8");
                while(scanner.hasNextLine()){
                    System.out.println(name+":等待客户端发送消息");
                    String message=scanner.nextLine();
                    System.out.println(name+"：收到消息："+message);
                    String echoMessage=message;
                    System.out.println(echoMessage);
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    socket.close();
                } catch (IOException e1) {
                    e1.printStackTrace();
                }
            }

        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket=new ServerSocket(8888);
        /*
        BlockingQueue<Runnable> queue=new LinkedBlockingQueue<>();
        ExecutorService pool= new ThreadPoolExecutor(
                10,1000,1, TimeUnit.SECONDS,queue);
                */
        ExecutorService pool=Executors.newFixedThreadPool(100);
        //int i=0;
        while(true){
            System.out.println("main:等待连接");
            Socket socket=serverSocket.accept();
            System.out.println("main:连接建立");
            pool.execute(new Worker(socket));
            /*
            Thread thread=new Thread(new Worker(socket),"工作人员（"+i++ +")");
            thread.start();
             */

        }
    }
}
