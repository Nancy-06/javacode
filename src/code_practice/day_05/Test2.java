package code_practice.day_05;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/3/9
 */
public class Test2 {
    //合法括号序列判断
    public static boolean judge(String str,int n){
        Stack<Character> stack=new Stack<>();
        if(str==null||str.length()!=n){
            return false;
        }
        for(int i=0;i<n;i++){
            if(str.charAt(i)=='('){
                stack.push(str.charAt(i));
            }
            else if(str.charAt(i)==')'){
                if(stack.empty()){
                    return false;
                }
                else{
                    stack.pop();
                }
            }
            else{
                return false;
            }
        }
        if(!stack.empty()){
            return false;
        }
        else{
            return true;
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.nextLine();
        System.out.println(judge(str,str.length()));
    }
}
