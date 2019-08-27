package Test0827;

import java.util.Arrays;
import java.util.Random;

//在海量数据中，找到最大的K个数
public class TopKDemo {
    //找他的最大的K个数
    public static int [] findTopK(int [] array,int k){
        int [] heap=new int [k];
        for(int i=0;i<k;i++){
            heap[i]=array[i];
        }
        Heaps.createHeapMin(heap,heap.length);
        for(int i=k;i<array.length;i++){
            if(array[i]>heap[0]){
                heap[0]=array[i];
                Heaps.heapifyMin(heap,k,0);
            }
        }
        return heap;
    }
    public static void main(String [] args){
        int [] wulin=new int [100];
        Random random=new Random(20190827);
        for(int i=0;i<wulin.length;i++){
            wulin[i]=random.nextInt(1000);
        }
        //找最大的前五个数
        int [] topK=findTopK(wulin,5);
        System.out.println(Arrays.toString(topK));
        System.out.println("===========================");
        Arrays.sort(wulin);
        System.out.println(Arrays.toString(Arrays.copyOfRange(wulin,wulin.length-10,wulin.length)));
    }
}
