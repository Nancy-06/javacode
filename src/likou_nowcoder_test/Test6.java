package likou_nowcoder_test;

import java.util.Scanner;

//题目：Fibonacci数列
//题目链接：https://www.nowcoder.com/questionTerminal/18ecd0ecf5ef4fe9ba3f17f8d00d2d66?pos=11&orderByHotValue=1
public class Test6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int f1=0;
        int f2=1;
        int f3=f1+f2;
        while(true){
            if(f2==n||f1==n){
                System.out.println(0);
                break;
            }
            else if(f2>n){
                    int m=Math.abs(n-f1);
                    int p=Math.abs(n-f2);
                    if(m>p){
                        System.out.println(p);
                    }
                    else{
                        System.out.println(m);
                    }
                    break;
                }
            f1=f2;
            f2=f3;
            f3=f1+f2;
        }
    }
}



