package Test0925;

class Hello1{
    //构造方法
    public Hello1(){
        System.out.println("1.Hello1父类的构造方法");
    }
    //非静态代码块
    {
        System.out.println("2.Hello1父类非静态代码块");
    }
    //静态代码块
    static{
        System.out.println("3.Hello1父类静态代码块");
    }
}
class Hello2 extends Hello1 {
    public Hello2() {
        System.out.println("4.hello2构造方法");
    }

    //非静态代码块
    {
        System.out.println("5.Hello2非静态代码块");
    }

    //静态代码块
    static {
        System.out.println("6.Hello2静态代码块");
    }

}
public class Test{
    public static void main(String[] args) {
        System.out.println("7.---start---");
        new Hello2();
        new Hello2();
        System.out.println("8.---end---");
    }
}
