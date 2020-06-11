package code_practice.day_19;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/6/11
 */
public class Test9 {

    //最接近的三数之和

    public int threeSumClosest(int[] nums, int target) {

        if(nums.length< 3){
            return 0;
        }
        Arrays.sort(nums);
        int result = nums[0] + nums[1] + nums[2];
        for(int i = 0; i < nums.length; i++){
            int left = i+1;
            int right = nums.length - 1;
            while(left < right){
                int cur = nums[i] + nums[left] + nums[right];
                if(Math.abs(cur - target) < Math.abs(result - target)){
                    result = cur;
                }
                if(cur > target){
                    right --;
                }else if(cur < target){
                    left ++;
                }else {
                    return target;
                }
            }
        }
       return result;
    }

    public static void main(String[] args) {

    }
}
