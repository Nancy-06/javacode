package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/15
 */
public class Test37 {
    public static int fibonacci(int n){
        if(n==1||n==0){
            return 1;
        }
        return fibonacci(n-2)+fibonacci(n-1);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        for(int i=1;i<N;i++){
            if(fibonacci(i-1)<=N&&fibonacci(i)>=N){
                int k=fibonacci(i-1);
                int m=fibonacci(i);
                System.out.println(Math.min(N-k,m-N));
               break;
            }
        }
        if(N==1||N==2){
            System.out.println(0);
        }
    }
}
