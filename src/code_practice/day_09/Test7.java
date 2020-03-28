package code_practice.day_09;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/25
 */

//最小公倍数
public class Test7 {
//    public static void main(String[] args) {
//        Scanner scanner=new Scanner(System.in);
//        int x=scanner.nextInt();
//        int  y=scanner.nextInt();
//        for(int i=x;i<=x*y;i++){
//            if(i%x==0&&i%y==0){
//                System.out.println(i);
//                break;
//            }
//        }
//    }

    public static int lcm(int a,int b){
        return (a*b)/gcd(a,b);
    }

    //求最大公约数
    private static int gcd(int a, int b) {
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        System.out.println(lcm(a,b));

    }

}
