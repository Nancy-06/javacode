package likou_nowcoder_test;


/**
 * @author guoyao
 * @create 2019/11/27
 */
//链表分割
public class Test112703 {
    public ListNode partition(ListNode pHead, int x) {
        ListNode small = null;
        ListNode big = null;
        ListNode head = pHead;
        ListNode bigLast = null;
        ListNode smallLast = null;
        while (head != null) {
            if (head.val < x) {
                ListNode next = head.next;
                if (small == null) {
                    small = head;
                } else {
                    smallLast.next = head;
                }
                smallLast = head;
                head = next;
            } else {
                ListNode next = head.next;
                if (big == null) {
                    big = head;
                } else {
                    bigLast.next = head;
                }
                bigLast = head;
                head = next;
            }
        }
        if(small==null){
            return big;
        }
        else{
            smallLast.next=big;
            if(bigLast!=null){
                bigLast.next=null;
            }
            return small;
        }
    }
}