package code_practice.day_26;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/9/24
 */

//缩短字符串，缩短连续的重复字符，用数字表时，如果缩短后的字符串较之前的没有缩短，返回原字符串
public class Test6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(result(str));
    }

    public static String result(String str){
        if(str == null || str.length() == 0){
            return null;
        }
       StringBuffer sb = new StringBuffer();
        int i = 0;
        int size = 1;
        while(i < str.length() -1 ){
            if(str.charAt(i) == str.charAt(i+1)){
                size ++;
                i++;
            }else{
                sb.append(str.charAt(i));
                sb.append(size);
                size = 1;
                i++;
            }
        }
        sb.append(str.charAt(str.length() - 1));
        sb.append(size);
        if(sb.length() >= str.length()){
            return str;
        }
        else{
            return sb.toString();
        }
    }
}
