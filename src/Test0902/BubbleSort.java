package Test0902;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class BubbleSort {
    public static void bubbleSort(Person [] array, Comparator<Person> comparator ){
        for(int i=0;i<array.length-1;i++){
            Boolean count=true;
            for(int j=0;j<array.length-i-1;j++){
                //int r=array[j].compareTo(array[j+1]);
                int r=comparator.compare(array[j],array[j+1]);
                if(r>0){
                    swap(array,j,j+1);
                    count=false;
                }
            }
            if(count==true){
                break;
            }
        }
    }
    private static void swap(Person[] array, int i, int j) {
        Person val=array[i];
        array[i]=array[j];
        array[j]=val;
    }

    public static void main(String[] args) {
        Random random=new Random(20170903);
        Person [] array=new Person[10];
        for(int i=0;i<array.length;i++){
            array[i]=new Person();
            array[i].age=random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));
        bubbleSort(array,new PersonRankComparator());
        System.out.println(Arrays.toString(array));
    }
}
