package Test1228;

/**
 * @author guoyao
 * @create 2020/1/6
 */
public class Test6 {
    public static void main(String[] args) {
        String s1="Hello";
        String s2="Hello";
        String s3=new String ("Hello");
        String s4=new String ("Hello");
        //相等否
        System.out.println("s1==s2:"+(s1==s2));
        System.out.println("s3==s4:"+(s3==s4));
        System.out.println("s1==s3:"+(s1==s3));

        //值相等否
        System.out.println("s1 equals s2:"+s1.equals(s2));
        System.out.println("s3 equals s4"+s3.equals(s4));
        System.out.println("s1 equals s3:"+s1.equals(s3));
    }
}

