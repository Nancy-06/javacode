package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/2/1
 */
public class Test0201 {
    //力扣414：第三大的数
    public static int thirdMax(int[] nums) {
        Arrays.sort(nums);
       int i=1;
        int j=nums.length-1;
        while(j>0){
            if(nums[j]==nums[j-1]){
                j--;
            }
            else{
                i++;
                j--;
            }
            if(i==3){
                break;
            }
        }
        if(i!=3){
            return nums[nums.length-1];
        }
        return nums[j];
    }

    public static void main(String[] args) {
        int [] nums={4,5};
        System.out.println(thirdMax(nums));
    }
}
