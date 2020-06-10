package code_practice.day_19;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/6/10
 */
public class Test7 {


    //栈的压入、弹出序列
    public boolean validateStackSequences(int[] pushed, int[] popped) {

        if(pushed.length != popped.length){
            return false;
        }
        if(pushed.length == 0 && popped.length==0){
            return true;
        }
        int cur =0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < pushed.length; i++){
            stack.push(pushed[i]);
            while(!stack.empty() && stack.peek() == popped[cur]){
                stack.pop();
                cur++;
            }
        }
        return stack.empty();
    }
}
