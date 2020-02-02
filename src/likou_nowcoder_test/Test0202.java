package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/2/2
 */
public class Test0202 {
    //力扣724：寻找数组的中心索引
    public static int pivotIndex(int[] nums) {
        int sum=0;
        int sumI=0;
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(sumI*2+nums[i]==sum){
                return i;
            }
            sumI+=nums[i];
        }
        return -1;
    }

    //力扣99：加1
    public static int[] plusOne(int[] digits){
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
            }
            else{
                digits[i]=0;
            }
        }
        int [] nums=new int [digits.length+1];
        nums[0]=1;
        return nums;
    }
    public static void main(String[] args) {
        int [] nums={1,7,3,6,5,6};
        //System.out.println(pivotIndex(nums));
        int [] digits={9,9,9,9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
}
