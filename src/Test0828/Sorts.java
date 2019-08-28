package Test0828;

import java.util.Arrays;
import java.util.Random;

public class Sorts {
    //插入排序
    public static void insertSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            int key=array[i+1];
            int j;
            for(j=i;j>=0&&key<array[j];j--){
                array[j+1]=array[j];
            }
            array[j+1]=key;
        }
    }

    public static void insertSortWithGap(int [] array,int gap){
        for(int i=0;i<array.length-gap;i++){
            int key=array[i+gap];
            int j;
            for(j=i;j>=0&&key<array[j];j-=gap){
                array[j+gap]=array[j];
            }
            array[j+gap]=key;
        }
    }
    //希尔排序
    public static void shellSort(int [] array){
       int gap=array.length;
       while(true){
           gap=gap/3+1;
           insertSortWithGap(array,gap);
           if(gap==1){
               return;
           }
       }
    }
    //选择排序
    public static void selectSort(int [] array){
        //每次选最大的数
        for(int i=0;i<array.length-1;i++){
            //无序区间：[0,array.length-i)
            //有序区间：[array.length-i,array.length)
            int max=0;
            for(int j=0;j<array.length-i;j++){
                if(array[j]>=array[max]){
                    max=j;
                }
            }
            //交换最大的数和无序区间的最后一个数
            swap(array,max,array.length-i-1);
        }
    }

    //堆排序,建大堆
    public static void heapSort(int [] array){
        createHeap(array,array.length);
        for(int i=0;i<array.length-1;i++){
            //无序区间：[0,array.length-i)
            swap(array,0,array.length-i-1);
            //无序区间：[0,array.length-i-1)
            //无序区间的长度： array.length-i-1
            heapifyMax(array,array.length-i-1,0);
        }
    }

    //向下调整大堆
    public  static void heapifyMax(int[] array, int size, int index) {
        while(true){
            int left=index*2+1;
            if(left>=size){
                return;
            }
            int max=left;
            if(left+1<size&&array[left+1]>=array[left]){
                max=left+1;
            }
            if(array[max]<=array[index]){
                return;
            }
            swap(array,index,max);
            index=max;
        }
    }
    //创建一个大堆
    public static void createHeap(int[] array, int size) {
        int parent=(size-1)/2;
        for(int i=parent;i>=0;i--){
            heapifyMax(array,array.length,i);
        }
    }
    //交换值
    public static void swap(int [] array,int x,int y){
        int count=array[x];
        array[x]=array[y];
        array[y]=count;
    }

    //构建一个有序数组
    private static int [] buildSortedArray(int n){
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=i;
        }
        return array;
    }
    //构建一个无序数组（逆序）
    private static int [] buildReversedSortedArray(int n){
        int [] array=new int[n];
        for(int i=0;i<n ;i++){
            array[i]=n-i;
        }
        return array;
    }
    //构建一个完全随机的数组
    private static int [] buildRandomArray(int n){
        Random random=new Random(20190828);
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=random.nextInt(n);
        }
        return array;
    }
    //构建一个完全相等的数组
    private static int [] buildEqualsArray(int n){
        int [] array=new int [n];
        for(int i=0;i<n;i++){
            array[i]=n;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] array;
        //array=buildSortedArray(10);
        //array=buildReversedSortedArray(10);
        array=buildRandomArray(10);
        //array=buildEqualsArray(10);
        System.out.println(Arrays.toString(array));
        long begin=System.nanoTime();  //纳秒
        //insertSort(array);
        //shellSort(array);
        //selectSort(array);
        heapSort(array);
        long end=System.nanoTime();   //纳秒
        //打印运行时间
        System.out.println(end-begin);
        System.out.println(Arrays.toString(array));
    }
}
