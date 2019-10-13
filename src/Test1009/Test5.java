package Test1009;

import java.util.*;

public class Test5 {
    public static int fibonacci(int n){
        if(n==1||n==0){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);

    }
    public static int countSum(int n){
        for(int i=1;i<n;i++){
            if(fibonacci(i-1)<=n &&fibonacci(i)>=n){
                int m=fibonacci(i-1);
                int k=fibonacci(i);
                return Math.min(n-m,k-n);
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(countSum(n));
    }
}
