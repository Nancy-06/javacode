package code_practice.day_13;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author guoyao
 * @create 2020/4/9
 */

//DNA序列
public class Test8 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String str=scanner.next();
        System.out.println(search(str));
    }
    public static int search(String str){
         for(int i=1;i<=str.length();i++){
             Set<String> set=new TreeSet<>();
             for(int j=0;j<str.length()-i;j++){
                 set.add(str.substring(j,j+i));
             }
             if(set.size()<Math.pow(4,i)){
                 return i;
             }
         }
         return 1;
    }
}
