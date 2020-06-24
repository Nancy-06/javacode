package code_practice.day_20;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/6/24
 */
public class Test11{

    //最小K个数
    public int[] smallestK(int[] arr, int k) {

        int [] result = new int[k];
        Arrays.sort(arr);
        for(int i = 0; i < k; i++){
            result[i] = arr[i];
        }
        return result;
    }

    //消失的数字
    public int missingNumber(int[] nums) {
//        int length = nums.length;
//        Arrays.sort(nums);
//        if(nums[0] != 0){
//            return 0;
//        }
//        int result = 0;
//        for(int i = 1; i <length+1; i++){
//            if(nums[i] != i){
//                result = i;
//            }
//        }
//        return result;

        int len = nums.length;
        int count = (len+1)*len/2;
        for(int i = 0; i < len; i++){
            count-=nums[i];
        }
        return count;
    }
}
