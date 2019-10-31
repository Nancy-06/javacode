package likou_nowcoder_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author guoyao
 * @create 2019/10/31
 */
public class Test16 {


    //https://leetcode-cn.com/problems/search-insert-position/submissions/
    //题目：搜索插入元素
    public static int searchInsert(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    //https://leetcode-cn.com/problems/plus-one/submissions/
    //题目：加一

    public int[] plusOne(int[] digits) {
        for(int i=digits.length-1;i>=0;i--){
            if(digits[i]!=9){
                digits[i]+=1;
                return digits;
            }
            else{
                digits[i]=0;
            }
        }
        int [] temp=new int [digits.length+1];
        temp[0]=1;
        for(int i=1;i<temp.length;i++){
            temp[i]=digits[i-1];
        }
        return temp;
    }

    public static void main(String[] args) {
        int [] nums={1,3,5,6};
        System.out.println(searchInsert(nums,7));
    }
}
