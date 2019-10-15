package Test1014;

import sun.text.resources.cldr.ar.FormatData_ar_TN;

//多态
class Father{
    public void print(){
        System.out.println("父类方法");
    }
}
class Son extends Father{
    public void print(){
        System.out.println("子类方法");
    }
    public void print1(){
        System.out.println("子类的另一个方法");
    }
}
public class Test3 {
    public static void main(String[] args) {
        Father f=new Son();
        f.print();
        Son s=(Son) f;
        s.print1();
    }
}
