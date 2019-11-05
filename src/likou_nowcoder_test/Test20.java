package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2019/11/5
 */
public class Test20 {

    //找第k大的数
    public static int findKth(int[] a, int n, int K) {
        Arrays.sort(a);
        int result=0;
        int i;
        for(i=n-1;i>=0;i--){
            if(a[i]==a[i-1]){
                continue;
            }
            else{
                result+=1;
                if(result==K){
                    break;
                }
            }
        }
        return a[i];
    }

    public static void main(String[] args) {
        int [] a={1,3,5,2,2};
        System.out.println(findKth(a,5,3));
    }
}
