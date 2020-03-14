package code_practice.day_06;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/13
 */

//连续最大和
public class Test7 {
    public static int judge1(int [] array,int n){
        int count=array[0];
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=array[j];
                if(sum>count){
                    count=sum;
                }
            }
        }
        return count;
    }

    public static int judge(int [] array,int n){
        if(array==null||n==0){
            return 0;
        }

        int max=array[0];
        int sum=array[0];
        for(int i=0;i<n;i++){
            if(sum<0){
                sum=array[i];
            }else{
                sum+=array[i];
            }
            if(sum>max){
                max=sum;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] arrray=new int[n];
        for(int i=0;i<n;i++){
            arrray[i]=scanner.nextInt();
        }
        System.out.println(judge(arrray,n));
    }
}
