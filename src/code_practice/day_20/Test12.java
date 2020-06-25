package code_practice.day_20;

/**
 * @author guoyao
 * @create 2020/6/25
 */
public class Test12 {

    // 最大子序号（动态规划法）
    public int maxSubArray(int[] nums) {

        if(nums.length == 0){
            return 0;
        }
        int [] dp = new int[nums.length];
        dp[0] = nums[0];
        int max = dp[0];
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(dp[i+1]+nums[i], nums[i]);
            max = Math.max(dp[i],max);
        }
        return max;
    }
}
