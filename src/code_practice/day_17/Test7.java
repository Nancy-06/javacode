package code_practice.day_17;

import java.util.HashMap;

/**
 * @author guoyao
 * @create 2020/5/17
 */
public class Test7 {

    //和为s的两个数字
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer,Integer> map=new HashMap<>();
        int [] result=new int[2];
        for(int i=0;i<nums.length;i++){
            int val=target-nums[i];
            if(map.containsKey(val)){
                result [0]=nums[i];
                result [1]=val;
                return result;
            }else{
                map.put(nums[i],i);
            }
        }
        return result;
    }
    //双指针法
    public int[] twoSum2(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int [] result=new int[2];
        while(left<right){
            if(nums[left]+nums[right]==target){
                result[0]=nums[left];
                result[1]=nums[right];
                return result;
            }
            if(nums[left]+nums[right]<target){
                left++;
            }else{
                right++;
            }
        }
        return result;
    }
}
