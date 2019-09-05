package Test0904;


import java.util.*;
//复制带随机指针的链表
public class Solution2 {
    public static class Node{
        int value;
        Node next;
        Node random;
        Node(int value){
            this.value=value;
        }
    }
    public static Node copy(Node head){
        Node cur=head;
        Node result=null;
        Node last=null;
        Map<Node,Node> map=new HashMap<>();
        while(cur!=null){
            Node val=new Node(cur.value);
            if(result==null){
                result=val;
            }
            else{
                last.next=val;
            }
            last=val;
            map.put(cur,val);
            cur=cur.next;
        }
        cur=head;
        Node val=result;
        while(cur!=null){
            val.random=cur.random;
            cur=cur.next;
            val=val.next;
        }
        return result;
    }
    //创造一个链表
    public  static Node create(){
        Node n1=new Node(1);
        Node n2=new Node(2);
        Node n3=new Node(3);
        Node n4=new Node(4);
        Node n5=new Node(5);
        Node n6=new Node(6);
        Node n7=new Node(7);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=n7;
        n7.next=null;
        n1.random=n3;
        n3.random=n6;
        return n1;
    }

    public static void main(String[] args) {
        Node head=create();
        copy(head);
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.printf("%d->",cur.value);
        }
        System.out.println("null");
        for(Node cur=head;cur!=null;cur=cur.random){
            System.out.printf("%d->",cur.value);
        }
        System.out.println("null");
    }
}