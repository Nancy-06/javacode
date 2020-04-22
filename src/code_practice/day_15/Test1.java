package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/22
 */

//找x
public class Test1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int n=sc.nextInt();
            int [] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            int m=sc.nextInt();
            int result=-1;
            for(int i=0;i<n;i++){
                if(array[i]==m){
                    result=i;
                }
            }
            System.out.println(result);
        }
    }
}
