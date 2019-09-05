package Test0904;

import java.util.*;
//找出数组中出现次数为n次的元素集合
public class Solution1 {
    static Map<Integer,Integer> count(int [] numbers){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:numbers){
            int c=map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        return map;
    }

    public static void main(String[] args) {
        int [] numbers={2,4,5,6,7,8,6,5,4,3,5,7,6,5,9,10};
        Map<Integer,Integer> map=count(numbers);
        System.out.print(map);
        System.out.println();
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int number=entry.getKey();
            int count=entry.getValue();
            if (count==2){
                System.out.println(number);
            }
        }
    }
}
