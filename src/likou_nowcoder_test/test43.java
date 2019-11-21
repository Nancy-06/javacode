package likou_nowcoder_test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/20
 */

//组个最小数
public class test43 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int [] array=new int[10];
        for(int i=0;i<array.length;i++){
            array[i]=scanner.nextInt();
        }

        System.out.println(solution(array));
    }

    public static String solution(int [] array){
        String str="";
        for(int i=0;i<array.length;i++){
            for(int j=1;j<=array[i];j++){
                if(str=="") {
                   for(int n=1;n<array.length;n++){
                       if(array[n]!=0) {
                           str+=n;
                           array[n]-=1;
                           break;
                       }
                   }
                }
                str+=i;
            }
        }
        return str;
    }
}
