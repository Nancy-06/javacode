package code_practice.day_17;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/5/13
 */

//大整数排序
public class Test2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            BigInteger [] bg=new BigInteger[n];
            for(int i=0;i<n;i++) {
                bg[i] = scanner.nextBigInteger();
            }
            Arrays.sort(bg);
            for(int i=0;i<n;i++){
                System.out.println(bg[i]);
            }
        }
    }
}
