package code_practice.day_13;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/5
 */
//组个最小数
public class Test3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] array=new int[10];
        //0-9
        //输入0-9这10个数字的出现的个数
        for(int i=0;i<10;i++){
            array[i]=sc.nextInt();
        }

       //先输出安装1-9的顺序第一个出现的数字1次
        for(int i=1;i<10;i++){
            if(array[i]!=0){
                System.out.print(i);
                array[i]--;
                break;
            }
        }
        //第二位：输出0
        while(array[0]!=0){
            System.out.print(0);
            array[0]--;
        }
        //最后按照1-9的顺序输出
        for(int i=1;i<10;i++){
            while(array[i]!=0){
                System.out.print(i);
                array[i]--;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
