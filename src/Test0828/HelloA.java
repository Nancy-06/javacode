package Test0828;

class Hello{
    //构造方法
    public Hello(){
        System.out.println("1.Hello父类的构造方法");
    }
    //非静态代码块
    {
        System.out.println("2.Hello父类非静态代码块");
    }
    //静态代码块
    static{
        System.out.println("3.Hello父类静态代码块");
    }
}
public class HelloA extends Hello{
    public HelloA(){
        System.out.println("4.helloA构造方法");
    }
    //非静态代码块
    {
        System.out.println("5.HelloA非静态代码块");
    }
    //静态代码块
    static{
        System.out.println("6.HelloA静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("7.---start---");
        new HelloA();
        new HelloA();
        System.out.println("8.---end---");
    }
}

