package Test1027;

/**
 * @author guoyao
 * @create 2019/10/27
 */
class Outer{
    private int num=4;
    //方法中访问成员内部类
    public void test(){
        Inner inner=new Inner();
        inner.show();
    }
    //成员内部类
    class Inner{
        void show(){
            System.out.println("num:"+num);
        }
    }
}


class Out{
    private static int num=8;
       //创建静态内部类
    static class In {
           void show() {
               System.out.println("num=" + num);
           }
    }
}

class Outter{
    private int num=9;
    public void test(){
        //方法内部类
        class Iner{
            void show(){
                System.out.println("num="+num);
            }
        }
        Iner  in=new Iner();
        in.show();
    }
}

public class Test1 {
    public static void main(String[] args) {
        //创建外部类对象
        //Outer outer=new Outer();
        //调用test方法
        //outer.test();
        //Outer.Inner inner=new Outer().new Inner();
        //inner.show();
        //Out.In in=new Out.In();
        //in.show();
        Outter out=new Outter();
        out.test();
    }
}
