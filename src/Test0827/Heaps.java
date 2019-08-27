package Test0827;

import java.util.Arrays;

public class Heaps {
    /**
     * 前提：除了index和它的孩子外，其他位置已经满足堆的性质了,调整堆，调整为大堆,向下调整
     * @param array 被看作堆的数组
     * @param size  数组中被看作堆的值的个数
     * @param index 要调整位置的下标
     */
    public static void heapify(int [] array,int size,int index){
        while(true){
            int left=2*index+1;
            if(left>=size){
                return;
            }
            int max=left;
            if(left+1<size&&array[left+1]>array[left]){
                max=left+1;
            }
            if(array[index]>=array[max]){
                return;
            }
            swap(array,index,max);
            index=max;
        }
    }
    //调整为小堆,向下调整
    public static void heapifyMin(int [] array,int size,int index){
        while(true){
            int left=2*index+1;
            if(left>=size){
                return;
            }
            int min=left;
            if(left+1<size&&array[left+1]<array[left]){
                min=left+1;
            }
            if(array[index]<=array[min]){
                return;
            }
            swap(array,index,min);
            index=min;

        }
    }

    public static void swap(int [] array,int i,int j){
        int count=array[i];
        array[i]=array[j];
        array[j]=count;
    }
    //建堆，构建为大堆
    //复杂度为O(n),粗略为0(n*log(n))
    public static void createHeap(int [] array,int size){
       for(int i=(size-2)/2; i>=0; i--){
           heapify(array,size,i);
        }
    }


    //建堆，构建为小堆
    public static void createHeapMin(int [] array,int size){
        for(int i=(size-2)/2;i>=0;i--){
            heapifyMin(array,size,i);
        }
    }

    //向上调整大堆,除了index和它的孩子外，其余位置已经满足堆的性质了
    public static void adjustUp(int [] array,int index) {
        while (true) {
            if(index<=0){
                return;
            }
            int parent = (index - 1) / 2;
            int max = parent;
            if (array[max] >= array[index]) {
                return;
            }
            swap(array, index, max);
            index = max;
        }
    }
    //向上调整小堆，前提：除了index和它的孩子外，其余位置已经满足堆的性质了
    public static void adjustUpMin(int [] array,int index){
        while(index >0){
            int parent=(index-1)/2;
            int min=parent;
            if(array[min]<=array[index]){
                return;
            }
            swap(array,index,min);
            index=min;
        }
    }
    public static void main(String[] args) {
        int [] array={-1,8,4,6,7,2,3,1,0};
        heapify(array,array.length,0);
        System.out.println(Arrays.toString(array));
        int [] array1={3,5,2,4,9,0,1,9,8,4,7,2,3,8,6,3};
        createHeap(array1,array1.length);
        System.out.println(Arrays.toString(array1));
        int [] array2={8,7,4,6,-1,2,3,10};
        adjustUp(array2,array2.length-1);
        System.out.println(Arrays.toString(array2));
    }
}
