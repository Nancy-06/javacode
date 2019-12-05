package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/4
 */
//数字之和
public class Test11204 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            int m=n*n;
            int sumn=0;
            int summ=0;
            while(n!=0||m!=0){
                sumn+=n%10;
                summ+=m%10;
                n=n/10;
                m=m/10;
            }
            System.out.println(sumn+" "+summ);
        }
    }
}
