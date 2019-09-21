package Test0921;

//将罗马数字转为整数
//MCMXCIV  为 1994 算法为：1000+90+90+4
//I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
//X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
//C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。

import java.util.*;

public class Solution1 {
    public static int romanTnInt(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        HashMap<Character,List<Character>> result=new HashMap<>();
        result.put('I',Arrays.asList('V','X'));
        result.put('X',Arrays.asList('L','C'));
        result.put('C', Arrays.asList('D','M'));
        int n=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(i<s.length()-1){
                if(result.containsKey(c)){
                    char next=s.charAt(i+1);
                    if(result.get(c).contains(next)){
                        int charInt=map.get(c);
                        int valInt=map.get(next);
                        n+=(valInt-charInt);
                        i++;
                        continue;
                    }
                }
            }
            int nextInt=map.get(c);
            n+=nextInt;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(romanTnInt("IV"));
        System.out.println(romanTnInt("VIIII"));
        System.out.println(romanTnInt("MCMXCIV"));
    }
}
