package likou_nowcoder_test;

import java.util.*;

/**
 * @author guoyao
 * @create 2019/11/18
 */

//个位数统计
public class Test38 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String N=scanner.nextLine();
        HashMap<Character,Integer> map=solution(N);
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

    public static HashMap<Character,Integer> solution(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        char [] array=str.toCharArray();
       for(int i=0;i<array.length;i++){
           char ch=array[i];
           int k=map.getOrDefault(ch,0);
           map.put(ch,k+1);
       }
        return map;
    }
}
