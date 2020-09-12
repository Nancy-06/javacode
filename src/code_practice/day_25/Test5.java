package code_practice.day_25;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/9/12
 */
public class Test5 {

    //最多的回文
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(result(str));

    }

    //判断有多少个回文
    public static int result(String str){
        if(str.length() == 0 || str.length() == 1){
            return 0;
        }else if(str == null){
            return 0;
        }
        int num = 0;
        for(int i = 0; i < str.length(); i++){
            for(int j = i + 1; j < str.length(); j++){
                if(huiwen(str.substring(i , j + 1))){
                    num ++;
                }
            }
        }
        return num;
    }

    //判断是否为回文
    public static boolean huiwen(String str){
        if(str.length() == 0){
            return false;
        }
        if(str == null){
            return false;
        }
        if(str.length() == 1){
            return false;
        }
        int i = 0;
        int j = str.length() - 1;
        while(i < j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            else{
                i++;
                j--;
            }
        }
        return true;
    }
}
