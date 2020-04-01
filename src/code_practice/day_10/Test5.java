package code_practice.day_10;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/3/28
 */
//栈的压入、弹出序列
public class Test5 {
    public boolean IsPopOrder(int [] pushA,int [] popA){
        if(pushA.length==0||popA.length==0||pushA.length!=popA.length){
            return false;
        }
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<pushA.length;i++){
            stack.push(pushA[i]);
            int j=0;
            while(!stack.isEmpty()&&stack.peek()==popA[j]){
                stack.pop();
                j+=1;
            }
        }
        return stack.isEmpty();
    }
}
