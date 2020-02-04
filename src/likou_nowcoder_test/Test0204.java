package likou_nowcoder_test;

import com.sun.deploy.cache.InMemoryLocalApplicationProperties;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/2/4
 */
public class Test0204 {
    //力扣8：字符串装换整数
    public static int myAtoi(String str) {
        int rev=0;
        int length=str.length();
        char [] chs=str.toCharArray();
        int zf=1;
        int i=0;
        int pop=0;
        for(;i<length;i++){
            if(chs[i]==' '){
                continue;
            }
            else{
                if(chs[i]=='-'){
                    i++;
                    zf=-1;
                    break;
                }
                if(chs[i]=='+'){
                    i++;
                    zf=1;
                    break;
                }
                if(chs[i]<'0'||chs[i]>'9'){
                    return 0;
                }
                else{
                    break;
                }
            }
        }
        if(i==length){
            return 0;
        }
        for(;i<length;i++){
            if(chs[i]<'0'||chs[i]>'9'){
                return rev;
            }
            pop=(chs[i]-48)*zf;
            if(rev>Integer.MAX_VALUE/10||(rev==Integer.MAX_VALUE/10&&pop>7)){
                return Integer.MAX_VALUE;
            }
            if(rev<Integer.MIN_VALUE/10||(rev==Integer.MIN_VALUE/10&&pop<-8)){
                return Integer.MIN_VALUE;
            }
            rev=rev*10+pop;
        }
        return rev;
    }

    //力扣34：在排序数组中查找元素的第一个和最后一个位置
    public static int[] searchRange(int[] nums, int target) {
        int i=0;
        int j=nums.length;
        int mid=(i+j)/2;
        int p=-1;
        while(i<j){
            if(nums[mid]==target){
                p=mid;
                break;
            }
            if(nums[mid]>target){
                j=mid;
                mid=(i+j)/2;
            }
            else{
                if(i==mid){
                    break;
                }
                i=mid;
                mid=(i+j)/2;
            }
        }
        if(p==-1){
            return new int[]{-1,-1};
        }
        int a=p;
        int b=p;
        while(a>0&&nums[a-1]==target){
            a--;
        }
        while(b<nums.length-1&&nums[b+1]==target){
            b++;
        }
        return new int[]{a,b};
    }

    public static void main(String[] args) {
        String str="-92";
        System.out.println(myAtoi(str));
        int [] nums={2,3,3,3,4,5,6};
        System.out.println(Arrays.toString(searchRange(nums,3)));
    }
}
