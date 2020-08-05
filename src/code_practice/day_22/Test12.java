package code_practice.day_22;

/**
 * @author guoyao
 * @create 2020/8/5
 */
public class Test12 {

    //滑动窗口的最大值

    public int[] maxSlidingWindow(int[] nums, int k) {
        int len = nums.length;
        if(len == 0){
            return new int[0];
        }
        //定义一个数组存放最终的结果
        int [] result = new int [len - k + 1];
        //maxId记录每次最大值的下标，max记录最大值
        int maxId = -1;
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < len - k + 1; i++){
            //判断最大值下标是否在滑动窗口的范围内
            if(maxId >= i){
                //存在就只需比较窗口的最后面的值是否大于上一个滑动窗口的最大值
                if(nums[i + k - 1] > max){
                    max = nums[i + k -1];
                    //更新下标
                    maxId = i + k -1;
                }
            }
            //如果不存在的话就重新寻找当前窗口的最大值
            else{
                max = nums[i];
                for(int j = i; j < i + k; j++){
                    if(nums[j] > max){
                        max = nums[j];
                        maxId = j;
                    }
                }
            }
            result[i] = max;
        }
        return result;
    }
    
}
