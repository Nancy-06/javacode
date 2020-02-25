package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/2/25
 */
public class Test0225 {
    //力扣：Nim游戏
    public boolean canWinNim(int n) {
        if(n%4==0){
            return false;
        }
        return true;
    }
    //力扣：数组拆分1
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int num=0;
        for(int i=0;i<nums.length;i+=2){
            num+=nums[i];
        }
        return num;
    }
    //力扣：反转字符串
    public void reverseString(char[] s) {
        for(int i=0;i<s.length/2;i++){
            int j=s.length-1-i;
            char c=s[i];
            s[i]=s[j];
            s[j]=c;
        }
    }

    
}
