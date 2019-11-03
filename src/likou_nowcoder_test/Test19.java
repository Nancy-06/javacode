package likou_nowcoder_test;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2019/11/3
 */
public class Test19 {
    //https://leetcode-cn.com/problems/backspace-string-compare/
    //比较含退格的字符串
    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1=new Stack<>();
        Stack<Character> stack2=new Stack<>();
        for(char c:S.toCharArray()){
            if(!stack1.isEmpty()&&c=='#'){
                stack1.pop();
            }
            if(c!='#'){
                stack1.push(c);
            }

        }
        for(char c:T.toCharArray()){
            if(!stack2.isEmpty()&&c=='#'){
                stack2.pop();
            }
            if(c!='#'){
                stack2.push(c);
            }
        }
      if(stack1.size()!=stack2.size()){
            return false;
      }
      while(!stack1.empty()&&!stack2.empty()){
            if(stack1.peek()==stack2.peek()){
                stack1.pop();
                stack2.pop();
            }
            else{
                return false;
            }
      }
        return true;
    }

    public static void main(String[] args) {
        String S="xywrrmp";
        String T="xywrrm#p";
        System.out.println(backspaceCompare(S,T));
    }
}
