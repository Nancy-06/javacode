package Test1009;

import java.util.*;
//给定一个整数数组 nums 和一个目标值 target，
// 请你在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
public class Test3 {
    public static int [] twoSum(int [] nums,int target){
        int [] count=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    count[0]=i;
                    count[1]=j;
                }
            }
        }
        return count;
    }

    public static int [] twoSum1(int [] nums,int target){
        int [] count=new int[2];
        HashMap<Integer,Integer> hash=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hash.containsKey(nums[i])){
                count[0]=hash.get(nums[i]);
                count[1]=i;
                return count;
            }
            //将数据存入 key为补数，value为下标
            hash.put(target-nums[i],i);
        }
        return count;
    }
    public static void main(String[] args) {
        int [] nums={2,7,11,15};
        int target=9;
        int [] count=twoSum1(nums,target);
        System.out.println(Arrays.toString(count));
    }
}
