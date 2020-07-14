package code_practice.day_21;

/**
 * @author guoyao
 * @create 2020/7/14
 */
public class Test5 {

    // 合并排序的数组
    public void merge(int[] A, int m, int[] B, int n) {

        int a = m-1;
        int b = n-1;
        int k = m+n-1;
        for( ; a >= 0 && b >= 0 && k >=0; k--){
            if(A[a] > B[b]){
                A[k] = A[a];
                a--;
            }else{
                A[k] = B[b];
                b--;
            }
        }
        if(b >= 0){
            while(k >= 0 && b >= 0){
                A[k--] = B[b--];
            }
        }
    }
}
