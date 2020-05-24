package code_practice.day_18;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2020/5/24
 */
public class Test3 {

    //和为s的连续正数序列
    //双指针法
    public int[][] findContinuousSequence(int target) {
        if(target == 2){
            return null;
        }
        List<int [] > lists = new ArrayList<>();
        int min = 1;
        int max = 2;
        int sum = 3;
        while(min <= target/2){
            if(sum > target){
                sum -= min;
                min++;
            }
            else{
                if(sum == target){
                    lists.add(getOneArray(min,max));
                }
                max++;
                sum+=sum;
            }
        }
        return lists.toArray(new int [0][]);
    }

    private int[] getOneArray(int lo, int hi) {
        int [] res = new int[hi - lo +1];
        for(int i = lo; i <= hi; i++){
            res[i-lo] = i;
        }
        return res;
    }

}
