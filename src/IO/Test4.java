package IO;

import java.io.*;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test4 {
    //字节流的缓冲区，以字节数组作为缓冲区，拷贝文件时，可以一次性读取多个字节的数据，
    // 利用缓冲区减少对文件的操作次数，可以有效地提升程序的效率
    public static void main(String[] args) {
        try {
            InputStream in=new FileInputStream("g:\\java\\test.txt");
            OutputStream out=new FileOutputStream("g:\\java\\test2.txt");
            //用缓冲区读写文件
            //定义数组作为缓冲区
            byte [] buff=new byte[1024];
            //定义一个int类型的变量len记住读取的读取读入缓冲区的字节数
            int len;
            long begintime=System.nanoTime();
            while((len=in.read(buff))!=-1){
                out.write(buff,0,len);
            }
            long endtime=System.nanoTime();
            System.out.println("拷贝文件所消耗的时间为："+(endtime-begintime)*1.0/1000+"微秒");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
