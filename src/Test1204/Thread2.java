package Test1204;

/**
 * @author guoyao
 * @create 2019/12/4
 */
public class Thread2 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0;i<10;i++) {
                    //判断当前线程的中断标志被设置，清除中断标志
                    System.out.println(Thread.interrupted());
                }
            }
        });
        thread.start();
        //将线程的中断状态设置为true；
        thread.interrupt();
    }
}
