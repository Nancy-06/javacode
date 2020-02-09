package Thread.Test1;

/**
 * @author guoyao
 * @create 2020/2/8
 */

public class ThreadDemo2 {
    /**
    //返回当前线程的引用
    public static void main(String[] args) {
        Thread thread=Thread.currentThread();
        System.out.println(thread.getName());
    }
     **/
    public static void main(String[] args) throws InterruptedException {
        System.out.println(System.currentTimeMillis());
        Thread.sleep(3*1000);
        System.out.println(System.currentTimeMillis());
    }

}
