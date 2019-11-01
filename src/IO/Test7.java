package IO;

import java.io.*;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test7 {
    //字符流实现文件的拷贝
    public static void main(String[] args) {
        try {
            FileReader reader=new FileReader("g:\\java\\test1.txt");
            BufferedReader br=new BufferedReader(reader);
            FileWriter writer=new FileWriter("g:\\java\\test2.txt");
            BufferedWriter bw=new BufferedWriter(writer);
            String str;
            while((str=br.readLine())!=null){
                bw.write(str);
                bw.newLine();
            }
            br.close();
            bw.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
