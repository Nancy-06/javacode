package Thread.lesson1;

/**
 * @author guoyao
 * @create 2019/11/6
 */
public class CreateThread {
    public static void main(String[] args) {
        //1.继承Thread类
        MyThread t=new MyThread();
        //启动线程
        //t.start();
        t.run();
        //2.实现Runnable接口
        MyRunner runner=new MyRunner();
        Thread t2=new Thread(runner);
        t2.start();
        //javaMain 是java层面的主线程，和main方法中自行创建的线程是同级的
        while(true){

        }
    }
}
//创建线程
class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("in thread");
        while(true){

        }
    }

}

//创建线程
class MyRunner implements Runnable{
    @Override
    public void run() {
        System.out.println("in runnable");
        while(true){

        }
    }
}