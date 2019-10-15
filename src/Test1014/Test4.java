package Test1014;

//多态
class Person{
    public void print(){
        System.out.println("1.父类方法");
    }
}
class Child extends Person{
    public void print(){
        System.out.println("2.子类方法");
    }
    public void print1(){
        System.out.println("子类的另一个方法");
    }
}
class Yong extends Person{
    public void print(){
        System.out.println("4.子类方法");
    }
}
public class Test4 {
    public static void main(String[] args) {
        //Yong yong=new Yong();
        Child child=new Child();
        personPrint(child);
    }
    public static void personPrint(Person person){
        if(person instanceof Child){
            Child child=(Child)person;
            child.print();
           child.print1();
        }
        else{
            System.out.println("这个人不是孩子 ");
        }
    }
}
