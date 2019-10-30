package IO;

import java.io.FileWriter;
import java.io.IOException;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test6 {
    //字符流向文件中写入内容
    public static void main(String[] args) {
        try {
            //创建一个FileWriter对象用于向文件中写入数据
            FileWriter writer=new FileWriter("g:\\java\\book2.txt");

            String str="你好";
            //将字符数据写入到文件中
            writer.write(str);
            //将输出语句换行
            writer.write("\r\n");
            //关闭写入流，释放资源
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
