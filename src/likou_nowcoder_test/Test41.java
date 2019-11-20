package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/20
 */

//跟奥巴马一起学编程
public class Test41 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int N=scanner.nextInt();
        String C=scanner.next();
        for(int i=1;i<=N;i++){       //打印第一行
            System.out.print(C);
        }
        System.out.println();

        //打印中间行
        for(int i=1;i<=Math.round((double)N/2-2);i++){
            System.out.print(C);
            for(int j=2;j<=N-1;j++){
                System.out.print(" ");
            }
            System.out.println(C);
        }
        for(int i=1;i<=N;i++){       //打印最后一行
            System.out.print(C);
        }
        System.out.println();
    }
}
