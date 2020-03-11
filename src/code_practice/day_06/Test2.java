package code_practice.day_06;

/**
 * @author guoyao
 * @create 2020/3/11
 */
public class Test2 {

    //二维数组打印
    public static int[] arrayPrint(int[][] arr, int n) {
        int [] array=new int [n*n];
        int i=0,j=n-1,k=0;
        while(i<n&&j>=0){
            int p=i,q=j;
            while(p<n&&q<n){
                array[k]=arr[p][q];
                k++;
                p++;
                q++;
            }
            if(j==0){
                i++;
            }else{
                j--;
            }
        }
        return array;
    }
}
