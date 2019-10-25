package likou_nowcoder_test;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test13 {
    //题目：用两个栈实现队列
//https:www.nowcoder.com/practice/54275ddae22f475981afa2244dd448c6?tpId=13&tqId=11158&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking

    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if(stack2.empty()){
            while(!stack1.empty()){
                int value=stack1.pop();
                stack2.push(value);
            }
        }
       return stack2.pop();
    }
    //题目：替换空格
    //题目链接：https://www.nowcoder.com/practice/4060ac7e3e404ad1a894ef3e17650423?tpId=13&tqId=11155&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    public static String replaceSpace(StringBuffer str) {
      StringBuffer sb=new StringBuffer();
      for(int i=0;i<str.length();i++){
          char ch=str.charAt(i);
          if(ch==' '){
              sb.append("%20");
          }
          else{
              sb.append(ch);
          }
      }
      return sb.toString();
    }
    public static String replaceSpace1(StringBuffer str){
        String str1=str.toString();
        return str1.replace(" ","%20");
    }

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer();
        sb.append("we are happy");
        System.out.println(replaceSpace(sb));

    }
}
