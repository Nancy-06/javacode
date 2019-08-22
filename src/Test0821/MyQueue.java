package Test0821;

//实现队列
public class MyQueue {
    class Node{
        private int value;
        private Node next;
        Node(int value){
            this.value=value;
        }
        private Node head=null;
        private Node last=null;
        private int size=0;
        //尾插
        public void push(int element){
            size++;
            if(head!=null){
                last.next=new Node(element);
                last=last.next;
            }

        }
        //头删
        public int pop(){
            int element=head.value;
            head=head.next;
            size--;
            if(head==null){
                last=null;
            }
            return element;
        }
        public int rear(){
            return last.value;
        }
        public int front(){
            return head.value;
        }
        public int size(){
            return size;
        }
        public boolean empty(){
            return size==0;
        }

    }
}
