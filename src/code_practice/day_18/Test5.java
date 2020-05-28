package code_practice.day_18;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/5/28
 */
public class Test5 {

    //写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。
    public static int fib(int n) {
       if(n == 0 || n == 1){
           return n;
       }
       long [] dp = new long[n+1];
       dp[0] = 0;
       dp[1] = 1;
       for(int i=2; i<=n; i++){
           dp[i] =dp[i-1] + dp[i-2];
           dp[i] = dp[i]% 1000000007;
       }
       return (int)dp[n];
    }


    //斐波那契边形
    //https://www.nowcoder.com/questionTerminal/18ecd0ecf5ef4fe9ba3f17f8d00d2d66?pos=11&orderByHotValue=1
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int f0 = 0;
        int f1 = 1;
        int f2 = f0+f1;
        while(true){
            if(f1 == n){
                System.out.println(0);
                break;
            }
            else if(f1 >n){
                if(Math.abs(n-f0)>Math.abs(f1-n)){
                    System.out.println(Math.abs(f1-n));
                }
                else if(Math.abs(n-f0)<Math.abs(f1-n)){
                    System.out.println(Math.abs(f0-n));
                }
                break;
            }
            f0 = f1;
            f1 = f2;
            f2 = f0+f1;
        }
    }
}
