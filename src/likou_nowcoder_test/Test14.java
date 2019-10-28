package likou_nowcoder_test;

import java.util.*;

/**
 * @author guoyao
 * @create 2019/10/28
 */
public class Test14 {
    //题目：27.移除数组
    //题目链接：https://leetcode-cn.com/problems/remove-element/
    public static int removeElement(int[] nums, int val) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }

    //题目：965 单值二叉树
    //题目链接:https://leetcode-cn.com/problems/univalued-binary-tree/
    public static boolean isUnivalTree(TreeNode root) {
        if(root==null){
            return true;
        }
        if(root.left!=null&&root.val!=root.left.val){
            return false;
        }
        if(root.right!=null&&root.val!=root.right.val){
            return false;
        }
        return (isUnivalTree(root.left)&&isUnivalTree(root.right));
    }
    //题目链接：https://leetcode-cn.com/problems/unique-number-of-occurrences/submissions/
    //题目：1207 独一无二的出现次数

    public static  boolean uniqueOccurrences(int[] arr) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int num:arr){
            int temp=map.getOrDefault(num,0);
            map.put(num,temp+1);
        }
        Set<Integer> set=new HashSet<>(map.values());
        return map.size()==set.size();
    }

    //题目：263 丑数
    //题目链接：https://leetcode-cn.com/problems/ugly-number/

    public static  boolean isUgly(int num) {
        if(num<1){
            return false;
        }
        while(num%2==0){
            num=num/2;
        }
        while(num%3==0){
            num=num/3;
        }
        while(num%5==0){
            num=num/5;
        }
        return num==1;
    }

    //题目链接：https://leetcode-cn.com/problems/squares-of-a-sorted-array/
    //题目：977 有序数组的平方

    public static  int[] sortedSquares(int[] A) {
        int [] array=new int [A.length];
        for(int i=0;i<A.length;i++){
           // array[i]=Math.abs(A[i])*Math.abs(A[i]);
            array[i]=A[i]*A[i];
        }
        Arrays.sort(array);
        return array;
    }

    //题目链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/
    //题目：83 删除排序链表中的重复元素
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode node=head;
        ListNode key=null;
        while(node!=null){
            key=node.next;
            if(key==null){
                break;
            }
            if(key.val==node.val){
                node.next=key.next;
                key=null;
                continue;
            }
            node=key;
        }
        return head;
    }
    
    //https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
    //题目：删除链表中的结点

    public void deleteNode(ListNode node) {
       node.val=node.next.val;
       node.next=node.next.next;
    }
    public static void main(String[] args) {
        int [] nums={-3,2,2,3,3};
        System.out.println(removeElement(nums,3));
        System.out.println(uniqueOccurrences(nums));
        System.out.println(isUgly(8));
        int [ ]array=sortedSquares(nums);
        System.out.println(Arrays.toString(array));
    }
}
