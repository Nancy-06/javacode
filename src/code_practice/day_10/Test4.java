package code_practice.day_10;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/27
 */

//数字颠倒
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        String str="";
        while(n!=0){
            int m=n%10;
            n/=10;
            str=str+String.valueOf(m);
        }
        System.out.println(str);
    }
}
