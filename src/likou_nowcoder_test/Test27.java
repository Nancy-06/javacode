package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/9
 */
//删除公共字符串


public class Test27 {
    public static void delete(String str1,String str2){
        for(int i=0;i<str2.length();i++){
            String temp=String.valueOf(str2.charAt(i));
            str1=str1.replaceAll(temp,"");
        }
        System.out.println(str1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String [] string =new String[2];
        String str1="";
        String str2="";
        for(int i=0;i<string.length;i++){
            string [i]=scanner.nextLine();
        }
        str1=string[0];
        str2=string[1];
        delete(str1,str2);
    }

}
