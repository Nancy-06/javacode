package Test1201IO;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/1
 */
public class FileTest {

    @Test
    public void test1 ()throws IOException{
        //实现一个方法，把该文件和该文件下的子目录都打印出
        //和子文件获取并打印
        File file=new File("G:\\实验");
        //从此处开始递归
        listFiles(file);
    }

    public void listFiles(File file){
        System.out.println(file.getPath());
        //判断一个文件是否是目录
        if(file.isDirectory()){
            for(File f:file.listFiles()){
                if(f.isDirectory()){
                    listFiles(f);
                }
                else{
                    System.out.println(f.getPath());
                }
            }
        }
    }

    public static void main(String[] args) {
        test2();
    }
    @Test
    public static void test2(){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int i1=sc.nextInt();
            int i2=sc.nextInt();
            int i3=sc.nextInt();
            int i4=sc.nextInt();
            int i5=sc.nextInt();

            //1.要么对于每个有明确标识api的api，需要明确返回
            //这个标识，对于scanner就是换行符
            //2.流关闭
            System.out.println("abc");

        }
    }
}
