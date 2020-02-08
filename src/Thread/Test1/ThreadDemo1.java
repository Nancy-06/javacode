package Thread.Test1;

/**
 * @author guoyao
 * @create 2020/2/8
 */
//线程中断
public class ThreadDemo1 {
    public static class MyRunnable implements Runnable {
        /**
         * @Override
         * void run() {
         * //通过异常收到中断标志，并且标志位被清
         * try{
         * Thread.sleep(1000);
         * }catch (InterruptedException e){
         * System.out.println("通过异常收到了中断情况");
         * }
         * for(int i=0;i<10;i++){
         * System.out.println(Thread.currentThread().isInterrupted());
         * }
         * }
         **/

        /**
        @Override
        public void run() {
            //只有一开始是true，后边都是false，因为标志位被清
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.interrupted());
            }
        }
        **/

        @Override
        public void run() {
            for(int i=0;i<10;i++){
                System.out.println(Thread.currentThread().isInterrupted());
            }
        }
    }

    public static void main(String[] args) {
        MyRunnable runnable=new MyRunnable();
        Thread thread=new Thread(runnable,"张三");
        thread.start();
        thread.interrupt();
    }
}
