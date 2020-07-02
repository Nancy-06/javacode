package code_practice.day_20;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author guoyao
 * @create 2020/7/2
 */
public class Test17 {

    //利用队列实现栈
    Queue<Integer> queue = new LinkedList<>();

    //添加元素
    public void push(int value){
        queue.add(value);
    }

    //要删除栈顶元素（删除队列的最后一个）
    public int pop(){
        int size = queue.size();
        for(int i =0; i < size-1; i++){
            int value = queue.poll();
            queue.add(value);
        }

        return queue.poll();
    }
    // 返回栈顶元素（队列的最后一个）
    public int peek(){
        int size = queue.size();
        for(int i = 0; i < size-1; i++){
            int value = queue.poll();
            queue.add(value);
        }
        int result = queue.poll();
        queue.add(result);
        return result;
    }

    //判断是否为空
    public boolean empty(){
        return queue.isEmpty();
    }
}
