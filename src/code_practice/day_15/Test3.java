package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/23
 */

//守形数
public class Test3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            isShouXingShu(n);

        }
    }

    private static void isShouXingShu(int n) {
        int m=n*n;
        String s1=String.valueOf(n);
        String s2=String.valueOf(m);
        String s=s2.substring(s2.length()-s1.length(),s2.length());
        if (s.equals(s1)) {
            System.out.println("Yes!");
        }
        else{
            System.out.println("No");
        }
    }
}
