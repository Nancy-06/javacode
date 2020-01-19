package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2020/1/19
 */
public class Test0119 {
    //力扣：27.移除元素
    public static int removeElement(int [] nums,int val){
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    //力扣：35.搜索插入位置
    public static int searchInsert(int[] nums, int target){
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        int [] nums={2,3,4,5,6};
        int val=3;
        System.out.println(removeElement(nums,val));
        int target=3;
        System.out.println(searchInsert(nums,target));
    }
}
