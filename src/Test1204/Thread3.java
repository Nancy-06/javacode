package Test1204;

/**
 * @author guoyao
 * @create 2019/12/4
 */
public class Thread3 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++){
                    //不清楚中断标志
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        thread.interrupt();
    }
}
