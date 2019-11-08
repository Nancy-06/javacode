package likou_nowcoder_test;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2019/11/8
 */
public class Test24 {

    //合法括号序列判断
    public static boolean chkParenthesis(String A, int n) {
        if(n<=0||n%2==1){
            return false;
        }

        char[] array=A.toCharArray();
        Stack<Character> stack=new Stack<>();

        for(char c:array){
            if(stack.isEmpty()&&c==')'){
                return false;
            }
            if(c!='('&&c!=')'){
                return false;
            }
            else if(c=='('){
                stack.push(c);
            }
           else{
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str="))((((()))))";
        System.out.println(chkParenthesis(str,10));
    }
}
