package code_practice.day_01;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/2/29
 */
public class Test2 {
    //统计回文
    public static boolean isHunwen(String s){
        int i=0;
        int j=s.length()-1;
        while(i>j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str1= scanner.nextLine();
        String str2= scanner.nextLine();
        int count=0;
        for(int i=0;i<str1.length();i++){
            StringBuffer sb=new StringBuffer(str1);
            sb.insert(i,str2);
            if(isHunwen(sb.toString())){
                count++;
            }
        }
        System.out.println(count);

    }
}
