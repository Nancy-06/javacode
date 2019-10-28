package IO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test1 {
    public static void main(String[] args) {
        try {
            //创建一个文件字节输入流，括号里面是文件的位置
            FileInputStream in=new FileInputStream("G:\\java\\book.txt");
            int b;
            while(true){
                //从输入流中读取一个8位的字节，把它转换为0-255之间的整数，并且返回这一整数；
                // 以对应的ASCII码打印出来，输入数字是因为硬盘上的文件是以字节的形式存在的，
                // 而字符各占一个字节，所以显示的是字节所对应的十进制数
                //b记住读取的一个字节
                b=in.read();
                //如果读取的字节为-1，说明读完字节了，跳出循环
                if(b==-1){
                    break;
                }
                System.out.println(b);
            }
            //关闭此输入流并释放与该流相关的所有系统资源
            in.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
