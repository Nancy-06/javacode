package Test0827;

public class MyPriorityQueue {
    //先不考虑array存不下的问题
    private int [] array=new int [100];
    private int size=0;
    //时间复杂度：O(log(n))
    public void add(int element){
        array[size++]=element;
        Heaps.adjustUp(array,size-1);
    }
    //时间复杂度：O(log(n))
    public int poll(){
        int element=array[0];
        array[0]=array[--size];
        Heaps.heapify(array,size,0);
        return element;
    }
    //时间复杂度：O(1)
    public int peek(){
        return array[0];
    }

    public static void main(String[] args) {
        MyPriorityQueue queue=new MyPriorityQueue();
        //-1,8,4,6,7,2,3,1,0
        queue.add(-1);
        queue.add(8);
        queue.add(4);
        queue.add(6);
        queue.add(7);
        queue.add(2);
        queue.add(3);
        queue.add(1);
        queue.add(0);
        System.out.println(queue.poll());
        System.out.println(queue.peek());
    }
}