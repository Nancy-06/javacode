package Test0925;

class A{
    //定义在类中，不加任意修饰符
    {
        System.out.println("A的构造块");
    }
    //构造方法
    public A(){
        System.out.println("A的构造方法");
    }
}
public class Test2 {
    public static void main(String[] args) {
        new A();
        new A();
    }
}
