package Test0828;

class Parent{
    {
        System.out.println("A");
    }
    Parent(){
        System.out.println("B");
    }
    {
        System.out.println("C");
    }
}
public class InstanceOrder extends Parent {
    InstanceOrder(){
        super();
        System.out.println(1);
    }
    InstanceOrder(int n){
        this();
        System.out.println(2);
    }
    private int initA(){
        System.out.println(3);
        return 0;
    }
    private int initB(){
        System.out.println(4);
        return 0;
    }
    int a=initA();
    {
        System.out.println(5);
    }
    int B=initB();
    {
        System.out.println(6);
    }

    public static void main(String[] args) {
        new  InstanceOrder(100);
    }


}

