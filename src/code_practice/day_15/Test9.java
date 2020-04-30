package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/28
 */
//58542--数字和为sum的方法数(利用动态规划)
public class Test9 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=scanner.nextInt();
        //初始化数组
        int [] value=new int[n];
        //动态规划数组
        long [] dp=new long[sum+1];
        //index=0的初始化值
        dp[0]=1;

        for(int i=0;i<n;i++){
            value[i]=scanner.nextInt();
            for(int j=sum;j>=0;j--){
                if(j>=value[i]){
                    dp[j]+=dp[j-value[i]];
                }
            }
        }
        System.out.println(dp[sum]);
    }
}
