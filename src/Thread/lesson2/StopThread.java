package Thread.lesson2;

/**
 * @author guoyao
 * @create 2019/11/10
 */
public class StopThread {
    /**
     * 是否被中断，默认没有被中断
     */
    //volatile 可有可无，多用于多线程中
    //标志位，线程是否被中断
    private static volatile boolean myInterrupted;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(!myInterrupted){
                    System.out.println("hello");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        Thread.sleep(5000);
        //线程中断了
        myInterrupted=true;
    }
}
