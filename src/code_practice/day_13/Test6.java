package code_practice.day_13;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/7
 */

//46126 洗牌
public class Test6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //数据组数
        int T=scanner.nextInt();
        while(T-->0){
           int n=scanner.nextInt();
           int k=scanner.nextInt();
           int [] array=new int[2*n];
           int [] temp=new int[2*n];
           for(int i=0;i<2*n;i++){
               array[i]=scanner.nextInt();
           }
           for(int i=0;i<2*n;i++){
               int index=i+1;
               for(int j=0;j<k;j++){
                   if(index<=n){
                       index=2*index-1;
                   }
                   else{
                       index=2*(index-n);
                   }
               }
               temp[i]=array[index-1];
           }
           if(temp.length>0){
               System.out.print(temp[0]);
           }
           for(int i=1;i<2*n;i++){
               System.out.print(" "+temp[i]);
           }
            System.out.println();
        }
    }

}
