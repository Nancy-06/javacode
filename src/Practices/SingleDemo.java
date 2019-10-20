package Practices;

class Single{
    //自己创建一个对象
    private static Single instance=new Single();
    //私有化构造方法
    private Single(){}
    //提供返回该对象的静态方法
    public static Single getInstance(){
        return instance;
    }
}
//单例模式的另一种写法
class Single1{
    private Single1(){}
    public static final Single1 instance=new Single1();
}
public class SingleDemo {
    public static void main(String[] args) {
        Single s1=Single.getInstance();
        Single s2=Single.getInstance();
        System.out.println(s1==s2);
    }

}
