package code_practice.day_04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/7
 */

//字母统计
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            char [] ch=str.toCharArray();
            for(int i=0;i<ch.length;i++){
                if(ch[i]>=65&&ch[i]<=90){
                    int n=map.getOrDefault(ch[i],0);
                    map.put(ch[i],n+1);
                }
            }
            char [] chars={'A','B','C','D','E','F','G','H',
                    'I','J','K','L','M','N','O','P','Q','R',
                    'S','T','U','V','W','X','Y','Z'};
            for(int i=0;i<chars.length;i++){
                System.out.println(chars[i]+":"+map.getOrDefault(chars[i],0));
            }
        }

    }
}
