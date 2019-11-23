package Thread.lesson4;

/**
 * @author guoyao
 * @create 2019/11/17
 */
public class Sington {

    //饿汉式
    public static final Sington SINGTON=new Sington();
    public static Sington getInstance(){
        return SINGTON;
    }
    //懒汉式
    public static Sington SINGTON2=null;
    public static Sington getInstance2(){
      if(SINGTON2==null){
          //多个线程可以同时进入这行代码判断，都判断为null
          SINGTON2=new Sington();
      }
     return SINGTON2;
    }

   // synchronized 第一种写法
    public static Sington getInstance3(){
      // synchronized (Sington.class){
        //
       //}
        //多个线程可以同时进入这行代码判断，都判断为null
        if(SINGTON2==null){

           synchronized (Sington.class){
               //可以分解为三步操作
               //1.分配对象的内存空间
               //2.执行对象初始化
               //3.把对象赋给引用
               //可能重排序为132的执行顺序
               if(SINGTON2==null){
                   SINGTON2=new Sington();
               }
           }
        }
        return SINGTON2;

    }

    private Sington(){
        //nothing to do
    }


    public static void main(String[] args) {
        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {

                }
            }).start();
        }
    }
}
