package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/13
 */

//不要二
public class Test32 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int W=scanner.nextInt();
        int H=scanner.nextInt();
        serach(W,H);
    }

    public static void serach(int x,int y){
        if(x%4==0||y%4==0){
            System.out.println(x*y/2);
        }
        if(x%2==0&&y%2==0){
            System.out.println(x*y/2+2);
        }
        else{
            System.out.println(x*y/2+1);
        }
    }
}
