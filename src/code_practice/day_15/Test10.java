package code_practice.day_15;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/5/2
 */


public class Test10 {

    //最小的K个数
    public int[] getLeastNumbers(int[] arr, int k) {
        int [] array=new int[k];
        Arrays.sort(arr);
        for(int i=0;i<k;i++){
            array[i]=arr[i];
        }
        return array;
    }

    //第一个只出现一次的字符
    // 法1：LinkedHashMap按添加顺序存储键值集的特性进行检测
    public char firstUniqChar(String s) {
        // LinkedHashMap按添加顺序存储键值集的特性进行检测
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        for(int i=0;i<s.length();i++){
            int value=map.getOrDefault(s.charAt(i),0);
            map.put(s.charAt(i),value+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            if(e.getValue()==1){
                return e.getKey();
            }
        }
        return ' ';
    }

    //法2：考虑字符编码ASCII的情况，效率高
    public char firstUniqChar2(String s){
        char [] chars=new char[26];
        char [] chars1=s.toCharArray();
        //字符字典
        for(char c:chars1){
            chars[c-'a']++;
        }
        for(char c:chars1){
            if(chars[c-'a']==1){
                return c;
            }
        }
        return ' ';

    }

}
