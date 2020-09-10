package code_practice.day_24;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/9/10
 */

//姓名改写
public class Test21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        String[] strs = str.split(" ");
        System.out.println(result(strs));

    }

    public static String result(String[] strs) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strs.length; i++) {
            for (int j = 0; j < strs[i].length(); j++) {
                if (strs[i].charAt(j) < 'a' || strs[i].charAt(j) > 'z') {
                    return "unkown name";
                }
            }
        }
        if (strs.length < 3) {
            for (int i = 0; i < strs.length; i++) {
                sb.append(strs[i]);
            }
            return sb.toString();
        }
        else{
            for (int i = 0; i < strs.length; i++) {
                sb.append(strs[i].charAt(0));
            }
            return sb.toString();
        }
    }
}
