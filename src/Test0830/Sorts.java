package Test0830;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

public class Sorts {
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
            int pivotIndex=partition(array,left,right);
            //[left,pivotIndex-1]
            //[pivotIndex+1,right]
            stack.push(right);
            stack.push(pivotIndex+1);
            stack.push(pivotIndex-1);
            stack.push(left);
        }
    }
    private static int partition(int[] array, int left, int right) {
        int less=left;
        int great=right;
        int index=array[right];
        while(less<great){
            while(less<great&&array[less]<=index){
                less++;
            }
            while(less<great&&array[great]>=index){
                great--;
            }
            swap(array,less,great);
        }
        swap(array,less,right);
        return less;
    }
    public static void swap(int []array,int left,int right){
        int count=array[left];
        array[left]=array[right];
        array[right]=count;
    }
    //归并排序
    //左闭右开
    public static void mergeSort(int [] array){
        mergeSortInternal(array,0,array.length);
    }
    public static void mergeSortInternal(int[] array, int low, int high) {
        if(low+1>=high){
            return;
        }
        int mid=(high+low)/2;
        //[low,mid)
        //[mid,high)
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid,high);
        merge(array,low,mid,high);
    }

    //合并两个数组
    public static void merge(int [] array,int low,int mid,int high){
        int length=high-low;
        int [] extra=new int [length];
        int iLeft=low;
        int iRight=mid;
        int iExtra=0;
       while(iLeft<mid&&iRight<high){
           if(array[iLeft]<=array[iRight]){
               extra[iExtra++]=array[iLeft++];
           }
           if(array[iLeft]>array[iRight]){
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
    //非递归归并排序
    public static void mergeSortNoR(int [] array){
        for(int i=1;i<array.length;i=i*2){
            for(int j=0;j<array.length;j=j+2*i){
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
    public static int [] buildRandomArray(int n){
        int [] array=new int [n];
        Random random=new Random(20190830);
        for(int i=0;i<n;i++){
            array[i]=random.nextInt(n);
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array;
        array=buildRandomArray(10);
        System.out.println(Arrays.toString(array));
        //quickSortNoR(array);
        //mergeSort(array);
        mergeSortNoR(array);
        System.out.println(Arrays.toString(array));

    }
}
