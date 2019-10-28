package IO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test2 {
    public static void main(String[] args) {
        try {
            //创建一个文件字节输出流
            //注意：如果没有此文件，将会创建一个文件，如果有文件，将会把原文件清空，写入新的数据
            FileOutputStream out=new FileOutputStream("g:\\java\\book2.txt");
            //在已经存在的文件后面追加新的内容
            //FileOutputStream out=new FileOutputStream("g:\\java\\book.txt",true);
            String str="中国你好！！！";
            byte[] b=str.getBytes();
            for(int i=0;i<b.length;i++){
                //向输入流写入字节
                out.write(b[i]);
            }
            //刷新此输出流并强制写出所有缓冲的输出字节
            out.flush();
            //关闭此输入流并释放与该流相关的所有系统资源
            out.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
