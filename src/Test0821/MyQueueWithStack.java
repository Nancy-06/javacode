package Test0821;

import java.util.Stack;

//用栈实现队列
public class MyQueueWithStack {
    private Stack<Integer> stack1=new Stack<>();
    private Stack<Integer> stack2=new Stack<>();

    /**
     向栈里面插入元素
     * @param x 插入的元素
     */
    public void push(int x){
        stack1.push(x);
    }

    /**
     * 往栈1里面插入元素，再把栈1里面的元素插入到栈2，相当于队列的先进先出，删除栈2的栈顶元素
     * @return 栈2的栈顶元素
     */
    public int pop(){
        if(stack2.empty()) {
            while(!stack1.empty()){
                int value=stack1.pop();
                stack2.push(value);
            }
        }
        return stack2.pop();
    }

    /**
     * 往栈1里面插入元素，再把栈1里面的元素插入到栈2，相当于队列的先进先出，查看栈2的栈顶元素，
     * 但是不删除栈顶元素
     * @return栈顶元素
     */
    public int peek(){
        if(stack2.empty()) {
            while(!stack1.empty()){
                int value=stack1.pop();
                stack2.push(value);
            }
        }
        return stack2.peek();
    }
    public boolean empty(){
        return stack1.empty()&&stack2.empty();
    }

    public static void main(String[] args) {
        MyQueueWithStack m=new MyQueueWithStack();
        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        //System.out.println(m.pop());
        //System.out.println(m.pop());
        //System.out.println(m.pop());
        //System.out.println(m.pop());
        System.out.println(m.peek());
        System.out.println(m.peek());
        System.out.println(m.peek());
        System.out.println(m.empty());

    }
}
