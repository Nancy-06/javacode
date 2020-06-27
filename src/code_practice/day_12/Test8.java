package code_practice.day_12;

/**
 * @author guoyao
 * @create 2020/6/27
 */
public class Test8 {

    //给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
    //法1
    public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        while(cur != null && cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return head;
    }

    //法2
    public ListNode deleteDuplicates2(ListNode head){
        if(head == null || head.next == null){
            return head;
        }
        ListNode cur = head;
        ListNode key = null;
        while(cur != null){
            key = cur.next;
            if(key == null){
                break;
            }
            if(cur.val == key.val){
                cur.next = key.next;
                key = null;
                continue;
            }
            cur = key;
        }
        return head;
    }


    //给定一个排序链表，删除所有含有重复数字的节点，
    // 只保留原始链表中 没有重复出现 的数字。
    //法1
    public ListNode deleteDuplicates11(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode fake = new ListNode(0);
        fake.next = head;
        ListNode prev = fake;
        ListNode last = head.next;
        while(last != null){
            if(last.val != head.val){
                prev = head;
                head = last;
                last = last.next;
            }
            else{
                while(last != null && last.val == head.val){
                    last = last.next;
                }
                if(prev != null){
                    prev.next = last;
                }else{
                    fake.next = last;
                }
                head = last;
                if(last != null){
                    last = last.next;
                }
            }
        }
        return fake.next;
    }

    //法2
    public ListNode deleteDuplicates22(ListNode head){
        ListNode listNode = new ListNode(0);
        listNode.next = head;
        ListNode cur = listNode;
        while(cur.next != null && cur.next.next != null){
            if(cur.next.val == cur.next.next.val){
                ListNode temp = cur.next;
                while(temp != null && temp.next != null && temp.val == temp.next.val){
                    temp = temp.next;
                }
                cur.next = temp.next;
            }else{
                cur = cur.next;
            }
        }
        return listNode.next;
    }

}
