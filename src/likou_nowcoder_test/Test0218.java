package likou_nowcoder_test;

import Test0821.Solution;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/2/18
 */
public class Test0218 {
    //括号匹配
    public boolean stach(char left,char right){
        if(left=='('&&right==')'){
            return true;
        }
        if(left=='['&&right==']'){
            return true;
        }
        if(left=='{'&&right=='}'){
            return true;
        }
        return false;
    }

    public boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case '(':
                case '[':
                case '{':
                    stack.add(ch);
                    break;
                case ')':
                case ']':
                case '}':
                    if(stack.isEmpty()) {
                        return false;
                    }
                    char left=stack.remove(s.length()-1);
                    if(!stach(left,ch)){
                        return false;
                    }
                    break;
            }
        }
        if(!stack.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Solution solution=new Solution();
        //char[] a={'[','(',')',']'};
        //String s=new String(a);
        String s="[ ( ) ]";
        System.out.println(solution.isValid(s));

    }
}
