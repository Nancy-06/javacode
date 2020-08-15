package code_practice.day_23;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/8/11
 */

//数字拆分
public class Test2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
            int n = sc.nextInt();
            System.out.println(result(n));
            t--;
        }
    }

    private static int result(int n) {
        if(n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        if(n == 3){
            return 2;
        }
        return result(n / 2) + 1;
    }
}
