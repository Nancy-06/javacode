package Test0909;

//分割链表，比k小的在前面，比k大的在后面
public class Test {
    public static class Node1{
        int value;
        Node1 next;
        Node1(int value){
            this.value=value;
        }

    }
    public static Node1 create3(){
        Node1 n1=new Node1(3);
        Node1 n2=new Node1(2);
        Node1 n3=new Node1(5);
        Node1 n4=new Node1(4);
        Node1 n5=new Node1(8);
        Node1 n6=new Node1(1);
        n1.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n6;
        n6.next=null;
        return n1;
    }
    public static Node1 found(Node1 head,int k){
        Node1 smallNode=null;
        Node1 bigNode=null;
        Node1 cur=head;
        Node1 smallLast=null;
        Node1 bigLast=null;
        while(cur!=null){
            if(cur.value<=k){
                if(smallNode==null){
                    smallNode=cur;
                }
                else{
                    smallLast.next=cur;
                }
                smallLast=cur;
            }
            else{
                if(bigNode==null){
                    bigNode=cur;
                }
                else{
                    bigLast.next=cur;
                }
                bigLast=cur;
            }
            cur=cur.next;
        }
        if(smallNode==null){
            return bigNode;
        }
        else{
            smallLast.next=bigNode;
            if(bigLast!=null){
                bigLast.next=null;
            }
        }
        return smallNode;
    }

    public static void main(String[] args) {
        Node1 head=create3();
        Node1 rhead=found(head,4);
        for(Node1 cur=rhead;cur!=null;cur=cur.next){
            System.out.println(cur);
        }
    }
}
