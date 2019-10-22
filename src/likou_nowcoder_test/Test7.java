package likou_nowcoder_test;

//题目：删除链表中重复的结点
//题目链接：https://www.nowcoder.com/practice/fc533c45b73a41b0b44ccba763f866ef?tpId=13&tqId=11209&tPage=3&rp=3&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
public class Test7 {
    public static Node create(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(2);
        Node n4=new Node(2);
        Node n5=new Node(5);
        Node n6=new Node(6);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        return n1;
    }
    //打印链表
    public static void display(Node head){
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.printf("%d--> ",cur.value);
        }
        System.out.println("null");
    }
    public static Node deleteDuplication(Node pHead) {
        while(pHead==null){
            return null;
        }
        Node prev=null;
        Node head=pHead;
        Node nHead=head.next;
        while(nHead!=null){
           if(nHead.value!=head.value){
           prev=head;
           head=nHead;
           nHead=nHead.next;
           }
           else{
               while(nHead!=null&&nHead.value==head.value){
                   nHead=nHead.next;
               }
               if(prev==null){
                   pHead=nHead;
               }
               else{
                   prev.next=nHead;
               }
               head=nHead;
               if(nHead!=null){
                   nHead=nHead.next;
               }
           }
        }
        return pHead;
    }

    public static void main(String[] args) {
        Node head=create();
        head=deleteDuplication(head);
        display(head);
    }
}
