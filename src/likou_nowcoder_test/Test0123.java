package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/1/23
 */
public class Test0123 {
    //力扣217：存在重复元素
    public static boolean containsDuplicate(int [] nums){
        Arrays.sort(nums);
        int j=nums.length-2;
        if((j==0)&&nums[j]==nums[j+1]){
            return true;
        }
        for(int i=0;i<=j;i++){
            if(nums[i]==nums[i+1]){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int [] nums={5,4,6,3,3,2,1};
        System.out.println(containsDuplicate(nums));
    }
}
