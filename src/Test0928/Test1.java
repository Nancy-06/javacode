package Test0928;

public class Test1 {
    public static void main(String[] args) {
        String str1="abc"; //abc在常量池中
        String str2="abc";
        int a=1;
        int b=1;
        String str3=new String("abc"); //在堆栈中重新开辟一个abc空间
        String str4=new String("abc");
        System.out.println(a==b);  //true
        System.out.println(str1==str2);  //true
        System.out.println(str1.equals(str2));  //true
        System.out.println(str3==str4);  //false
        System.out.println(str3.equals(str4));  //true
        System.out.println(str1==str3);  //false
        System.out.println(str1.equals(str3));//true
        System.out.println(str3.intern()==str4.intern());  //true
        System.out.println(str1.intern()==str3.intern());  //true
    }
}