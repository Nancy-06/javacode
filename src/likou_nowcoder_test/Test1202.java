package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/2
 */

//小易的升级之路
public class Test1202 {

    public static int max(int a,int b){
        int min=Math.min(a,b);
        int count=0;
        for(int i=min;i>=1;i--){
            if(a%i==0&&b%i==0){
                count=i;
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n=scanner.nextInt();  //怪物的数量
            int a=scanner.nextInt();  //小易的初始能力值
            int c=a;//小易的当前能力值
            int [] array=new int[n];
            for(int i=0;i<n;i++){
                array[i]=scanner.nextInt();
            }
            for(int i=0;i<n;i++){
                if(array[i]<=c){
                    c+=array[i];
                }
                else{
                    c+=max(c,array[i]);
                }
            }
            System.out.println(c);
        }
    }
}
