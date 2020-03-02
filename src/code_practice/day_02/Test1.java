package code_practice.day_02;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/2
 */

//说反话
public class Test1 {
    public static String swap(String str){
        String [] strArray=str.split(" ");
        for(int i=0,j=strArray.length-1;i<j;i++,j--){
            String s=strArray[i];
            strArray[i]=strArray[j];
            strArray[j]=s;
        }
       StringBuffer sb=new StringBuffer();
        for(int i=0;i<strArray.length-1;i++){
            sb.append(strArray[i]+" ");
        }
        sb.append(strArray[strArray.length-1]);
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(str);
        System.out.println(swap(str));
    }
}
