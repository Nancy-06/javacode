package code_practice.day_08;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/20
 */

//合唱团
public class Test6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int [] array=new int[n+1];
        //获取能力值
        for(int i=1;i<=n;i++){
            array[i]=scanner.nextInt();
        }
        int k=scanner.nextInt();
        int d=scanner.nextInt();
        //创建最大值和最小值两个辅助数组
        long [][] f=new long[n+1][k+1];
        long [][] g=new long[n+1][k+1];
        //初始化两个数组，即K=1的情况
        for(int i=1;i<=n;i++){
            f[i][1]=array[i];
            g[i][1]=array[i];
        }
        //从K=2开始填充（遍历每一行）
        for(int curK=2;curK<=k;curK++){
            for(int curN=curK;curN<=n;curN++){
                long temMax=Long.MIN_VALUE;
                long temMin=Long.MAX_VALUE;
                for(int left=Math.max(curK-1,curN-d);left<=curN-1;left++){
                    if(temMax<Math.max(f[left][curK-1]*array[curN],g[left][curK-1]*array[curN])){
                        temMax=Math.max(f[left][curK-1]*array[curN],g[left][curK-1]*array[curN]);
                    }
                    if(temMin>Math.min(f[left][curK-1]*array[curN],g[left][curK-1]*array[curN])){
                        temMin=Math.min(f[left][curK-1]*array[curN],g[left][curK-1]*array[curN]);
                    }
                }
                //更新大值
                f[curN][curK]=temMax;
                //更新最小值
                g[curN][curK]=temMin;
            }
        }
        long maxResult=Long.MIN_VALUE;
        for(int curN=k;curN<=n;curN++){
            if(f[curN][k]>maxResult){
                maxResult=f[curN][k];
            }
        }
        System.out.println(maxResult);
    }
}
