package Practices;

/**
 * @author guoyao
 * @create 2020/1/14
 */

//抽象类实现接口

interface Message{
    void print();
}
abstract class News implements Message{
    //News为抽象方法，可以不实现Message中的抽象方法
    //抽象类中方法前面abstract不能省略，否则就是普通方法
    public abstract void getNews();
}

class MessageI extends News{
    @Override
    public void print() {
        System.out.println("Hello");
    }

    @Override
    public void getNews() {
        System.out.println("HELLO");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Message m=new MessageI();
        m.print();
        //MessageI是抽象类和接口的共同子类
        News n=(News) m;
        n.getNews();
    }
}
