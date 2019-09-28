package Test0925;


class B{
    //构造块
    {
        System.out.println("B类的构造块");
    }
    //代码方法
    public B(){
        System.out.println("B类的构造方法");
    }
    //静态代码块
    static {
        System.out.println("B类的静态代码块");
    }
}
public class Test3 {
    public static void main(String[] args) {
        System.out.println("==============================");
        new B();
        new B();
        System.out.println("==============================");
    }
}
