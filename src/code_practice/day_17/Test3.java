package code_practice.day_17;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/5/14
 */

class ListNode {
    int val;
    ListNode next;
    ListNode(int x){
        val = x;
    }
}

//从尾到头打印链表
public class Test3 {
    public int[] reversePrint(ListNode head) {

        int length=0;
        for(ListNode cur=head;cur!=null;cur=cur.next){
            length++;
        }
        int [] result=new int[length];
        while(head!=null){
            result[--length]=head.val;
            head=head.next;
        }
        return result;
    }

    //利用栈
    public int[] reversePrint1(ListNode head){
        Stack<Integer> stack=new Stack<>();
        while(head!=null){
            stack.push(head.val);
            head=head.next;
        }
        int [] res=new int[stack.size()];
        int i=0;
        while(!stack.isEmpty()){
            res[i++]=stack.pop();
        }
        return res;
    }

}
