package Thread.lesson3;

/**
 * @author guoyao
 * @create 2019/11/13
 */
public class InterruptThread {
    public static void main(String[] args) throws InterruptedException {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
               // while(!Thread.currentThread().isInterrupted())
                while(!Thread.interrupted()){
                    System.out.println("运行中");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {  //抛出异常会重置标志位
                        e.printStackTrace();
                    }
                }
            }
        });
        thread.start();
        Thread.sleep(1/000);
        //修改标志位，
        thread.interrupt();
    }
}

