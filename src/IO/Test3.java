package IO;

import java.io.*;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test3 {
    //文件的拷贝
    public static void main(String[] args) {
        try {
            //创建字节输入流，用于读取当前文件下目录的内容
            InputStream in=new FileInputStream("g:\\java\\book.txt");
            //创建字节输出流，用于将读取的数据写入此文件下
            OutputStream out=new FileOutputStream("g:\\java\\book2.txt");
            //定义一个int类型的变量，记住每次读取的一个字节
            int len;
            long begin=System.nanoTime();
            //读取一个字节并判断是否读到文件末尾
            while((len=in.read())!=-1){
                //将读取到的字节写入文件
                out.write(len);
            }
            long end=System.nanoTime();
            System.out.println("拷贝文件所消耗的时间为："+(end-begin)*1.0/1000+"微秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
