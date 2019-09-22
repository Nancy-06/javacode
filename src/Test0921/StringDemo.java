package Test0921;

public class StringDemo {
    public static void main(String[] args) {
        String s="hello";
        String t="hello";
        System.out.println(s==t);
        System.out.println(s.equals(t));
        String r=new String("hello");
        String y=new String("hello");
        System.out.println(r==y);
        System.out.println(r.equals(y));
        System.out.println("hello".equals(r));
        System.out.println("hello"==r);
        System.out.println("hello"==s);
        String x=new String("hello").intern();
        String z=new String("hello").intern();
        System.out.println(x==z);
        System.out.println(s==x);
        String a=s.toUpperCase();
        System.out.println(a);
        String yy=s.substring(1,3);
        System.out.println(yy);
    }
}
