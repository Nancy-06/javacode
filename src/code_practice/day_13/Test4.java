package code_practice.day_13;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/5
 */

//尼科彻斯定理
public class Test4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a=n*(n-1)+1;
        System.out.print(a);
        for(int i=2;i<=n;i++){
            int m=a+(i-1)*2;
            System.out.print("+"+m);
        }
    }

}
