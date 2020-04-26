package code_practice.day_15;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/26
 */
//数组中值出现了一次的数字
public class Test5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] array=new int[n];
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        result(array);
    }

    public static void result(int [] array){
        Map<Integer,Integer> map=new HashMap<>();
        Arrays.sort(array);
        for(int i=0;i<array.length;i++){
            int value=map.getOrDefault(array[i],0);
            map.put(array[i],value+1);
        }
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            int key=e.getKey();
            int value=e.getValue();
            if(value%2==1){
                System.out.print(key+" ");
            }
        }
    }
}
