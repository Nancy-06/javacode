package Practices;

/**
 * @author guoyao
 * @create 2020/1/17
 */
//字符串
public class Test5 {
    public static void main(String[] args) {
        String str="hello";
        str=str+" world";
        str+="!!!";
        System.out.println(str);
        String str1="Hello";
        str1="h"+str1.substring(1);
        System.out.println(str1);
        System.out.println(str1.charAt(0));
        String str3="helloworld";
        //将字符串变为字符数组
        char [] data=str.toCharArray();
        for(int i=0;i<data.length;i++){
            System.out.println(data[i]+" ");
        }
    }
}
