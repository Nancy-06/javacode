package code_practice.day_18;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyao
 * @create 2020/5/28
 */
public class Test6 {

    //数组中数字出现的次数，只有两个数字值出现了一次，其余出现两次，请输出只出现一次的数字
    public int[] singleNumbers(int[] nums) {
        int sum = 0;
        for(int num : nums){
            sum ^= num;
        }
        int flag = (-sum) & sum;
        int [] result = new int [2];
        for(int num : nums){
            if((flag & num) == 0){
                result[0] ^= num;
            }else{
                result[1] ^= num;
            }
        }
        return result;
    }
}
