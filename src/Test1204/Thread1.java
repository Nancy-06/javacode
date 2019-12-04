package Test1204;

/**
 * @author guoyao
 * @create 2019/12/4
 */
//线程中断
public class Thread1 {
    public static void main(String[] args) {
        Thread thread=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    //阻塞挂起，通过抛异常的形式中断标志
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("通过异常收到了中断情况");
                }
                for(int i=0;i<10;i++){
                    //currentThread():返回当前正在执行的线程的引用
                    //isInterrupted():判断这个线程是否被中断，清除中断标志
                    //Thread.currentThread().isInterrupted()：判断指定线程的中断标志被设置，
                    // 不清除中断标志
                    System.out.println(Thread.currentThread().isInterrupted());
                }
            }
        });
        thread.start();
        //通知该线程停止运行
        thread.interrupt();
    }
}
