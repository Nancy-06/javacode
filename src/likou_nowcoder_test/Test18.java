package likou_nowcoder_test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author guoyao
 * @create 2019/11/2
 */
public class Test18 {

    //https://leetcode-cn.com/problems/next-greater-element-i/
    //下一个更大元素
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>  stack=new Stack<>();
        HashMap<Integer,Integer> hashMap=new HashMap<>();
        int [] array=new int[nums1.length];
        for(int num:nums2){
            while(!stack.isEmpty()&&num>stack.peek()){
                hashMap.put(stack.pop(),num);
            }
            stack.push(num);
        }
        for(int i=0;i<nums1.length;i++){
            array[i]=hashMap.getOrDefault(nums1[i],-1);
        }
        return array;
    }

    public static void main(String[] args) {
        int []nums1={4,1,2};
        int [] nums2={1,3,4,2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
}
