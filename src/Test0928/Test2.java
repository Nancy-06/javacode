package Test0928;

public class Test2 {
    public static void main(String[] args) {
        int a=100;
        int b=100;
        Integer c=new Integer(100);
        Integer d=new Integer(100);
        Integer e=100;
        Integer f=100;
        System.out.println(a==b);
        System.out.println(c==d);
        System.out.println(e==f);
        System.out.println(a==c);
        System.out.println(a==e);
        System.out.println(c==e);
    }
}
