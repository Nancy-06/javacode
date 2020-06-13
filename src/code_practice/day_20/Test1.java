package code_practice.day_20;

import List.List;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/6/13
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }
public class Test1 {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        while(l1 != null){
            stack1.push(l1.val);
            l1 = l1.next;
        }
        while(l2 != null){
            stack2.push(l2.val);
            l2 = l2.next;
        }
        int cur = 0;
        ListNode head = null;
        while(!stack1.isEmpty() || !stack2.isEmpty() || cur > 0){
            int sum = cur;
            sum += stack1.isEmpty() ? 0 : stack1.pop();
            sum += stack2.isEmpty() ? 0 : stack2.pop();
            ListNode node = new ListNode(sum%10);
            node.next = head;
            head = node;
            cur = sum / 10;
        }
        return head;
    }
}
