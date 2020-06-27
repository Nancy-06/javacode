package code_practice.day_20;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/6/27
 */
public class Test13 {

    //主要元素
    public int majorityElement(int[] nums) {
      int temp = nums[0];
      int count = 1;
      for(int i = 1; i < nums.length; i++){
          if(nums[i] == temp){
              count++;
          }else{
              count--;
          }
          if(count == 0){
              temp = nums[i];
              count = 1;
          }
      }
      //验证是否满足要求
        int t = nums.length/2+1;
      count = 0;
      for(int num : nums){
          if(num == temp){
              count++;
          }
          if(count == t){
              return temp;
          }
      }
      return -1;
    }
}
