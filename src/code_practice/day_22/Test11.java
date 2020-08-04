package code_practice.day_22;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/8/2
 */
public class Test11 {

    //找字符串中第一次出现次数为1的字符
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            String str = sc.nextLine();
//            HashMap<Character , Integer> map = new HashMap<>();
//            for(int i = 0; i <str.length(); i++){
//                int temp = map.getOrDefault(str.charAt(i) , 0);
//                map.put(str.charAt(i) , temp + 1);
//            }
//            char ch ;
//            boolean judge = false;
//            for(Map.Entry<Character, Integer> e : map.entrySet()){
//                if(e.getValue() == 1){
//                    System.out.println(e.getKey());
//                    judge = true;
//                    break;
//                }
//            }
//            if(!judge){
//                System.out.println(-1);
//            }

            result(str);
        }
    }

    private static void result(String str){
      if(str == null || str.length() == 0){
          System.out.println(-1);
      }
      int [] count = new int[26];
      str = str.toLowerCase();
      int len = str.length();
      for(int i = 0; i < len; i++){
          count[str.charAt(i) - 'a'] ++;
      }
      boolean judge = false;
      for(int i = 0; i <len; i++){
          if(count[str.charAt(i) - 'a'] == 1){
              System.out.println(str.charAt(i));
              judge = true;
              break;
          }
      }
      if(!judge){
          System.out.println(-1);
      }
    }
}
