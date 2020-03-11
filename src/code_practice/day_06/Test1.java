package code_practice.day_06;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/11
 */

//回文串
public class Test1 {
    public static boolean judge(String str){
        for(int i=0,j=str.length()-1;i<j;i++,j--){
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        boolean result=false;
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        for(int i=0;i<str.length();i++){
           StringBuffer sb=new StringBuffer(str);
           sb=sb.deleteCharAt(i);
           String s=sb.toString();
           if(judge(s)){
               result=true;
               break;
           }
        }
        if(result==true){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
