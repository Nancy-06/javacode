package code_practice.day_20;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyao
 * @create 2020/6/21
 */
public class Test10 {

    // 旋转数组的最小数字
    public int minArray(int[] numbers) {
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(min > numbers[i]) {
                min = numbers[i];
            }
        }
        return min;
    }


    //给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。
    // 找出那个只出现了一次的元素。
    public int singleNumber1(int[] nums) {

        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }


    // 在一个数组 nums 中除一个数字只出现一次之外，
    // 其他数字都出现了三次。请找出那个只出现一次的数字。
    public int singleNumber2(int[] nums) {

        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int value = map.getOrDefault(nums[i],0);
            map.put(nums[i] , value+1);
        }
        int result = 0;
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    //给定一个整数数组 nums，其中恰好有两个元素只出现一次，其余所有元素均出现两次。
    // 找出只出现一次的那两个元素。

    public int[] singleNumber3(int[] nums) {

        int s = 0;
        for(int num : nums){
            s ^= num;
        }
        int k = s &(-s);
        int [] result = new int[2];
        for(int num : nums){
            if((num & k) == 0){
                result[0] ^= num;
            }
            else{
                result[1] ^= num;
            }
        }
       return result;
    }

}
