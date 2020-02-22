package likou_nowcoder_test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author guoyao
 * @create 2020/2/22
 */
public class Test0222 {
    //力扣1304:和为0的n个唯一整数
    public int[] sumZero(int n) {
        int [] array=new int[n];
        int index=0;
        for(int i=1;i<=n/2;i++){
            array[index++]=-i;
            array[index++]=i;
        }
        return array;
    }

    //判断字符是否唯一，法1
    public boolean isUnique(String astr) {
        char [] array=astr.toCharArray();
        Map<Character,Integer> map=new HashMap<>();
        for(char c:array){
            int count=map.getOrDefault(c,0);
            map.put(c,count+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            int value=e.getValue();
            if(value>1){
                return false;
            }
        }
        return true;
    }
    //判断字符是否唯一,法2
    public boolean isUnique1(String astr){
        int [] array=new int[26];
        for(int i=0;i<astr.length();i++){
            array[astr.charAt(i)-'a']++;
            if(array[astr.charAt(i)-'a']>1){
                return false;
            }
        }
        return true;
    }

}
