package code_practice.day_22;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/7/24
 */
public class Test1 {

    //给定一个正整数n,计算n与斐波那契数的最小差值
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int left, right;
        int f1 = 0;
        int f2 = 1;
        while(true){
            int temp;
            if(n <= f2){
                left = n - f1;
                right = f2 - n;
                break;
            }
            temp = f1 + f2;
            f1 = f2;
            f2 = temp;
        }
        System.out.println(Math.min(left,right));
    }
}
