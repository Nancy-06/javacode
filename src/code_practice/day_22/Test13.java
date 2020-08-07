package code_practice.day_22;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/8/6
 */
public class Test13 {
    //序列号：1/5 - 1/10 + 1/15 - 1/20 ……
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            double res = 0;
            while(n > 0){
                res += (1.0/(10*n - 5)) - (1.0/(10*n));
                n --;
            }
            double res1 = (double) (Math.round(res * 10000)) / 10000;
            System.out.println(res1);
        }
    }
}
