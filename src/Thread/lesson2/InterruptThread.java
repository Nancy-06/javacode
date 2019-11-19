package Thread.lesson2;

import oracle.jrockit.jfr.jdkevents.ThrowableTracer;

/**
 * @author guoyao
 * @create 2019/11/10
 */
public class InterruptThread {
    public static void main(String[] args) {

        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //调用sleap()/wait()/join()方式时，线程进入

                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                for(int i=0;i<5;i++){
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        //线程要中断，但是他在睡眠中，所以会抛异常
        thread.interrupt();

/**
        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                while(true){
                    for(int i=0;i<10;i++){
                        //boolean tmp=标志位
                        //标志位=false
                        //return tmp;
                        //作用：重置标志位为false,并且返回值之前的标志位
                        boolean b=Thread.interrupted();
                        //获取当前的标志位
                        //boolean b= Thread.currentThread().isInterrupted();
                        System.out.println(b);
                    }
                }
            }
        });
        //线程创建之后标志位=false
        thread2.start();
        //中断这个线程
        thread2.interrupt();//修改标志位=true
 **/

    }

}
