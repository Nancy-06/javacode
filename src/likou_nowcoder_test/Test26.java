package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/9
 */
public class Test26 {

    //买水果
    public static int buy(int n){
        if(n<6||n==10||n%2==1){
            return -1;
        }
        if(n%8==0){
            return n/8;
        }
        return n/8+1;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(buy(n));
    }
}
