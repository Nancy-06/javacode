package code_practice.day_10;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/27
 */
//末尾0的个数
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int res=0;
        for(int i=n;i>=5;i--){
            int temp=i;
            while(temp%5==0){
                res++;
                temp/=5;
            }
        }
        System.out.println(res);
    }
}
