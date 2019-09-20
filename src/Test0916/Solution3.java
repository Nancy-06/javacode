package Test0916;

import java.util.Arrays;

//交换一次的先前排列，交换完使它的字典序列，成为比它原来小的里面最大的排列
public class Solution3 {
    public static int[] prevPermOpt1(int[] A) {
        int len=A.length;
        if(len==1){
            return A;
        }
        int i=len-2;
        while(i>0){
            if(A[i]<=A[i+1]){
                i--;
            }
            else{
                break;
            }
        }
        int key=i+1;
        int j=i+1;
        while(j<len){
            if(A[i]>A[j]&&A[key]<A[i]){
                if(A[key]<A[j]){
                    key=j;
                }
                j++;
            }
            else{
                break;
            }
        }
        int value=A[key];
        A[key]=A[i];
        A[i]=value;
        return A;
    }

    public static void main(String[] args) {
        int [] array={3,2,1};
        int [] arrays=prevPermOpt1(array);
        System.out.println(Arrays.toString(arrays));
    }
}
