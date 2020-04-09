package code_practice.day_13;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyao
 * @create 2020/4/2
 */
//找出一个数组中出现次数最多的数字
public class Test2 {
    public static int search(int [] array){
        int length=array.length;
        int [] a=new int[length];
        for(int i=0;i<length;i++){
            a[array[i]]++;
        }
        int max=0;
        int value=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
                value=i;
            }
        }
        return value;
    }

    public static int search1(int [] array){
        Arrays.sort(array);
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            int value=map.getOrDefault(array[i],0);
            map.put(array[i],value+1);
        }
        int max=0;
        int value=0;
        for(Map.Entry<Integer,Integer> e:map.entrySet()){
            if(max<e.getValue()){
                max=e.getValue();
                value=e.getKey();
            }
        }
        return value;
    }
    public static void main(String[] args) {
        int [] a={2,2,2,2,4,1,5,6,4,5,7};
        System.out.println(search1(a));
    }
}
