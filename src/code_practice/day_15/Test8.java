package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/28
 */

//772--年会抽奖
public class Test8 {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        while(scan.hasNext()){
            int n=scan.nextInt();
            float sum1=factorial(n);
            float sum2=count(n);
            float result= (sum2/sum1)*100;
            System.out.println(String.format("%.2f",result)+"%");
        }
    }

    /**
     * 错排算法
     * @param n
     * @return
     */
    private static float count(int n) {
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return (n-1)*(count(n-1)+count(n-2));
        }
    }

    /**
     * n的阶乘
     * @param n
     * @return
     */
    private static float factorial(int n) {
        float result=1;
        if(n==0){
            return 1;
        }else if(n>0){
            result=n*factorial(n-1);
        }
        return result;
    }
}
