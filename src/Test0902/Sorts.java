package Test0902;


import java.util.Arrays;
import java.util.Random;

public class Sorts {
    public static void mergeSort(Person [] array){
        mergeSortImplace(array,0,array.length);
    }

    private static void mergeSortImplace(Person[] array, int left, int right) {
        if(left+1>=right){
            return;
        }
        int mid=(left+right)/2;
        mergeSortImplace(array,left,mid);
        mergeSortImplace(array,mid,right);
        merge(array,left,mid,right);
    }
    private static void merge(Person [] array,int left,int mid,int right){
        int length=right-left;
        int inLeft=left;
        int inRight=mid;
        Person [] newArray=new Person [length];
        int cur=0;
        while(inLeft<mid&&inRight<right){
            int c=array[inLeft].compareTo(array[inRight]);
            if(c<=0){
                newArray[cur++]=array[inLeft++];
            }
            else{
                newArray[cur++]=array[inRight++];
            }
        }
        while(inLeft<mid){
            newArray[cur++]=array[inLeft++];
        }
        while(inRight<right){
            newArray[cur++]=array[inRight++];
        }
        for(int i=0;i<length;i++){
            array[left+i]=newArray[i];
        }
    }

    public static void main(String[] args) {
        Random random=new Random(20190902);
        Person [] array=new Person[10];
        for(int i=0;i<array.length;i++){
            array[i]=new Person();
            array[i].age=random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));
        mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}
