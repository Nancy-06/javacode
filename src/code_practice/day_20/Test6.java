package code_practice.day_20;

import List.List;

/**
 * @author guoyao
 * @create 2020/6/18
 */

public class Test6 {

    //删除中间结点(不用自己去找中间结点，node即为中间结点)
    public void deleteNode(ListNode node) {

       node.val = node.next.val;
       node.next = node.next.next;
    }

    // 返回倒数第K个结点
    public int kthToLast(ListNode head, int k) {
        int length = 0;
        for(ListNode cur = head; cur != null; cur = cur.next){
            length ++;
        }
        if(length < k){
            return 0;
        }
        int val = length - k;
        ListNode cur = head;
        while(val != 0){
            cur = cur.next;
            val --;
        }
        return cur.val;
    }

    public int kthToLast2(ListNode head, int k){
       ListNode front = head;
       ListNode back = head;
       for(int i = 0; i < k; i++){
           if(front == null){
               return 0;
           }
           front = front.next;
       }
       while(front != null){
           front = front.next;
           back = back.next;
       }
       return back.val;
    }
}
