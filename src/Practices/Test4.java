package Practices;

/**
 * @author guoyao
 * @create 2020/1/15
 */
interface A1{
    public void printA();
}

interface B1{
    public void  printB();
}
//接口多继承
interface C extends A1,B1{
    public void printC();
}

class Imp implements C{
    @Override
    public void printA() {
        System.out.println("A");
    }

    @Override
    public void printB() {
        System.out.println("B");
    }

    @Override
    public void printC() {
        System.out.println("C");
    }
}
public class Test4 {
    public static void main(String[] args) {
        Imp imp=new Imp();
        imp.printA();
        imp.printB();
        imp.printC();
    }
}
