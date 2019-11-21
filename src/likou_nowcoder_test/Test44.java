package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/20
 */

//尼科彻斯定理
public class Test44 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();
            int m=n*n-n+1;
            System.out.print(m);
            for(int i=1;i<n;i++){
                System.out.print("+"+(m+=2));
            }
            System.out.println();
        }


    }
}
