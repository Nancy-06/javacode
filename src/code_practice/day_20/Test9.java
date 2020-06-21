package code_practice.day_20;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/6/21
 */
public class Test9 {

    // 判定是否为字符重排
    public boolean CheckPermutation(String s1, String s2) {

//        char [] chars1 = s1.toCharArray();
//        Arrays.sort(chars1);
//        char [] chars2 = s2.toCharArray();
//        Arrays.sort(chars2);
//        return new String(chars1).equals(new String(chars2));


        int sum1 = 0;
        int sum2 = 0;
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            for(int i = 0; i < s1.length(); i++){
                sum1 += s1.charAt(i);
                sum2 += s2.charAt(i);
            }
        }
        return (sum1 == sum2);
    }
}
