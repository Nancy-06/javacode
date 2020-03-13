package code_practice.day_06;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/12
 */

//删除公共字符串
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s1=scanner.nextLine();
        String s2=scanner.nextLine();
        char [] ch=s1.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(!s2.contains(String.valueOf(ch[i]))){
                System.out.print(ch[i]);
            }
        }
    }
}
