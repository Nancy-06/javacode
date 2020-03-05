package code_practice.day_03;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/5
 */

//球的半径和体积
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x0=scanner.nextInt();
        int y0=scanner.nextInt();
        int z0=scanner.nextInt();
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int z1=scanner.nextInt();
        double length,volume;
        double a=Math.pow(x1-x0,2)+Math.pow(y1-y0,2)+Math.pow(z1-z0,2);
        length=Math.sqrt(a);
        volume=(4/3.0)*Math.PI*Math.pow(length,3);

        System.out.printf("%.3f",length);
        System.out.printf(" "+"%.3f",volume);
    }
}
