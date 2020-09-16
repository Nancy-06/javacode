package code_practice.day_25;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author guoyao
 * @create 2020/9/16
 */
public class Test16 {

    //字符串中第一次只出现一个的字符
    public static void  result(String str){

        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            int index = map.getOrDefault(str.charAt(i) , 0);
            map.put(str.charAt(i) , index + 1);
        }
        boolean judge = true;
       for(Map.Entry<Character , Integer> e : map.entrySet()){
            if(e.getValue() == 1){
                System.out.println(e.getKey());
                judge = false;
                break;
            }
       }
      if(judge){
          System.out.println(-1);
      }
    }

    //字符串中第n次出现m个的字符
    public static void result2(String str , int n ,int m){
        LinkedHashMap<Character , Integer> map = new LinkedHashMap<>();
        for(int i = 0; i < str.length(); i++){
            int index = map.getOrDefault(str.charAt(i) , 0);
            map.put(str.charAt(i) , index + 1);
        }
        int index = 0;
        boolean judge = true;
        for(Map.Entry<Character , Integer> e : map.entrySet()){
            if(e.getValue() == m){
                index ++;
                if(index == n){
                    System.out.println(e.getKey());
                    judge = false;
                    break;
                }
            }
        }
        if(judge){
            System.out.println(-1);
        }
    }
    public static void main(String[] args) {
        String s = "asadeafrdfd";
      result(s);
      result2(s , 2, 3);
    }
}
