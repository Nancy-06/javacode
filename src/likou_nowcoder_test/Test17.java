package likou_nowcoder_test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

/**
 * @author guoyao
 * @create 2019/11/1
 */
public class Test17 {
    //https://www.nowcoder.com/practice/c6c7742f5ba7442aada113136ddea0c3?tpId=13&tqId=11160&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    //斐波那契数列

    public int Fibonacci(int n) {
        if(n<=1){
            return n;
        }
        return Fibonacci(n-2)+Fibonacci(n-1);
    }

    //https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=13&tqId=11161&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    //跳台阶
    public int JumpFloor(int target) {
        if(target==1||target==2){
            return target;
        }
        return JumpFloor(target-1)+JumpFloor(target-2);
    }

    //https://www.nowcoder.com/practice/1a834e5e3e1a4b7ba251417554e07c00?tpId=13&tqId=11165&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    //数值的整数次方
    public double Power(double base, int exponent) {
        double sum=0,temp=1;
        if(exponent==0){
            return 1;
        }

        if(exponent==1){
            return base;
        }
        if(exponent>1){
            for(int i=1;i<=exponent;i++){
                sum=temp*base;
                temp=sum;
            }
        }
        else{
            for(int i=-1;i>=exponent;i--){
                sum=temp*base;
                temp=sum;
            }
            sum=1/sum;
        }
        return sum;
    }

    //https://www.nowcoder.com/practice/beb5aa231adc45b2a5dcc5b62c93f593?tpId=13&tqId=11166&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    //调整数组顺序使奇数位于偶数前面

    public static void reOrderArray(int [] array) {

        int [] jiArray=new int[array.length];
        int [] ouArray=new int[array.length];
        int jiCount=0;
        int ouCount=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1){
                jiArray[jiCount]=array[i];
                jiCount++;
            }
            else{
                ouArray[ouCount]=array[i];
                ouCount++;
            }
        }
        for(int i=0;i<jiCount;i++){
            array[i]=jiArray[i];
        }
        for(int i=0;i<ouCount;i++){
            array[jiCount+i]=ouArray[i];
        }
    }


    //https://www.nowcoder.com/practice/4c776177d2c04c2494f2555c9fcc1e49?tpId=13&tqId=11173&tPage=1&rp=1&ru=/ta/coding-interviews&qru=/ta/coding-interviews/question-ranking
    //包含min函数的栈
    Stack<Integer> stack=new Stack<>();
    public void push(int node) {
       stack.push(node);
    }

    public void pop() {
        stack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
       int min=stack.peek();
       int temp=0;
       Iterator<Integer> iterator=stack.iterator();
       while(iterator.hasNext()){
           temp=iterator.next();
           if(min>temp){
               min=temp;
           }
       }
       return min;
    }

    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6,7,8,9};
        reOrderArray(array);
        System.out.println(Arrays.toString(array));
    }
}
