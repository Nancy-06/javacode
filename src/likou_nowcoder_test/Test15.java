package likou_nowcoder_test;

import java.util.Arrays;
import java.util.List;

/**
 * @author guoyao
 * @create 2019/10/29
 */
public class Test15 {
    public static int[] twoSum(int[] numbers, int target) {
        int [] sum=new int[2];
        int i=0;
        int j=numbers.length-1;
        while (i<j){
            if(numbers[i]+numbers[j]>target){
                j--;
            }
            if(numbers[i]+numbers[j]<target){
                i++;
            }
           if(numbers[i]+numbers[j]==target){
                break;
           }
        }
        sum[0]=i+1;
        sum[1]=j+1;
        return sum;
    }

    //反转链表
    //题目链接：https://leetcode-cn.com/problems/reverse-linked-list/

    public ListNode reverseList(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode node=head;
        ListNode newNode=null;
        while(node!=null){
            ListNode next=node.next;
            node.next=newNode;
            newNode=node;
            node=next;
        }
        return newNode;
    }

    //移除链表元素
    //题目链接：https://leetcode-cn.com/problems/remove-linked-list-elements/

    public ListNode removeElements(ListNode head, int val) {
       if(head==null){
           return null;
       }
        ListNode newNode=null;
        ListNode node=head;
        ListNode last=null;
        while(node!=null){
            ListNode next=node.next;
            if(node.val!=val){
                if(newNode==null){
                    node.next=newNode;
                    newNode=node;
                }
               else{
                    last.next=node;
                }
                last=node;
            }
            node=next;
        }
        if(last!=null){
            last.next=null;
        }
        return newNode;
    }


    //链表的中间结点
    //https://leetcode-cn.com/problems/middle-of-the-linked-list/

    public ListNode middleNode(ListNode head) {
        if(head==null){
            return null;
        }
        ListNode first=head;
        ListNode last=head;
        while(first!=null){
            first=first.next;
            if(first==null){
                break;
            }
            last=last.next;
            first=first.next;
        }
        return last;
    }

    //回文链表
    //题目链接：https://leetcode-cn.com/problems/palindrome-linked-list/
    public boolean isPalindrome(ListNode head) {
        if(head==null){
            return true;
        }
        ListNode middle=middleNode(head);
        ListNode nodeLast=reverseList(middle);
        ListNode n1=head;
        ListNode n2=nodeLast;
        while(n1!=null&&n2!=null){
            if(n1.val!=n2.val){
                return false;
            }
            n1=n1.next;
            n2=n2.next;
        }
        return true;
    }

    //反转链表2
    //题目链接：https://leetcode-cn.com/problems/reverse-linked-list-ii/
    public ListNode reverseBetween(ListNode head, int m, int n) {
        ListNode cur= new ListNode(0);
        cur.next=head;
        ListNode pre=cur;
       for(int i=1;i<m;i++){
           pre=pre.next;
       }
       head=pre.next;
       for(int j=m;j<n;j++){
           ListNode next=head.next;
           head.next=next.next;
           next.next=pre.next;
           pre.next=next;
       }
        return cur.next;
    }

    //奇偶链表
    //题目链接：https://leetcode-cn.com/problems/odd-even-linked-list/
    public ListNode oddEvenList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        //奇链表的头结点
        ListNode qFirst=head;
        //偶链表的头结点
        ListNode oFirst=qFirst.next;
        //偶链表的尾结点
        ListNode val=oFirst;
        while(qFirst.next!=null&&val.next!=null){
            qFirst.next=val.next;
            qFirst=qFirst.next;
            val.next=qFirst.next;
            val=val.next;
        }
        qFirst.next=oFirst;
        return head;
    }

    //删除排序链表中的重复元素
    //题目链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list-ii/

    public ListNode deleteDuplicates(ListNode head) {
        while (head == null) {
            return null;
        }
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode prev = fake;
        ListNode last = head.next;
        while (last != null) {
            if (last.val != head.val) {
                prev = head;
                head = last;
                last = last.next;
            } else {
                while (last != null && last.val == head.val) {
                    last = last.next;
                }
                if (prev != null) {
                    prev.next = last;
                } else {
                    fake.next = last;
                }
                head = last;
                if (last != null) {
                    last = last.next;
                }
            }
        }
        return fake.next;
    }

    public static void main(String[] args) {
        int [] num={2,3,4};
        int [] array=twoSum(num,7);
        System.out.println(Arrays.toString(array));
    }
}
