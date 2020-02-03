package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/2/3
 */
public class Test0203 {
    //力扣1：两数之和
    public static int[] twoSum(int[] nums, int target) {
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

    //力扣67：二进制求和
    public static String addBinary(String a, String b) {
        int aLen=a.length();
        int bLen=b.length();
        int sumLen=Math.max(aLen,bLen);
        //从个位开始加，由于个位是在字符串的右边
        //代码访问是从左往右进行访问，因此先反转
        StringBuffer sA=new StringBuffer(a).reverse();
        StringBuffer sB=new StringBuffer(b).reverse();
        //让两个字符串补齐
        while(sA.length()<sumLen){
            sA.append("0");
        }
        while(sB.length()<sumLen){
            sB.append("0");
        }

        StringBuffer sum=new StringBuffer();
        //进位，初始化为0
        int carry=0;
        int nums1;
        int nums2;
        for(int i=0;i<sumLen;i++){
            nums1=sA.charAt(i)-'0';
            nums2=sB.charAt(i)-'0';
            if(carry+nums1+nums2>1){
                //减去2要进位
                sum.append(carry+nums1+nums2-2);
                carry=1;
            }
            else{
                sum.append(carry+nums1+nums2);
                carry=0;
            }
        }
        //最高位要单独进位
        if(carry==1){
            sum.append("1");
        }
        //进行反转
        return sum.reverse().toString();
    }
    public static void main(String[] args) {
        int []nums={3,4,5,6,3,7};
        System.out.println(Arrays.toString(twoSum(nums,7)));
        String a="1010";
        String b="1011";
        System.out.println(addBinary(a,b));
    }
}
