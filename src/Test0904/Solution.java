package Test0904;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    //统计数组中只出现一次的数字
   public static int count(int [] numbers) {
       Map<Integer, Integer> map = new HashMap<>();
       for (int n : numbers) {
           //判断下n在不在map中
           //不在，出现次数是1
           //在，出现次数+1·
           int c = map.getOrDefault(n, 0);
           map.put(n, c + 1);
       }
       for(Map.Entry<Integer,Integer> e:map.entrySet()){
           int val=e.getKey();
           int count=e.getValue();
           if(count==1){
               return val;
           }
       }
       return -1;
   }
    public static void main(String[] args) {
        int [] numbers={2,1,3,4,2,1,4,5,6,7,8,7,9,6,5};
        System.out.println(count(numbers));
    }
}
