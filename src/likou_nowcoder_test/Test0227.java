package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2020/2/27
 */
//返回倒数第K个结点
public class Test0227 {
    public int kthToLast(ListNode head, int k) {
        int len=getLength(head);
        for(int i=0;i<len-k;i++){
            head=head.next;
        }
        return head.val;
    }
    public int getLength(ListNode head){
        int length=0;
        while(head!=null){
            length++;
            head=head.next;
        }
        return length;
    }
}
