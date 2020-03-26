package code_practice.day_09;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/24
 */
//计算糖果
public class Test4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int y1,y2,y3,y4;
        int a,b,c;
        while(scanner.hasNext()){
            y1=scanner.nextInt();
            y2=scanner.nextInt();
            y3=scanner.nextInt();
            y4=scanner.nextInt();
            a=(y1+y3)/2;
            b=(y3-y1)/2;
            c=(y4-y2)/2;
            if((a-((y1+y3)/2))!=0){
                System.out.println("No");
                return;
            }
            if((b-((y3-y1)/2))!=0||(b!=((y2+y4)/2))){
                System.out.println("No");
                return;
            }
            if((c-((y4-y2)/2))!=0){
                System.out.println("No");
                return;
            }
            System.out.print(a+" "+b+" "+c);
        }
    }
}
