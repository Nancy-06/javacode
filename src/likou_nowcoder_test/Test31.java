package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/12
 */
//求最小公倍数
public class Test31 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int x=scanner.nextInt();
        int y=scanner.nextInt();
      //min(x,y);
        min1(x,y);
    }

    public static void min(int x,int y){
        if(x*y!=0){
            int t=x;
            x=y;
            y=t;
        }
        for(int i=x;i<=x*y;i++){
            if(i%x==0&&i%y==0){
                System.out.println(i);
                break;
            }
        }
    }
    //辗转相除法
    public static void min1(int x,int y){
        int p=x;
        int q=y;
        while(y!=0){
            int k=x%y;
            x=y;
            y=k;
        }
        System.out.println(p*q/x);
    }
}
