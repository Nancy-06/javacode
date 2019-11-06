package likou_nowcoder_test;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

/**
 * @author guoyao
 * @create 2019/11/6
 */
public class Test22 {

    //https://leetcode-cn.com/problems/guess-numbers/
    //题目：猜数字
    public static  int game(int[] guess, int[] answer) {
        int count=0;
        for(int i=0;i<guess.length;i++){
            if(guess[i]==answer[i]){
                count++;
            }
        }
        return count;
    }


    //https://leetcode-cn.com/problems/jewels-and-stones/
    //题目：宝石与石头
    public static int numJewelsInStones(String J, String S) {
        int count=0;
        Set<Character> set=new HashSet<>();
        for(char ch:J.toCharArray()){
            set.add(ch);
        }
        for(char ch:S.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }

    //https://leetcode-cn.com/problems/defanging-an-ip-address/
    //IP地址无效化
    public static  String defangIPaddr(String address) {
        String a=address.replace(".","[.]");
        return a;
    }

    //https://leetcode-cn.com/problems/split-a-string-in-balanced-strings/
    //分割平衡字符串
    public int balancedStringSplit(String s) {
        int count=0;
        int n=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='R'){
                n++;
            }
            if(s.charAt(i)=='L'){
                n--;
            }
            if(n==0){
                count++;
            }
        }
        return count;
    }

    //https://leetcode-cn.com/problems/remove-outermost-parentheses/comments/
    //删除最外层的括号
    public String removeOuterParentheses(String S) {
        String result="";
        char [] array=S.toCharArray();
        Stack<Character> stack=new Stack<>();
        for(char c:array){
            if(c=='('){
                stack.push(c);
                if(stack.size()!=1){
                    result+="(";
                }
            }
            else{
                if(stack.size()!=1){
                    result+=")";
                }
                stack.pop();
            }
        }
        return result;
    }


    public static void main(String[] args) {
        int [] guess={1,2,3};
        int [] answer={1,2,3};
        System.out.println(game(guess,answer));
        String address="1.1.1.1.1";
        System.out.println(defangIPaddr(address));
    }
}
