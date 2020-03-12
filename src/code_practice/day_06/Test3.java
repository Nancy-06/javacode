package code_practice.day_06;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/12
 */

//句子逆序
public class Test3 {

    public static String reverse(String str){
        String [] strA=str.split(" ");
        for(int i=0,j=strA.length-1;i<j;i++,j--){
            String a=strA[i];
            strA[i]=strA[j];
            strA[j]=a;
        }
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<strA.length-1;i++){
          sb.append(strA[i]+" ");
        }
        sb.append(strA[strA.length-1]);
        String s=sb.toString();
        return s;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(reverse(str));
    }
}
