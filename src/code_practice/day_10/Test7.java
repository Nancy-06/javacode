package code_practice.day_10;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/28
 */

public class Test7 {
    //Fibonacci数列
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=0;
        int b=1;
        int c=1;
        int n=scanner.nextInt();
        while(c<n){
            a=b;
            b=c;
            c=a+b;
        }
        int f1=n-b;
        int f2=c-n;
        int result=0;
        if(f1<f2){
            result=f1;
        }
        else{
            result=f2;
        }
        System.out.println(result);
        System.out.println(count(2,2));
    }

    //机器人走方格
    public static int count(int x,int y){
        if(x==1||y==1){
            return 1;
        }
        return count(x-1,y)+count(x,y-1);
    }
}
