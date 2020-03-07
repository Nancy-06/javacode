package code_practice.day_04;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/7
 */

//进制转换 (16转10进制) ABCDEF -10 11 12 13 14 15
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        HashMap<Character,Integer> map=new HashMap<>();
        map.put('A',10); map.put('B',11); map.put('C',12);
        map.put('D',13); map.put('E',14); map.put('F',15);
        while(scanner.hasNext()){
            int result=0;
            String str=scanner.nextLine();
            char [] ch=str.toCharArray();
            for(int i=0;i<ch.length;i++){
                if(ch[i]>='1'&&ch[i]<='9'){
                    result+=(ch[i]-48)*Math.pow(16,ch.length-i-1);
                }
                else if(ch[i]>='A'&&ch[i]<='F'){
                    int n=map.get(ch[i]);
                    result+=n*Math.pow(16,ch.length-i-1);
                }
            }
            System.out.println(result);
        }
    }
}
