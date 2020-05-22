package code_practice.day_18;

/**
 * @author guoyao
 * @create 2020/5/22
 */


public class Test1 {
    //连续子数组的最大和
    //动态规划
    public int maxSubArray(int[] nums) {

        int max = nums[0];
        for(int i=0,sum =0;i<nums.length;i++){
            if(sum>0){
                sum += nums[i];
            }else{
                sum = nums[i];
            }
            if(sum>max){
                max = sum;
            }else{
                max = max;
            }
        }
        return max;
    }

    //调整数组顺序使其奇数位于偶数前面
    public int[] exchange(int[] nums) {
        int i = 0;
        int j = nums.length-1;
        while(i<j){
            if(nums[i]%2 == 1 && nums[j]%2 == 0){
                i++;
                j--;
            }
            else if(nums[i]%2 == 0 && nums[j]%2 == 1){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
                j--;
            }
            else if(nums[i]%2 ==0){
                j--;
            }
            else if(nums[j]%2 == 1){
                i++;
            }
        }
        return nums;
    }

    //快排思想
    public int[] exchange2(int [] nums){
        int left = 0;
        int right = nums.length-1;
        while(left<right){
            while(left<right && nums[left]%2 !=0){
                left++;
            }
            while(left<right && nums[right]%2 ==0){
                right --;
            }
            if(left<right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
        }
        return nums;
    }


}
