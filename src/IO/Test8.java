package IO;

import java.io.*;

/**
 * @author guoyao
 * @create 2019/10/28
 */
public class Test8 {

    //跟踪行号的输入流-LineNumberReader
    public static void main(String[] args) {
        try {
            //创建字符输入流
            FileReader reader=new FileReader("g:\\java\\test1.txt");
           //创建字符输出流
            FileWriter writer=new FileWriter("g:\\java\\test3.txt");
           //包装
            LineNumberReader lr=new LineNumberReader(reader);
            //设置读取文件的起始行号， LineNumberReader 类在读取到换行符'\n'、
            // 回车符'\r'或者回车符后跟换行符的时候，会将行号自动加1，所以起始位置为0
            lr.setLineNumber(0);
            String line=null;
            while((line=lr.readLine())!=null){
                //将行号读取到文件中
                writer.write(lr.getLineNumber()+":"+line);
                //换行
                writer.write("\r\n");
            }
            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
