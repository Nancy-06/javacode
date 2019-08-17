package List;

import java.util.Arrays;

public class MyArrayList implements List {
    int size=0;
    int [] array=null;
    public  void ensuereCapacity(){
        //1.如果容量够用，直接返回1
        if(array!=null &&size<array.length){
            return;
        }
        //2.计算新的容量
        int capacity;
        if(array==null){
            capacity=10;
        }
        else{
            capacity=2*array.length;
        }
        //3.申请新空间
        if(array!=null){
            array=Arrays.copyOf(array,capacity);
        }
        else{
            array=new int [capacity];
        }
    }

    @Override
    public boolean add(int element) {
        return add(size,element);
    }

    @Override
    public boolean add(int index, int element) {
        ensuereCapacity();
        if(index<0||index>size){
            System.out.println("错误");
        }

        else{
            System.arraycopy(array,index,array,index+1,size-index);
            array[index]=element;
            size++;
        }
        return true;
    }

    @Override
    public int get(int index) {
        if(index<0||index>=size){
            //System.out.println("错误");
            return -1;
        }
        else{
            return array[index];
        }
    }

    @Override
    public int set(int index, int val) {
        if(index<0||index>=size){
            System.out.println("错误");
            return 0;
        }
        else{
            int dex=array[index];
            array[index]=val;
            return dex;
        }
    }

    @Override
    public int remove(int index) {
        if(index<0||index>=size) {
            System.out.println("错误");
            return 0;
        }
        else{
            int oldValue=array[index];
            System.arraycopy(array,index+1,array,index,size-index-1);
            size--;
            return oldValue;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }


    @Override
    public Iterator iterator() {
        return new ArrayIterator(0);
    }
    public class ArrayIterator implements Iterator{

        int cur;
        public ArrayIterator(int cur){
            this.cur=cur;
        }
        @Override
        public boolean hasNext() {
            return cur<size();
        }

        @Override
        public int next() {
            return array[cur++];
        }

    }

}
