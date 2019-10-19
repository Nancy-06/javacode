package likou_nowcoder_test;
//21.合并两个有序链表
//题目链接：https://leetcode-cn.com/problems/merge-two-sorted-lists/
public class Test4 {
    public static Node create(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=null;
        return n1;
    }
    //打印链表
    public static void display(Node head){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.printf("%d--> ",cur.value);
        }
        System.out.println("null");
    }
    public static Node mergeTwoLists(Node N1, Node N2) {
        if(N1==null){
            return N2;
        }
        if(N2==null){
            return N1;
        }
        if(N1==null&&N2==null){
            return null;
        }
        Node cur1=N1;
        Node cur2=N2;
        Node node=null;
        Node last=null;
        while(cur1!=null&&cur2!=null){
            if(cur1.value<=cur2.value){
                Node next=cur1.next;
                if(node==null){
                   node=cur1;
                }
                else{
                    last.next=cur1;
                }
                last=cur1;
                cur1=next;
            }
            else{
                Node next=cur2.next;
                if(node==null){
                   node=cur2;
                }
                else{
                    last.next=cur2;
                }
                last=cur2;
                cur2=next;
            }
        }
        if(cur2!=null){
            last.next=cur2;
        }
        else{
            last.next=cur1;
        }
        return node;
    }

    public static void main(String[] args) {
        Node l1=create();
        Node l2=create();
        Node head=mergeTwoLists(l1,l2);
        display(head);
    }
}
