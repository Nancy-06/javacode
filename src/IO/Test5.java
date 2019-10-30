package IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test5 {
    //字符流读取文件字符
    public static void main(String[] args) {
        try {
            //创建一个FileReader的对象用来读取文件中的字符
            FileReader reader=new FileReader("g:\\java\\book.txt");
            //定义变量用来读取文件中的内容
            int ch;
            //循环判断是否读到末尾
            while((ch=reader.read())!=-1){
                //不是字符流末尾就进行打印，
                System.out.println((char) ch);
            }
            //关闭文件读取流，释放资源
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
