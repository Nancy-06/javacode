package Test0821;

import java.util.ArrayList;
import java.util.Stack;

//括号匹配问题
public class Solution {
    private boolean match(char left,char right){
        if(left=='('&&right==')'){
            return true;
        }
        if(left=='['&&right==']'){
            return true;
        }
        if(left=='{'&&right=='}'){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean isValid(String s){
        ArrayList<Character> stack=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            switch(ch){
                case '(':
                case '[':
                case '{':
                    stack.add(ch); break;
                case ')':
                case ']':
                case '}':
                    if(stack.isEmpty()){
                        return false;
                    }
                    char left=stack.remove(stack.size()-1);
                    if(!match(left,ch)){
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
