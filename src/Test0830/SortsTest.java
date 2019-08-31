package Test0830;

import org.omg.CORBA.IRObject;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class SortsTest {
    //快速排序非递归
    public static void quickSortNoR(int [] array){
        Stack<Integer> stack=new Stack<>();
        stack.push(array.length-1);
        stack.push(0);
        while(!stack.isEmpty()){
            int left=stack.pop();
            int right=stack.pop();
            if(left>=right){
                continue;
            }
            int index=partition2(array,left,right);
            stack.push(right);
            stack.push(index+1);
            stack.push(index-1);
            stack.push(left);
        }
    }

    private static int partition2(int[] array, int left, int right) {
        int index=array[right];
        int less=left;
        int great=right;
        while(less<great){
            while(less<great&&array[less]<=index){
                less++;
            }
            array[great]=array[less];
            while(less<great&&array[great]>=index){
                great--;
            }
            array[less]=array[great];
        }
        array[less]=index;
        return less;
    }

    //归并排序,半开半闭区间
    public static void mergeSort(int [] array){
        mergeSortIndex(array,0,array.length);
    }

    private static void mergeSortIndex(int[] array, int left, int right) {
        if(left+1>=right){
            return;
        }
        int mid=(right+left)/2;
        mergeSortIndex(array,left,mid);
        mergeSortIndex(array,mid,right);
        merge(array,left,mid,right);
    }

    private static void merge(int[] array, int left, int mid, int right) {
        int length=right-left;
        int [] extra=new int [length];
        int iLeft=left;
        int iRight=mid;
        int index=0;
        while(iLeft<mid&&iRight<right){
            if(array[iLeft]<=array[iRight]){
                extra[index++]=array[iLeft++];
            }
            if(array[iLeft]>array[iRight]){
                extra[index++]=array[iRight++];
            }
        }
        while(iLeft<mid){
            extra[index++]=array[iLeft++];
        }
        while(iRight<right){
            extra[index++]=array[iRight++];
        }
        for(int i=0;i<length;i++){
            array[left+i]=extra[i];
        }
    }

    //非递归归并排序
    public static void mergeSortNoR(int [] array){
        for(int i=1;i<array.length;i=i*2){
            for(int j=0;j<array.length;j=j+i*2){
                int low=j;
                int mid=j+i;
                int high=mid+i;
                if(mid>=array.length){
                    continue;
                }
                if(high>array.length){
                    high=array.length;
                }
                merge(array,low,mid,high);
            }
        }
    }


    public static int [] createRandomArray(int n){
        Random random=new Random(20190830);
        int [] array=new int [n];
        for(int i=0;i<n;i++){
            array[i]=random.nextInt(n);
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array;
        array=createRandomArray(10);
        System.out.println( Arrays.toString(array));
        //quickSortNoR(array);
        //mergeSort(array);
        mergeSortNoR(array);
        System.out.println( Arrays.toString(array));

    }
}
