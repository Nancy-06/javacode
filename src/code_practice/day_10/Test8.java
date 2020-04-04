package code_practice.day_10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/31
 */
//个位数统计
public class Test8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String n=scanner.nextLine();
        char [] array=n.toCharArray();
        //Arrays.sort(array);
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<array.length;i++){
            char ch=array[i];
            int value=map.getOrDefault(ch,0);
            map.put(ch,value+1);
        }
        for(Map.Entry<Character,Integer> e:map.entrySet()){
            System.out.println(e.getKey()+":"+e.getValue());
        }
    }
}
