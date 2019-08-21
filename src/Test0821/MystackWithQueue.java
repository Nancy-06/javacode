package Test0821;

import java.util.LinkedList;
import java.util.Queue;

//用队列实现栈
public class MystackWithQueue {
    static Queue<Integer> queue=new LinkedList<>();

    /**
     * 向队列插入元素（相当于头插）
     * @param element 要插入的元素
     */
    public static void push(int element){
        queue.add(element);
    }

    /**
     * 先把队列的前size-1个对象加在队列后面，然后把第size个元素删除并返回，相当于栈顶先进后出
     * @return 队列的最后一个元素，相当于栈顶元素
     */
    public static int pop(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int value=queue.remove();
            queue.add(value);
        }
        return queue.remove();
    }

    /**
     * 先把队列的前size-1个对象加在队列后面，然后把第size个元素删除，再添加到队尾去，
     * 这样每次返回的都是队尾元素（相当于栈顶元素）
     * @return 栈顶元素
     */
    public static int top(){
        int size=queue.size();
        for(int i=0;i<size-1;i++){
            int value=queue.remove();
            queue.add(value);
        }
        int v=queue.remove();
        queue.add(v);
        return v;
    }
    public static boolean empty(){
        return queue.isEmpty();
    }

    public static void main(String[] args) {
        push(1);
        push(2);
        push(3);
        push(4);
       // System.out.println(pop());
        //System.out.println(pop());
        //System.out.println(pop());
        //System.out.println(pop());
        System.out.println(top());
        System.out.println(top());
        System.out.println(empty());
    }
}
