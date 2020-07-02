package code_practice.day_20;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/7/2
 */
public class Test18 {

    //利用栈实现队列
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();

    // 添加元素
    public void push(int value){
        s1.push(value);
    }

    //删除队列的第一个元素（即栈的栈底元素）
    public int pop(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                int val = s1.pop();
                s2.push(val);
            }
        }
        return s2.pop();
    }

    // 查找队列的第一个元素，但是不删除（即栈的栈底元素）
    public int poll(){
        if(s2.isEmpty()){
            while(!s1.isEmpty()){
                int val = s1.pop();
                s2.push(val);
            }
        }
        return s2.peek();
    }

    //判断栈是否为空
    public boolean isEmpty(){
        return s1.isEmpty() && s2.isEmpty();
    }
}
