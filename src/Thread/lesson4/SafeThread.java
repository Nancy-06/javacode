package Thread.lesson4;

import org.omg.CORBA.CODESET_INCOMPATIBLE;

import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2019/11/17
 */
public class SafeThread {

        //类静态变量在方法区中
        public static int COUNT;
        public static List<Integer> lit=new ArrayList<>();
        public static void main(String[] args) {
            /**
             String s1="abc";  //在运行时常量池中
             String s2=new String("a");//创建了两个对象，堆上和常量池中，堆上new出一个对象
             String s3=new String("abc"); //创建了一个对象，在堆上
             **/
            //开启20个线程，每个线程对count++操作10000次
            //预期结果：20万
            //最后打印结果

            Object object=new Object();
             for(int i=0;i<20;i++){
             Thread thread =new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10000;i++){
                //第一种：静态类对象锁定
            //increment();
                //第二种：对实例对象锁定
                    synchronized (object){
                        COUNT++;
                    }
                    decrement();
                }
            }
            });
             thread.start();
             }
             while(Thread.activeCount()>2){
             Thread.yield();
             }
             System.out.println(COUNT);
    }
    //synchronized（同步），public之前之后都可以，建议之后
    //synchronized：对对象进行了加锁，表示出来的特性：依次执行，每个线程不能同时进行
   // public synchronized static void increment(){
     //       COUNT++;
    //}

    public static  void increment(){
            synchronized (SafeThread.class){
            COUNT++;
        }
    }

    public synchronized  static void decrement(){
            COUNT--;
    }
    public synchronized  void increment2(){

    }

    /**
    public synchronized  void increment2(){
            synchronized (this){

            }
    }
     **/
}
