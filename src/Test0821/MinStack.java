package Test0821;

import java.util.Stack;

//检索最小元素的栈
public class MinStack {
    Stack<Integer> normal=new Stack<>();
    Stack<Integer> min=new Stack<>();
    public void push(int x){
        normal.push(x);
        if(min.isEmpty()){
            min.push(x);
        }
        else{
            int n=min.peek();
            if(x>n){
                min.push(n);
            }
            else{
                min.push(x);
            }
        }
    }
    public void pop(){
        normal.pop();
        min.pop();
    }
    public int top(){
        return normal.peek();
    }
    public int getMin(){
        return min.peek();
    }

    public static void main(String[] args){
        MinStack m=new MinStack();
        m.push(5);
        m.push(9);
        m.push(2);
        m.push(2);
        m.push(7);
        m.push(3);
        m.push(1);
        m.pop();
        System.out.println(m.top());
        System.out.println(m.getMin());
    }

}
