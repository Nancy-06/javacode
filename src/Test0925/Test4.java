package Test0925;

public class Test4 {
    //构造块
    {
        System.out.println("Test4类的构造块");
    }

    //构造方法
    public Test4(){
        System.out.println("Test4类的构造方法");
    }
    //静态代码块
    static {
        System.out.println("Test4类的静态代码块");
    }

    public static void main(String[] args) {
        System.out.println("===========================");
        new Test4();
        new Test4();
        System.out.println("===========================");
    }
}
