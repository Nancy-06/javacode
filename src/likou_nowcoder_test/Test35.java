package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/14
 */
//n的阶乘末尾有多少个0
public class Test35 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        long temp=fab(n);
        int count=0;
        while(temp%10==0){
            count++;
            temp=temp/10;
        }
        System.out.println(count);
    }
    public static long fab(int n){
        if(n==0||n==1){
            return n;
        }
        return n*fab(n-1);
    }
}
