package code_practice.day_14;

/**
 * @author guoyao
 * @create 2020/4/14
 */


import java.util.*;
//到底买不买
public class Test4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(char c:str1.toCharArray()){
            int value=map1.getOrDefault(c,0);
            map1.put(c,value+1);
        }
        for(char c:str2.toCharArray()){
            int value=map2.getOrDefault(c,0);
            map2.put(c,value+1);
        }
        boolean judge=true;
        int result=0;
        for(Map.Entry<Character,Integer> e:map2.entrySet()){
                char key=e.getKey();
                int value=e.getValue();
            if(map1.containsKey(key)&&map1.get(key)<value){
                judge=false;
                result+=value-map1.get(key);
            }
            else if(!map1.containsKey(key)){
                judge=false;
                result+=value;
            }
        }
        if(judge){
            System.out.println("Yes"+(str1.length()-str2.length()));
        }
        else{
            System.out.println("No"+result);
        }
    }
}