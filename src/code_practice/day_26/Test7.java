package code_practice.day_26;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/9/24
 */

//球落地问题
public class Test7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            System.out.println(result(n,m));
        }

    }

    public static String result(int n , int m){

        if(n > m){
            return "0";
        }
        else if(n == m){
            return "1";
        }
        int res = 1;
        double sum = n;
        double val = n;
        while(val > 0){
           val /= 2;
           sum += val *  2;
           if(m >= sum){
               res ++;
           }
        }
        if(m > sum){
            return "no";
        }else{
            StringBuffer sb = new StringBuffer();
                    sb.append(res);
            return sb.toString();

        }
    }
}
