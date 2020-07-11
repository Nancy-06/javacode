package code_practice.day_21;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/7/11
 */
public class MinStack {

    Stack <Integer> stack;
    Stack <Integer> minStack;
    public MinStack() {
        stack = new Stack<>();
        minStack = new Stack<>();
    }

    public void push(int x) {
        stack.push(x);
        if(minStack.isEmpty()){
            minStack.push(x);
        }else{
            if(x > minStack.peek()){
                minStack.push(minStack.peek());
            }else{
                minStack.push(x);
            }
        }

    }

    public void pop() {
        stack.pop();
        minStack.pop();
    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();
    }
}
