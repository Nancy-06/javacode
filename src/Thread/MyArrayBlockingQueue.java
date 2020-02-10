package Thread;

/**
 * @author guoyao
 * @create 2020/1/7
 */
//实现一个阻塞式队列

/**
 * 要求：多生产者-多消费者正确，但是效率不保证
 * 可改进点：
 * 1.锁是生产者和消费者都在竞争的锁
 *     生产者和消费者之间共享：size
 *     生产者和生产者之间共享：size+rear
 *     消费者和消费者之间共享：size+front
 * 2.通知（全统治）
 *     精准通知：生产者只通知消费者
 *               消费者只通知生产者
 */
public class MyArrayBlockingQueue {
    private int [] array;
    /**
     * 已有元素的个数
     * voaltive最主要的目的，是给size()保证可行性用的
     */

    private volatile int size;
    /**
     * 对手元素所在下标
     */
    private int front;
    /**
     * 下一个要插入元素的下标
     */
    private int rear;
   public  MyArrayBlockingQueue (int  capacity){
        array=new int [capacity];
        size=0;
        front=0;
        rear=0;
    }
    public synchronized void put(int element) throws InterruptedException {
       while(size==array.length){
           wait();
       }
       array[rear++]=element;
       if(rear==array.length){
           rear=0;
       }
       size++;
       //唤醒正在睡眠的生产者+消费者
        //因为我们无法保证只唤醒消费者
        notifyAll();
    }
    public synchronized  int take() throws InterruptedException {
       while(size==0){
           wait();
       }
       int element=array[front++];
       if(front==array.length){
           front=0;
       }
        //唤醒正在睡眠的生产者+消费者
        //因为我们无法保证只唤醒生产者
        notifyAll();
       return  element;
    }
    public int size(){
       return size;
    }
    public boolean empty(){
       return false;
    }

}
