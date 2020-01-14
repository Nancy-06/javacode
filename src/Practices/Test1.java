package Practices;

/**
 * @author guoyao
 * @create 2020/1/14
 */

abstract class A{
    public A(){    //3.调用父类构造
        this.print();    //4.调用被子类覆写的方法
    }
    public abstract void print();
}

class B extends A{
    private int num=100;
    public B(int num){   //2.调用子类实例化对象
        super();         //3.银汉一行语句，实际要先实现父类构造
        this.num=num;    //7.为类中属性初始化
    }
    @Override
    public void print() {    //5.此时子类对象的属性还没有被初始化
        System.out.println(this.num);    //6.对应其数据类型的默认值
    }
}
public class Test1 {
    public static void main(String[] args) {
        new B(30);  //1.实例化子类对象
    }
}
/*
 //内部抽象类
abstract class A1{   //此类结构出现的几率很低
     public abstract void printA();
     abstract class B1{
         public abstract void printB();
     }
 }

 class X extends A1{
    public void printA(){}
    class Y extends B1{
        public void printB(){}
    }
 }
 */