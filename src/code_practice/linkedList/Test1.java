package code_practice.linkedList;

/**
 * @author guoyao
 * @create 2020/7/6
 */
public class Test1 {

    //链表相交
    //他们一定有相交的点
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        int lenA = length(headA);
        int lenB = length(headB);
        ListNode longNode = null;
        ListNode shortNode = null;
        int differ = 0;
        if(lenA > lenB){
            longNode = headA;
            shortNode = headB;
            differ = lenA - lenB;
        }else{
            longNode = headB;
            shortNode = headA;
            differ = lenB - lenA;
        }
        for(int i = 0; i < differ; i++){
            longNode = longNode.next;
        }
        while(longNode != shortNode){
            longNode = longNode.next;
            shortNode = shortNode.next;
        }
        return shortNode;
    }

    public int length(ListNode head){
        int length = 0;
        for(ListNode cur = head; cur != null;cur = cur.next){
            length ++;
        }
        return length;
    }

}
