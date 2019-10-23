package likou_nowcoder_test;

import java.util.*;

//题目：从尾到头打印链表
//题目链接：https://www.nowcoder.com/practice/d0267f7f55b3412ba93bd35cfa8e8035?tpId=13&tqId=11156&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class Test8 {
    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list=new ArrayList<>();
        while(listNode==null){
            return list;
        }
        ListNode newNode=null;
        ListNode head=listNode;
        while(head!=null){
            ListNode pNext=head.next;
            head.next=newNode;
            newNode=head;
            head=pNext;
        }
        while(newNode!=null){
            list.add(newNode.val);
            newNode=newNode.next;
        }
        return list;
    }
}
