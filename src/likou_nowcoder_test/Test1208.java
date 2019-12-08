package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/8
 */
//守形数
public class Test1208 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int n=scanner.nextInt();
            int m=n*n;
            int result=lowNum(m);
            if(result==n){
                System.out.println("Yes!");
            }
            else{
                System.out.println("No!");
            }
        }
    }
    public static int lowNum(int m){
        int num=0;
        int m1=m;
        while(m!=0){
            m=m/10;
            num++;
        }
       int result=m1%(int)Math.pow(10,num-1);
        return result;
    }
}
