package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/27
 */

//数组中值出现了一次的数字（通过异或解决）
public class Test7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int [n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        int sign=0;
        //去的数组中两个唯一数的按位异或结果
        for(int i=0;i<n;i++){
            sign^=array[i];
        }
        //获取区分两个唯一数的比特位所代表的值
        //也可以写成：sign&=(~sign)+1
        sign=((~sign+1)&sign);
        int [] result=new int[2];
        //通过标识，区分两个数组
        for(int m:array){
            if((sign&m)==sign){
                result[0]=result[0]^m;
            }else{
                result[1]=result[1]^m;
            }
        }
        if(result[0]<result[1]){
            System.out.printf("%d %d%n",result[0],result[1]);
        }else{
            System.out.printf("%d %d%n",result[1],result[0]);
        }
    }
}
