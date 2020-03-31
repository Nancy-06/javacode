package code_practice.day_09;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/3/22
 */
public class Test1 {

    //插入排序
    public static void insertSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            int key=array[i+1];
            int j;
            for(j=i;j>=0&&array[j]>key;j--){
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }
    }

    //希尔排序
    public static void shellSort(int [] array){
        int gap=array.length;
        while(true){
            gap=gap/3+1;
            shellSortWithGrep(array,gap);
            if(gap==1){
                return;
            }
        }
    }

    private static void shellSortWithGrep(int[] array, int gap) {
        for(int i=0;i<array.length-gap;i++){
            int key=array[i+gap];
            int j;
            for(j=i;j>=0&&array[j]>key;j-=gap){
                array[j+gap]=array[j];
            }
            array[j+gap]=key;
        }
    }

    //选择排序
    public static void selectSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            int max=0;
            for(int j=0;i<array.length-i;j++){
                if(array[j]>=array[max]){
                    max=j;
                }
            }
            swap(array,max,array.length-i-1);
        }
    }
    private static void swap(int[] array, int max, int i) {
        int a=array[max];
        array[max]=array[i];
        array[i]=a;
    }

    //冒泡排序
    public static void bubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            boolean judge=true;
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    judge=false;
                }
            }
            if(judge==true){
                break;
            }
        }
    }

    //快速排序
    //全闭区间
    public static void quickSort(int [] array){
         quickSortWithPartition(array,0,array.length-1);
    }

    private static void quickSortWithPartition(int[] array, int left, int right) {

        if(left>=right){
            return;
        }
        int pivotIndex=partition(array,left,right);
        //[left,pivotIndex-1]
        //[pivotIndex+1,right]
        quickSortWithPartition(array,left,pivotIndex-1);
        quickSortWithPartition(array,pivotIndex+1,right);
    }

    private static int partition(int[] array, int left, int right) {

        int pirot=array[right];
        int great=right;
        int less=left;
        while(left<great){
            while(less<great&&array[less]<=pirot){
                less++;
            }
            array[great]=array[less];

            while(less<great&&array[great]>=pirot){
                great--;
            }
            array[less]=array[great];
        }
        array[less]=pirot;
        return less;
    }

    //归并排序
    //区间为半闭半开[0,arrar.length)
    public static void mergeSort(int [] array){
        mergeSortInternal(array,0,array.length);
    }

    private static void mergeSortInternal(int[] array, int low, int high) {
        int mid=(high+low)/2;
        //[low,mid)
        //[mid,high)
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid,high);
        //进行合并
        merge(array,low,mid,high);

    }

    private static void merge(int[] array, int low, int mid, int high) {
        int iLeft=low;
        int iRight=mid;
        int length=high-low;
        int [] extra=new int[length];
        int iExtra=0;
        while(iLeft<mid&&iRight<high){
            if(array[iLeft]<=array[iRight]){
                extra[iExtra++]=array[iLeft++];
            }
            else{
                extra[iExtra++]=array[iRight++];
            }
        }
        while(iLeft<mid){
          extra[iExtra++]=array[iLeft++];
        }

        while(iRight<high){
            extra[iExtra++]=array[iRight++];
        }
        for(int i=0;i<length;i++){
            array[low+i]=extra[i];
        }
    }

    //堆排序,建大堆

    public static void heapSort(int [] array){
        createHeap(array,array.length);
        for(int i=0;i<array.length-1;i++){
            swap(array,0,array.length-i-1);
            heapifyMax(array,array.length-i-1,0);
        }
    }

    //建大堆

    public static void createHeap(int [] array,int size){
        int parent=(size-2)/2;
        for(int i=parent;i>=0;i--){
            heapifyMax(array,array.length,i);
        }
    }
    //向下调整大堆

    public static void heapifyMax(int [] array,int size,int index){
        while(true){
            int left=index*2+1;
            if(left>=size){
                return;
            }
            int max=left;
            if(left+1<size&&array[left+1]>array[left]){
                max=left+1;
            }
            if(array[max]<=array[index]){
                return ;
            }
            swap(array,index,max);
            index=max;
        }
    }

    public static void main(String[] args) {
        int [] array={4,6,2,1,7,8,3,5};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
