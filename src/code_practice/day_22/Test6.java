package code_practice.day_22;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/7/31
 */
public class Test6 {

    //分割木棍，使之每段长度的相乘最大
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = result(n);
        System.out.println(result);
    }

    private static int result(int n) {
        if(n <= 3){
            return n-1;
        }
        int [] dp = new int[n+1];
        dp[2] = 2;
        dp[3] = 3;
        for(int i = 4; i <= n; i++){
            dp[i] = 2 * dp[i-2] > 3 * dp[i-3] ? 2 * dp[i-2] : 3 * dp[i-3];
        }
        return dp[n];
    }
}
