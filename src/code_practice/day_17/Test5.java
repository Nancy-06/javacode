package code_practice.day_17;

/**
 * @author guoyao
 * @create 2020/5/16
 */

//合并两个排序的链表
public class Test5 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null&&l2==null){
            return null;
        }
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode newList=null;
        ListNode last=null;
        ListNode head1=l1;
        ListNode head2=l2;
        while(head1!=null&&head2!=null){
            if(head1.val<head2.val){
                ListNode next=head1.next;
                if(newList==null){
                    head1.next=newList;
                    newList=head1;
                }else{
                    last.next=head1;
                }
                last=head1;
                head1=next;
            }else{
                ListNode next=head2.next;
                if(newList==null){
                    head2.next=newList;
                    newList=head2;
                }else{
                    last.next=head2;
                }
                last=head2;
                head2=next;
            }
        }
        if(head1!=null){
            last.next=head1;
        }
        if(head2!=null){
            last.next=head2;
        }
        return newList;
    }
}
