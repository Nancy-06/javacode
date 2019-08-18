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

    /**
     * 把element插入到index的位置
     * @param index  结点
     * @param element  插入的值
     * @return  true 返回正确  false返回错误
     */
    @Override
    public boolean add(int index, int element) {
        ensuereCapacity();
        if(index<0||index>size){
            System.out.println("错误");
        }

        else{
            //为index下标，腾出位置来
            System.arraycopy(array,index,array,index+1,size-index);
            //插入
            array[index]=element;
            //长度变更
            size++;
        }
        return true;
    }

    /**
     * 获取到当前结点的值
     * @param index   结点1
     * @return   结点的值
     */
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

    /**
     * 将结点为index的值改为val
     * @param index  结点
     * @param val  修改为val
     * @return   index结点之前的值
     */
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

    /**
     * 删除当前结点的值
     * @param index  结点
     * @return  要删除的结点的值
     */
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
    public String toString() {
        return Arrays.toString(Arrays.copyOf(array,size));
    }
}
