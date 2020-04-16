package code_practice.day_14;
import java.util.*;
/**
 * @author guoyao
 * @create 2020/4/12
 */

//最难的问题
public class Test3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            String str=sc.nextLine();
            System.out.println(result(str));
        }
    }

    public static String result(String str){
        char [] chars=str.toCharArray();
        for(int i=0;i<chars.length;i++){
            char c=chars[i];
            if(c>='A'&&c<='Z'){
                if(c>='A'&&c<='E'){
                    c=(char)(c+21);
                }
                else{
                    c=(char)(c-5);
                }
            }
            chars[i]=c;
        }
        return new String(chars);
    }
}