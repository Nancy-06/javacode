package code_practice.day_22;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/8/9
 */
//删除公共字符串
public class Test19 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        char [] ch = str1.toCharArray();
        for(int i = 0; i < ch.length; i++){
            if(!str2.contains(String.valueOf(ch[i]))){
                System.out.print(ch[i]);
            }
        }
        //System.out.println(result(str1, str2));
    }

    private static String result(String str1, String str2) {
        StringBuffer sb = new StringBuffer();

        for(int i = 0; i < str1.length(); i++){
            boolean judge = false;
            for(int j = 0; j < str2.length(); j++){
                if(str1.charAt(i) == str2.charAt(j)){
                    judge = true;
                    break;
                }
            }
            if(judge == false){
                sb.append(str1.charAt(i));
            }

        }
        return sb.toString();
    }
}
