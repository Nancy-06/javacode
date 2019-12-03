package likou_nowcoder_test;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/30
 */

//到底买不买
public class Test113003 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str1=scanner.nextLine();
            String str2=scanner.nextLine();
            LinkedList<Character> list=new LinkedList<>();
            for(int i=0;i<str1.length();i++){
                char ch=str1.charAt(i);
                list.add(ch);
            }
            int count=0;
            for(int i=0;i< str2.length();i++){
                char ch=str2.charAt(i);
                for(int j=0;j<list.size();j++){
                    if(ch==list.get(j)){
                        list.remove(j);
                        count++;
                        break;
                    }
                }
            }
            if(count==str2.length()){
                System.out.println("Yes "+(str1.length()-count));
            }
            else{
                System.out.println("No "+(str2.length()-count));
            }
        }
    }
}
