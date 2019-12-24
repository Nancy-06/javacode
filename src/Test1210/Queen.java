package Test1210;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/24
 */
public class Queen {
    public static final int N=100;
    public static int n;  //n个皇后
    public static int [] queen=new int [N];
    public static int sum=0;

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        while(scanner.hasNext()){
            n=scanner.nextInt();
            long start=System.nanoTime();
            backTrack(0);
            long end=System.nanoTime();
            System.out.println("总共有："+sum);
            System.out.println("运行时间为："+(end-start)*1.0/1000/1000+"毫秒");
        }


    }
    //判断能否把皇后放到第row行，第col列
    public static boolean place(int row,int col){
        //检查皇后是否冲突
        for(int i=0;i<row;i++){
            if(queen[i]==col||Math.abs(queen[i]-col)==Math.abs(i-row)) {
                //在同一列，斜线上
                return false;
            }
        }
        return true;
    }

    public static void backTrack(int cur){  //放第cur行的皇后
        for(int i=0;i<n;i++) {

            if (place(cur, i)) {
                queen[cur] = i;//将第cur行的皇后放到第i列
                if (cur == n - 1) {  //所有的皇后放完了
                    sum++;
                } else {
                    backTrack(cur + 1);
                }
            }
        }
    }
}
