package code_practice.day_17;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/5/15
 */
//餐馆（二分查找+贪心）
public class Test4 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int n= scanner.nextInt();
            int m=scanner.nextInt();
            int max=0;
            int [] a=new int[n];
            //标记，查看这个桌子是否被用了，如果被用了，就置为1
            int [] vis=new int[n];
            int [] [] num=new int [m][2];
            for(int i=0;i<n;i++){
                a[i]=scanner.nextInt();
            }
            Arrays.sort(a);
            for(int i=0;i<m;i++){
                num[i][0]=scanner.nextInt();
                num[i][1]=scanner.nextInt();
            }
            Arrays.sort(num, new Comparator<int[]>() {
                @Override
                public int compare(int[] a, int[] b) {
                    return a[1]-b[1];
                }
            });
            for(int i=0;i<m;i++){
                if(a[n-1]<num[i][0]){
                    continue;
                }
                int renshu=num[i][0];
                int prive=num[i][1];
                //找到renshu在n的位置
                int index=result(renshu,a);
                while(index<n&&vis[index]==1){
                    index++;
                }
                if(index<n){
                    max+=prive;
                    vis[index]=1;
                }
            }
            System.out.println(max);
        }
    }

    private static int result(int renshu, int[] a) {
        int left=0;
        int right=a.length-1;
        int mid=0;
        while(left<=right){
            mid=left+(right-left)/2;
            if(renshu<=a[mid]){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return left;
    }
}

