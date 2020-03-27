package code_practice.day_09;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/24
 */
//n个数里出现次数大于等于n/2的数
public class Test5 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            String [] strArr=str.split(" ");
            int [] array=new int[strArr.length];
            for(int i=0;i<array.length;i++){
                array[i]=Integer.valueOf(strArr[i]);
            }
            Arrays.sort(array);
            int index=array[array.length/2-1];
            int count=0;
            for(int i=0;i<array.length;i++){
                if(array[i]==index){
                    count++;
                }
            }
            if(count>=array.length/2){
                System.out.println(index);
            }
        }
    }
}
