package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/6
 */

public class Test111206 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] array=new int [n];
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        int x=scanner.nextInt();
        int result=-1;
        for(int i=0;i<n;i++){
            if(x==array[i]){
               result=i;
                break;
            }
        }
        System.out.println(result);
    }
}
