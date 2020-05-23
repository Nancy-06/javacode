package code_practice.day_18;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/5/23
 */

//不要2
public class Test2 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int m=scanner.nextInt(),n=scanner.nextInt();
        int eventICount=(n/4)*2+(n%4<2?n%4:2);
        int oddICount=((n-2)/4)*2+((n-2)%4<2?(n-2)%4:2);
        int ans=m/4*(eventICount+oddICount)*2;
        if((m%4)>0){
            ans+=eventICount;
        }
        if(m%4>1){
            ans+=eventICount;
        }
        if(m%4>2){
            ans+=oddICount;
        }
        System.out.println(ans);
    }



}
