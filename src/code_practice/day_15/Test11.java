package code_practice.day_15;

/**
 * @author guoyao
 * @create 2020/5/3
 */


import java.util.*;
//A盒中包含B盒
public class Test11 {
    public static boolean judge(String s1,String s2){
        if(s1.length()<s2.length()){
            return false;
        }
        boolean result=true;
        Map<Character,Integer> map1=new HashMap<>();
        Map<Character,Integer> map2=new HashMap<>();
        for(int i=0;i<s1.length();i++){
            int value=map1.getOrDefault(s1.charAt(i),0);
            map1.put(s1.charAt(i),value+1);
        }
        for(int i=0;i<s2.length();i++){
            int value=map2.getOrDefault(s2.charAt(i),0);
            map2.put(s2.charAt(i),value+1);
        }
        for(Map.Entry<Character,Integer> e:map2.entrySet()){
            char key=e.getKey();
            int value=e.getValue();
            if(map1.get(key)<value){
                result=false;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String s1=scanner.next()+" ";
            String s2=scanner.next();
            boolean result=judge(s1,s2);
            if(result){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}

