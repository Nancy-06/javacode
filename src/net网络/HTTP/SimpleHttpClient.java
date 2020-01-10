package net网络.HTTP;

import sun.security.util.AuthResources_it;

import java.io.ByteArrayInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/1/9
 */
//简单的HTTP客户端
    //GET http://www.baidu.com/1.0
    //GET方法是不带request body
public class SimpleHttpClient {
    public static void main(String[] args) throws IOException {
        StringBuffer request=new StringBuffer();
        request.append("GET / HTTP/1.0\r\n");
        request.append("host: www.baidu.com\r\n");
        request.append("\r\n");
        System.out.println(request.toString());

        Socket socket=new Socket("www.baidu.com",80);
        socket.getOutputStream().write(request.toString().getBytes("UTF-8"));
        socket.getOutputStream().flush();
        socket.shutdownOutput();
        //1.解析响应
        //2.把响应体保存在文件里 百度.html

        byte[] buffer=new byte[4096];
        int len=socket.getInputStream().read(buffer);
       // socket.close();
        String response=new String (buffer,0,len,"UTF-8");
        //System.out.println(response);
        //假设已经把状态行+所有状态头+空行都读到了
        int index=-1;
        for(int i=0;i<len-3;i++){
            if(buffer[i]=='\r'&&buffer[i+1]=='\n'&&buffer[i+2]=='\r'&&buffer[i+3]=='\n'){
                index=i;
                break;
            }
        }
        ByteArrayInputStream byteArrayInputStream=new ByteArrayInputStream(buffer,0,index+4);
        //System.out.println(index);
        int 已经读到的正文的长度=len-index-4;

        Scanner scanner=new Scanner(byteArrayInputStream,"UTF-8");
        String statusLine=scanner.nextLine();
        System.out.println("状态行"+statusLine);
        String line;
        int contentLength=-1;
        while(!(line=scanner.nextLine()).isEmpty()){
            String [] kv=line.split(":");
            String key=kv[0].trim();
            String value=kv[1].trim();
            System.out.println("响应头"+ key +" = "+value);
            if(key.equalsIgnoreCase("Content-Length")){
                //正文的长度
                contentLength=Integer.parseInt(value);
            }
        }
        int 还需要读的正文的长度=contentLength-已经读到的正文的长度;
        byte[] body=new byte[contentLength];
        //进行复制
        System.arraycopy(buffer,index+4,body,0,已经读到的正文的长度);
        int 实际又读到的长度=socket.getInputStream().read(body,已经读到的正文的长度,还需要读的正文的长度);
        System.out.println(contentLength);
        System.out.println(已经读到的正文的长度);
        System.out.println(还需要读的正文的长度);
        System.out.println(实际又读到的长度);
        FileOutputStream os=new FileOutputStream("src//百度.html" );
        os.write(body);
        os.close();
    }
}
