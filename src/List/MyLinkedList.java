package List;

public class MyLinkedList implements List {

    public class Node{
        public int val;
        public Node prev;
        public Node next;
        public Node(int val){
            this.val=val;
            this.prev=null;
            this.next=null;
        }
        public Node(int val,Node prev,Node next){
            this(val);
            this.prev=prev;
            this.next=next;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "val=" + val +
                    '}';
        }
    }

    /**
     * 记录结点的第一个位置
     */
    public Node head=null;
    /**
     * 记录链表的长度
     */
    public int size=0;
    /**
     * 记录结点的最后一个位置
     */
    public Node last=null;

    /**
     * 获取当前节点的位置,
     * @param index   结点
     * @return
     */
    public Node getNode(int index){
        /**
         * 从前查找或者从后查找，减少时间复杂度
         */
        if(index<size/2){
            Node cur=head;
            for(int n=0;n<index;n++){
                cur=cur.next;
            }
            return cur;
        }
        else {
            Node cur = last;
            for (int n = 0; n < size - index - 1; n++) {
                cur = cur.prev;
            }
            return cur;
        }
    }

    @Override
    public boolean add(int element) {
        return add(size,element);
    }

    /**
     * 把element插入到下标为index的位置处
     * @param index  代表下标
     * @param element   代表插入的值
     * @return  true代表正确，false代表错误
     */
    @Override
    public boolean add(int index, int element) {
        /**
         * 判断下标合法性
         */
        if(index<0||index>size){
            System.out.println("错误");
            return false;
        }
        /**
         * 相当于头插，需特殊处理
         * 如果开始不为空链表时，需处理前驱结点，如果为空链表时，要注意最后一个结点和第一个结点一样
         */
        if(index==0){
            head=new Node(element,null,head);
            if(head.next!=null){
                head.next.prev=head;
            }
            if(size==0){
                last=head;
            }
            size++;
            return true;
        }
        /**
         * 相当于尾插，也要判断它 的前驱结点，以及当它为空链表时的情况
         */
        if(index==size){
            last=new Node(element,last,null);
            if(last.prev!=null){
                last.prev.next=last;
            }
            if(size==0){
                last=head;
            }
            size++;
            return true;
        }
        /**
         * 中间插入，更新结点，更新长度
         */
        Node node=getNode(index);
        Node newNode=new Node(element,node.prev,node);
        node.prev.next=newNode;
        node.prev=newNode;
        size++;
        return true;
    }

    /**
     * 获取链表中当前下标的值
     * @param index   下标
     * @return 下标的指
     */
    @Override
    public int get(int index) {
        if(index<0||index>size){
            System.out.println("错误");
            return -1;
        }
        Node node=getNode(index);
        return node.val;
    }

    /**
     * x修改当前下标的值
     * @param index  下标
     * @param val   修改为val
     * @return    之前下标的值
     */
    @Override
    public int set(int index, int val) {
        if(index<0||index>size){
            System.out.println("错误");
            return -1;
        }
        Node node=getNode(index);
        int oldValue=node.val;
        node.val=val;
        return oldValue;
    }

    /**
     * 删除当前结点的位置
     * @param index   结点
     * @return  结点的值
     */
    @Override
    public int remove(int index) {
        if(index<0||index>size){
            System.out.println("错误");
            return -1;
        }
        Node node=getNode(index);
        /**
         * 更新结点
         */
        if(node.prev!=null){
            node.prev.next=node.next;
        }
        /**
         * node为第一个结点
         */
        else{
            head=node.next;
        }
        /**
         * 更新结点
         */
        if(node.next!=null){
            node.next.prev=node.prev;
        }
        /**
         * node为最后一个结点
         */
        else{
            last=node.prev;
        }
        size--;
        return node.val;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }
    @Override
    public String toString() {
        String s="[";
        for(Node c=head;c!=null;c=c.next){
            s+=(c.val+",");
        }
        s+="]";
        return s;
    }
}
