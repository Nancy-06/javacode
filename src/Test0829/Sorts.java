package Test0829;

import java.util.Arrays;
import java.util.Random;

public class Sorts {
    //进阶的选择排序
    public static void selectSort(int [] array){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int min=left;
            int max=left;
            for(int i=left+1;i<=right;i++){
                if(array[i]>array[max]){
                    max=i;
                }
                if(array[i]<array[min]){
                    min=i;
                }
            }
            swap(array,min,left);
            if(max==left){
                max=min;
            }
            swap(array,max,right);
            left++;
            right--;
        }
    }
    //冒泡排序
    public static void bubbleSort(int [] array){
        for(int i=0;i<array.length-1;i++){
            boolean treated=true;
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    swap(array,j,j+1);
                    treated=false;
                }
            }
            if(treated==true){
                break;
            }
        }
    }
    public  static void swap(int[] array, int j, int i) {
        int count=array[i];
        array[i]=array[j];
        array[j]=count;
    }

    //快速排序
    public static void quickSort(int [] array){
        quickSortInternal(array,0,array.length-1);
    }
    public static void quickSortInternal(int [] array,int left,int right){
        if(left>=right){
            return;
        }
        //1.确定基准值：array[right]作为基准值
        //2.遍历，小的在左，大的在右
        //int pivotIndex1=partioion1(array,left,right);
        //int pivotIndex2=partioion2(array,left,right);
        //int pivotIndex3=partition3(array,left,right);
        int [] indices=partition4(array,left,right);
        //分出两个小区间
        //[left,pivotlndex-1]
        //[pivotlndex+1,right]
        //quickSortInternal(array,left,pivotIndex1-1);
        //quickSortInternal(array,pivotIndex1+1,right);
        //quickSortInternal(array,left,pivotIndex2-1);
        //quickSortInternal(array,pivotIndex2+1,right);
        //quickSortInternal(array,left,pivotIndex3-1);
        //quickSortInternal(array,pivotIndex3+1,right);
        quickSortInternal(array,left,indices[0]-1);
        quickSortInternal(array,indices[1]+1,right);
    }
    public static int partioion1(int [] array,int left,int right){
        int pirot=array[right];
        int great=right;
        int less=left;
        while(less<great){
            while(less<great&&array[less]<=pirot){
                less++;
            }
            while(less<great&&array[great]>=pirot){
                great--;
            }
            swap(array,less,great);
        }
        swap(array,less,right);
        return less;
    }
    public static int partioion2(int []array,int left,int right){
        int pirot=array[right];
        int great=right;
        int less=left;
        while (less < great) {
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
    public static int  partition3(int [] array,int left,int right){
        int less=left;
        int pirot=array[right];
        for(int i=left;i<right;i++){
            if(array[i]<pirot){
                swap(array,i,less);
                less++;
            }
        }
        swap(array,less,right);
        return less;
    }
    public static int [] partition4(int [] array,int left,int right){
        int pirot=array[right];
        int great=right;
        int i=left;
        int less=left;
        while(i<great){
            if(array[i]==pirot){
                i++;
            }
            if(array[i]<pirot){
                swap(array,i,less);
                i++;
                less++;
            }
            else{
                while(i<great&&array[great]>pirot){
                    great--;
                }
                swap(array,i,great);
            }
        }
        return new int [] {less,great-1};
    }

    public static int [] buildRandomArray(int n){
        int [] array=new int [n];
        Random random=new Random(20190829);
        for(int i=0;i<n;i++){
            array[i]=random.nextInt(n);
        }
        return array;
    }
    public static void main(String[] args) {
        int [] array;
        array=buildRandomArray(10);
        System.out.println(Arrays.toString(array));
        //selectSort(array);
        bubbleSort(array);
        //quickSort(array);
        System.out.println(Arrays.toString(array));
    }
}
