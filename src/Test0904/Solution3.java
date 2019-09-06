package Test0904;

import java.util.*;

//查找石头中宝石的个数
public class Solution3 {
    public static int numJewelsInStrones(String J,String S){
       Set<Character> set=new HashSet<>();
       int count=0;
       for(char ch:J.toCharArray()){
           set.add(ch);
       }
       for(char ch:S.toCharArray()){
           if(set.contains(ch)){
               count++;
           }
       }
        return count;
    }

    public static void main(String[] args) {
        String J="aA";
        String S="aAAbbbbb";
        System.out.println(numJewelsInStrones(J,S));
    }
}
