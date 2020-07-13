package code_practice.day_21;

/**
 * @author guoyao
 * @create 2020/7/13
 */
public class Test4 {


    //连续数列
    public int maxSubArray(int[] nums) {

        int length = nums.length;
        if(length == 0){
            return 0;
        }
        if(length == 1){
            return nums[0];
        }
        int max = nums[0];
        int [] dp = new int[length];
        dp[0] = nums[0];
        for(int i = 1; i < length; i++){
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }

}
