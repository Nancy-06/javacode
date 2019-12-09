package IO流;

import org.junit.Test;

import java.io.*;

/**
 * @author guoyao
 * @create 2019/12/5
 */
public class FileInputStreamTest {

    //输入流
    @Test
    public void test1(){
        try {
            System.out.println(System.getProperty("user.dir"));  //相对路径

            File f=new File("src/iotest1.txt");
            System.out.println(f.exists());
            //字节类型
            FileInputStream fis=new FileInputStream(f);
            byte[] bytes=new byte[1024];
            int length=0;
            while((length=fis.read(bytes))!=-1){
                String s=new String(bytes,0,length);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test2(){
        try {
            System.out.println(System.getProperty("user.dir"));  //相对路径

            File f=new File("src/iotest1.txt");
            System.out.println(f.exists());
            //字符类型,文件输入流
            FileReader fr=new FileReader(f);
            char[] chars=new char[1024];
            int length=0;
            while((length=fr.read(chars))!=-1){
                String s=new String(chars,0,length);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void test3(){
        try {
            System.out.println(System.getProperty("user.dir"));  //相对路径

            File f=new File("src/iotest1.txt");
            System.out.println(f.exists());
            FileInputStream fis=new FileInputStream(f);
            //缓冲字节流
            BufferedInputStream bis=new BufferedInputStream(fis);
            byte[] bytes=new byte[1024];
            int length=0;
            while((length=bis.read(bytes))!=-1){
                String s=new String(bytes,0,length);
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Test
    public void test4(){
        try {
            System.out.println(System.getProperty("user.dir"));  //相对路径

            File f=new File("src/iotest1.txt");
            System.out.println(f.exists());
            //缓冲流字符流
           FileReader fr=new FileReader(f);
           BufferedReader br=new BufferedReader(fr);
           String s;
           while((s=br.readLine())!=null){
               System.out.println(s);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    //输出流
    @Test
    public void test5(){
        try {
            System.out.println(System.getProperty("user.dir"));  //相对路径

            File f=new File("src/iotest1.txt");
            System.out.println(f.exists());
            //缓冲流字符流
            FileWriter fw=new FileWriter(f);
            BufferedWriter bw=new BufferedWriter(fw);
            bw.write("1=123\n");  //\n也可以进行换行
            bw.write("2=234");
            bw.newLine(); //换行
            bw.write("3=345");
            bw.flush();  //刷新
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
