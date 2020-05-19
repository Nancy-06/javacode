package code_practice.day_17;

/**
 * @author guoyao
 * @create 2020/5/19
 */

//在排序数组中查找数字
public class Test9 {

    //遍历查找
    public int search(int[] nums, int target) {
        int num=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                num++;
            }
        }
        return num;
    }
    //二分查找的思想
    public int search2(int[] nums, int target){
        int left=0;
        int right=nums.length-1;
        int count=0;
        while(left<right){
            int mid=left+(right-left)/2;
            if(nums[mid]>=target){
                right=mid;
            }else{
                left=mid+1;
            }
        }
        while(left<nums.length&&nums[left++]==target){
            count++;
        }
        return count;
    }

}
