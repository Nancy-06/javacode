package code_practice.day_08;

/**
 * @author guoyao
 * @create 2020/3/21
 */
//左右最值最大值
public class Test8 {

    public static  int findMaxGap(int[] A, int n) {
       int max=A[0];
       for(int i=1;i<n;i++){
           if(A[i]>max){
               max=A[i];
           }
       }
       int min=Math.min(A[0],A[n-1]);
       return max-min;
    }

    public static void main(String[] args) {
        int [] array={2,7,3,1,2};
        System.out.println(findMaxGap(array,5));
    }
}
