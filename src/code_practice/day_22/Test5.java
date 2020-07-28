package code_practice.day_22;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/7/28
 */
public class Test5 {

    //和为s的两个数（数组递增排序）
    public int[] twoSum(int[] nums, int target){

        int i = 0;
        int j = nums.length-1;
        while(i < j){
            if(nums[i] + nums[j] < target){
                i++;
            }
           else  if(nums[i] + nums[j] > target){
                j--;
            }
            else{
                return new int[]{nums[i], nums[j]};
            }
        }
        return null;
    }
}
