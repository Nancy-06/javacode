package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2019/11/30
 */

//链式A+B
public class Test113004 {

    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here

        ListNode newNode=new ListNode(-1);
        ListNode result=newNode;

        int up=0;
        while(a!=null&&b!=null){
            int sum=a.val+b.val+up;
            if(sum>9){
                up=1;
                newNode.next=new ListNode(sum-10);
            }
            else{
                up=0;
                if(newNode==null){
                    newNode=new ListNode(sum-10);
                }
                else{
                    newNode.next=new ListNode(sum-10);
                }
            }
            newNode=newNode.next;
            a=a.next;
            b=b.next;
        }
        if(a!=null){
            ListNode node=a.next;
            newNode.next=new ListNode(a.val+up);
            newNode.next.next=node;
        }
        else if(b!=null){
            ListNode node=b.next;
            newNode.next=new ListNode(a.val+up);
            newNode.next.next=node;
        }
       else{
            if(up==1){
                newNode.next=new ListNode(1);
            }
        }
        return result.next;
    }

}
