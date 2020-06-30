package code_practice.day_20;


import java.util.HashSet;
import java.util.Set;

/**
 * @author guoyao
 * @create 2020/6/29
 */
public class Test14 {


    //移除重复节点
    public ListNode removeDuplicateNodes(ListNode head) {

        if(head == null){
            return null;
        }
        Set<Integer> set = new HashSet<>();
        ListNode pre = head;
        ListNode cur = head.next;
        set.add(head.val);
        while(cur != null){
            if(set.contains(cur.val)){
                pre.next = cur.next;
                cur = cur.next;
            }
            else{
                set.add(cur.val);
                pre = cur;
                cur = cur.next;
            }
        }
        return head;
    }
}
