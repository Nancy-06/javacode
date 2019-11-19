package Thread.lesson2;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * @author guoyao
 * @create 2019/11/10
 */
public class ThreadAdvantage {
    //多线程执行效率

    public static List<String> randomList(){
        char [] chars={'a','b','c','z','A','Z'};
        List<String>  list=new LinkedList<>();
        for(int i=0;i<10000;i++){
            int radom=new Random().nextInt(chars.length);
            char c=chars[radom];
            list.add(String.valueOf(c));
        }
        return list;
    }

    /**
     *集合：
     * Collection  /----list:ArrayList、LinkedList
     *                  set:TreeSet、HashSet
     * Map        /-----TreeMap、HashMap
     * @param args
     */
    public static void main(String[] args) throws InterruptedException {
        List<String> list=randomList();
        //创建10个线程，每个线程获取List中的10000个元素
        //时间java.util.Date
        //jdk1.8->LocalDateTime
       long start=System.currentTimeMillis();
        //long start=new Date().getTime();//从1970年零点时间整到现在的时间
        Thread [] threads=new Thread[10];
        for(int i=0;i<10;i++){

            final int k=i;
            threads [i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    //System.out.println(threads[k].getName());
                    Thread current=Thread.currentThread();
                    System.out.println("id="+current.getId()+",name="+current.getName());
                    for(int j=0;j<1000;j++){
                       list.get(k*1000+j);
                    }
                }
            },"我的线程"+k);
            //System.out.println(threads[i].getName());
            threads[i].start();
        }
        /**
        //判断当前有多少个线程在执行
        //判断除了Main线程之外的子线程进行，计算他们的执行时间
         //=2是因为idea中插入它自己的线程
        //第一种做法：线程让步：yield
        while(Thread.activeCount()>2){
            Thread.yield();//main线程先不执行，让步
        }
         **/
        //第二种做法
        for(Thread thread:threads){
            //阻塞当前线程，等待引用线程执行完毕
            thread.join();

        }
        long end=System.currentTimeMillis();
        System.out.println("耗时："+(end-start)+"毫秒");
    }
}
