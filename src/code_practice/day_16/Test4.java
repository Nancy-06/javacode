package code_practice.day_16;

import List.List;

/**
 * @author guoyao
 * @create 2020/5/8
 */


//两个链表的第一个公共结点
class ListNode{
    int val;
    ListNode next;
    ListNode(int x){
        val=x;
        next=null;
    }
}
public class Test4 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int lenA=lengthNode(headA);
        int lenB=lengthNode(headB);
        ListNode longNode=null;
        ListNode shortNode=null;
        int differ=0;
        if(lenA<lenB){
            longNode=headB;
            shortNode=headA;
            differ=lenB-lenA;
        }
        else{
            longNode=headA;
            shortNode=headB;
            differ=lenA-lenB;
        }
        for(int i=0;i<differ;i++){
            longNode=longNode.next;
        }
        while(longNode!=shortNode){
            shortNode=shortNode.next;
            longNode=longNode.next;
        }
        return shortNode;

    }

    public int lengthNode(ListNode head){
        int length=0;
        for(ListNode cur=head;head!=null;head=head.next){
            length++;
        }
        return length;
    }
}
