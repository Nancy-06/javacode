package code_practice.day_15;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/26
 */

//单调栈结构
public class Test6 {

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int n =sc.nextInt();
//        int [] array=new int[n];
//        for(int i=0;i<n;i++){
//            array[i]=sc.nextInt();
//        }
//        for(int i=0;i<n;i++){
//            int left=i-1;
//            int right=i+1;
//            int jLeft=-1,jRight=-1;
//            while(left!=-1){
//                if(array[left]<array[i]){
//                    jLeft=left;
//                    break;
//                }
//                left--;
//            }
//           while(right!=n){
//                if(array[right]<array[i]){
//                    jRight=right;
//                    break;
//                }
//                right++;
//           }
//            System.out.println(jLeft+" "+jRight);
//        }
//    }

    private static class Stack{
        private int [] array;
        private int size=0;
        Stack(int capacity){
            array=new int[capacity];
        }
        private boolean isEmpty(){
            return size==0;
        }
        private int peek(){
            return array[size-1];
        }
        private void push(int element){
            array[size++]=element;
        }
        private void pop(){
            size--;
        }
        private void clear(){
            size=0;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=sc.nextInt();
        if(count==1){
            System.out.printf("-1 -1%n");
            return;
        }
        int [] array=new int[count];
        int [] left=new int[count];
        Stack stack=new Stack(count);
        for(int i=0;i<count;i++){
            array[i]=sc.nextInt();
            while(!stack.isEmpty()&&array[stack.peek()]>=array[i]){
                stack.pop();
            }
            left[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        int [] right=new int[count];
        stack.clear();
        for(int i=count-1;i>=0;i--){
            while(!stack.isEmpty()&&array[stack.peek()]>=array[i]){
                stack.pop();
            }
            right[i]=stack.isEmpty()?-1:stack.peek();
            stack.push(i);
        }
        for(int i=0;i<count;i++){
            System.out.printf("%d %d%n",left[i],right[i]);
        }
    }
}
