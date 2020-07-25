package code_practice.day_22;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/7/24
 */
public class Test3 {
    //两句话中的不常见单词
    public String[] uncommonFromSentences(String A, String B) {

        Map<String , Integer> map = new HashMap<>();
        for(String s : A.split(" ")){
            map.put(s, map.getOrDefault(s,0) + 1);
        }
        for(String s : B.split(" ")){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        List<String> list = new LinkedList<>();
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                list.add(entry.getKey());
            }
        }
        return list.toArray(new String [list.size()]);
    }
}
