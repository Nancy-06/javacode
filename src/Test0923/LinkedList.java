package Test0923;

class Node{
    int value;
    Node next;
    Node prev;
    Node(int value){
        this.value=value;
    }
}
public class LinkedList {
    Node head=null;
    Node last=null;
    public void addFirst(int value){
        Node cur=new Node(value);
        if(head==null){
            last=cur;
        }
        else{
            head.prev=cur;
            cur.next=head;
        }
        head=cur;
    }
    public void addLast(int value){
        Node cur=new Node(value);
        if(head==null){
            last=cur;
        }
        else{
           cur.prev=last;
           last.next=cur;
        }
        last=cur;
    }
    public int pollFirst() throws Exception{
        if(head==null){
            throw new Exception("空的链表");
        }
        int oldValue=head.value;
        head=head.next;
        if(head==null){
            last=null;
        }
        else{
            head.prev=null;
        }
        return oldValue;
    }
    public int pollLast()throws Exception{
        if(head==null){
            throw new Exception("空的链表");
        }
        int oldValue=last.value;
        last=last.prev;
        if(last==null){
            head=null;
        }
        else{
            last.next=null;
        }
        return oldValue;
    }

    public void display(){
        System.out.println("打印链表");
        for(Node cur=head;cur!=null;cur=cur.next){
            System.out.println(cur.value);
        }
        System.out.println("==================================");
        for(Node cur=last;cur!=null;cur=cur.prev){
            System.out.println(cur.value);
        }
    }
    public static void main(String[] args) throws  Exception{
        LinkedList list=new LinkedList();
        list.display();
        list.addFirst(1);
        list.display();
        list.addFirst(2);
        list.display();
        list.addLast(3);
        list.display();
        list.pollFirst();
        list.display();
        list.pollLast();
        list.display();
        list.pollFirst();
        list.display();
    }
}
