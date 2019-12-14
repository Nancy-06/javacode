package Thread.lesson3;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2019/11/13
 */
public class UnsafeThread {

    //类静态变量在方法区中
    public static int COUNT;
    public static List<Integer>  lit=new ArrayList<>();
    public static void main(String[] args) {
        /**
        String s1="abc";  //在运行时常量池中
        String s2=new String("a");//创建了两个对象，堆上和常量池中，堆上new出一个对象
        String s3=new String("abc"); //创建了一个对象，在堆上
         **/
        //开启20个线程，每个线程对count++操作10000次
        //预期结果：20万
        //最后打印结果

        /**
        for(int i=0;i<20;i++){
            Thread thread =new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0;i<10000;i++){
                        COUNT++;
                    }
                }
            });
            thread.start();
        }
        while(Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(COUNT);
         **/
         List<Integer>  list=new ArrayList<>();
        for(int i=0;i<20;i++){
            final int k=i;
            Thread thread =new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int j=0;j<10000;j++){
                        list.add(k*1000+j);
                    }
                }
            });
            thread.start();
        }
        while(Thread.activeCount()>2){
            Thread.yield();
        }
        System.out.println(list.size());
    }
}
