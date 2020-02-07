package likou_nowcoder_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2020/2/6
 */
public class Test0206 {
    //力扣581：最短无序连续子数组
    public static int findUnsortedSubarray(int[] nums) {
        int length=nums.length;
        //从后往前找最小值
        //从前往后找最大值
        int min=nums[length-1];
        int max=nums[0];
        int i=0;
        int j=-1;
        for(int k=0;k<length;k++){
            if(max>nums[k]){
                j=k;
            }
            else{
                max=nums[k];
            }
            if(min<nums[length-k-1]){
                i=length-k-1;
            }
            else{
                min=nums[length-k-1];
            }
        }
        return j-i+1;
    }

    //力扣78：子集
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        list.add(new ArrayList<>());
        for(int i=0;i<nums.length;i++){
            int size=list.size();
            for(int j=0;j<size;j++){
                List<Integer> temp=new ArrayList<>(list.get(j));
                temp.add(nums[i]);
                list.add(temp);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        int [] nums={2,6,4,8,10,9,15};
        System.out.println(findUnsortedSubarray(nums));
    }
}
