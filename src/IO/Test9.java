package IO;

import javax.print.DocFlavor;
import java.io.*;

/**
 * @author guoyao
 * @create 2019/10/28
 */
public class Test9 {
    //转换流
    public static void main(String[] args) {
        try {
            //创建字节输入流
            FileInputStream in=new FileInputStream("g:\\java\\test3.txt");
          //将字节输入流转换为字符输入流
            InputStreamReader isr=new InputStreamReader(in);
            //对字符输入流进行包装
            BufferedReader br=new BufferedReader(isr);
            //创建字节输出流
            FileOutputStream out=new FileOutputStream("g:\\java\\test4.txt");
           //将字节输出流转换为字符输出流
            OutputStreamWriter osw=new OutputStreamWriter(out);
            //对字符输出流进行包装
            BufferedWriter bw=new BufferedWriter(osw);
            String line;
            //判断是否读到文件末尾
            while((line=br.readLine())!=null){
                bw.write(line);
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
