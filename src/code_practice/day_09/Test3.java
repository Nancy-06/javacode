package code_practice.day_09;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/3/22
 */

//用两个栈来实现队列
public class Test3 {

    Stack<Integer> statk1=new Stack<>();
    Stack<Integer> stack2=new Stack<>();
    public void push(int node){
        statk1.push(node);
    }
    public int pop(){
        if(statk1.empty()&&stack2.empty()){
            throw new RuntimeException("Query is empty!");
        }
        if(stack2.empty()){
            while (!statk1.empty()){
                stack2.push(statk1.pop());
            }
        }
        return stack2.pop();
    }
}
