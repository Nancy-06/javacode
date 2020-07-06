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

    //链表相交
    //他们不一定有相交的点
    public ListNode getIntersectionNode2(ListNode headA, ListNode headB){
        if(headA == null || headB == null){
            return null;
        }
        // 走到最后一个节点，统计长度，最后一个节点相同则有相交的点，不同则没有
        ListNode p = headA;
        ListNode q = headB;
        int lengthA = 1;
        int lengthB = 1;
        while(p.next != null){
            lengthA ++;
            p = p.next;
        }
        while(q.next != null){
            lengthB ++;
            q = q.next;
        }
        if(p == q){
            int length = Math.abs(lengthA - lengthB);
            for(int i = 0; i < length; i++){
                if(lengthA > lengthB){
                    headA = headA.next;
                }else{
                    headB = headB.next;
                }
            }
            while(headA != null && headB != null){
                if(headA == headB){
                    return headA;
                }
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
