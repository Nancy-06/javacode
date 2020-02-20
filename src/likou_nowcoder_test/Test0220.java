package likou_nowcoder_test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyao
 * @create 2020/2/20
 */
public class Test0220 {
    //在数组中找到出现次数大于一半的数
    public int MoreThanHalfNum_Solution(int [] array) {
        int length=array.length;
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<length;i++){
            int count=map.getOrDefault(array[i],0);
            map.put(array[i],count+1);
        }
        for(Map.Entry<Integer,Integer> m:map.entrySet()){
            int key=m.getKey();
            int valve=m.getValue();
            if(valve>length/2){
                return key;
            }
        }
        return 0;
    }
}
