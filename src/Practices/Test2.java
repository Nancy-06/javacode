package Practices;

/**
 * @author guoyao
 * @create 2020/1/14
 */

//接口的使用
interface IMessage{
    public static final String MSG="Hello";    //全局变量
    public abstract void print();  //抽象方法
}
interface INews{
    public abstract String getNews();
}

class MessageImp implements IMessage,INews{
    @Override
    public void print() {
        System.out.println(IMessage.MSG);
    }

    @Override
    public String getNews() {
        return IMessage.MSG;
    }
}
public class Test2 {
    public static void main(String[] args) {
        IMessage m=new MessageImp();  //子类向上转型，为父接口实例化对象
       //调用被子类覆写过的方法
        m.print();
        INews n=(INews) m;
        System.out.println(n.getNews());

    }
}
