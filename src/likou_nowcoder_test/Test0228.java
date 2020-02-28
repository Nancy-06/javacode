package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/2/28
 */
public class Test0228 {
    //汽水瓶
    public static int drink(int n){
        int total=0;
        while(n>2){
            total=total+n/3;
            n=n/3+n%3;
        }
        if(n==2){
            total=total+1;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n;
        while(scanner.hasNext()){
            n=scanner.nextInt();
            System.out.println(drink(n));
        }
    }
}
