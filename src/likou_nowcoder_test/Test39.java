package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2019/11/18
 */
public class Test39 {
    //构建乘积数组
    public static int[] multiply(int[] A) {

        int [] B=new int [A.length];
        for(int i=0;i<A.length;i++){
            B[i]=1;
            for(int j=0;j<A.length;j++){
                if(i!=j){
                    B[i]=B[i]*A[j];
                }
            }
        }
        return B;
    }

    public static void main(String[] args) {
        int [] A={1,2,3,4,5};
        int [] B=multiply(A);
        System.out.println(Arrays.toString(B));
    }
}
