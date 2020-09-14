package code_practice.day_25;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/9/14
 */

//58神奇串
public class Test14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(result(str));
    }

    public static String result(String str){
        if(str.length() < 2 || str == null){
            return null;
        }
        ArrayList<String> array = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        for(int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '5' && str.charAt(i) <= '8') {
                sb.append(str.charAt(i));
            }
            else{
                if(sb == null || sb.length() <2){
                    sb = new StringBuffer();
                }
                else if(sb.length() >= 2){
                    array.add(sb.toString());
                    sb = new StringBuffer();
                }
            }
        }
        if(sb.length() >= 2){
            array.add(sb.toString());
        }

        int max = 0;
        int index = 0;
        for(int i = 0; i < array.size(); i++){
            if(max < array.get(i).length()){
                max = array.get(i).length();
                index = i;
            }
        }
        return array.get(index);
    }
}
