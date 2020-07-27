package code_practice.day_22;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/7/26
 */
public class Test4 {

    //回文数索引
    //给定一个仅由小写字母组成的字符串。现在请找出一个位置，删掉那个字母之后，字符串变成回文。
    // 请放心总会有一个合法的解。如果给定的字符串已经是一个回文串，那么输出-1。

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.valueOf(sc.nextLine());
        for(int i = 0; i < n; i++){
            String s = sc.nextLine();
            boolean judge = true;
            for(int j = 0, k = s.length() - 1; j <= s.length()/2; j++, k--){
                if(s.charAt(j) != s.charAt(k)){
                    if(s.charAt(j + 1) == s.charAt(k)){
                        judge = false;
                        System.out.println(j);
                        break;
                    } else if(s.charAt(j) == s.charAt(k - 1)){
                        judge = false;
                        System.out.println(k);
                        break;
                    }
                }
            }
            if(judge){
                System.out.println(-1);
            }
        }
    }
}
