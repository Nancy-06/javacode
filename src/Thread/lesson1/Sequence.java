package Thread.lesson1;

/**
 * @author guoyao
 * @create 2019/11/6
 */
public class Sequence {
    public static void main(String[] args) {
        //启动0-9编号的10个线程，每个线程打印它的编号
        for(int i=0;i<10;i++){
            final int j=i;
            Runnable r=new Runnable(){
                @Override
                public void run() {
                    try {
                        Thread.sleep(1000*j);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            Thread t=new Thread(r);
            t.start();
        }





        /**
        for(int i=0;i<10;i++){
            final int j=i;
            Runnable r=new Runnable() {
                @Override
                public void run() {
                    System.out.println(j);
                }
            };
            Thread t=new Thread(r);
            //t.start();
            t.run();
        }
         **/
    }
}
