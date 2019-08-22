package Test0821;


import java.util.Arrays;
//栈的方法
public class MyStack {
    private int [] array=new int [10];
    private int size=0;
    private void ensureCapacity(){
        if(size<array.length){
            return;
        }
        array= Arrays.copyOf(array,2*array.length);
    }
    //将元素推到栈顶
    public int push(int element){
        ensureCapacity();
        array[size++]=element;
        return element;

    }
    //删除栈顶元素，并把该元素返回
    public int pop(){
        return array[--size];
    }
    //查看栈顶元素，但不删除它
    public int peek(){
        return array[size-1];
    }
    //测试栈中是否为空
    public boolean empty(){
        return size==0;
    }
    //返回栈的大小
    public int size(){
        return size;
    }
    //返回一个对象在此栈上基于1的位置
    public int search(int element){
        for(int i=0;i<size;i++){
            if(array[i]==element){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        MyStack stack=new MyStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack.size());
        System.out.println(stack.empty());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        //System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.empty());
    }
}
