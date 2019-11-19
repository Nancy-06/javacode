package Thread.lesson2;

import jdk.management.resource.internal.inst.InitInstrumentation;

/**
 * @author guoyao
 * @create 2019/11/10
 */
public class MyThread {
    public static void main(String[] args) throws InterruptedException {
        //创建线程
        Thread  thread=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("明天要剁手");
            }
        });
        thread.start(); //调用启动
        //不调用join时，创建线程会耗时较长，所以下边的main方法会先执行，
        //如果调用join方法，表示Thread(线程的引用)会加入当前线程（JavaMain主线程）,
        // 等待thread执行完毕再执行后边代码
        //join会造成阻塞
        thread.join();//子线程加入到main线程中，先阻塞，加入此语句，会先执行子线程

        //下边代码常常先执行，因为以上创建线程部分很耗时
        System.out.println("今天要上课");

        /**
        Runnable runnable=new Runnable() {
            @Override
            public void run() {

            }
        };
        Thread thread=new Thread(runnable);
         **/
    }
}
