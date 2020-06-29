package code_practice.day_12;

/**
 * @author guoyao
 * @create 2020/4/21
 */
//删除链表的倒数第N个结点
public class Test7 {
    public Node removeNthFromEnd(Node head,int n){
        int length=0;
        Node cur=head;
        while(cur!=null){
            length++;
            cur=cur.next;
        }
        if(length<n){
            return head;
        }
        int index=length-n;
        if(index==0){
            return head.next;
        }
        cur=head;
        for(int i=1;i<index;i++){
            cur=cur.next;
        }
        cur.next=cur.next.next;
        return head;
    }
}
