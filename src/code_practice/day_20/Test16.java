package code_practice.day_20;

/**
 * @author guoyao
 * @create 2020/7/2
 */
public class Test16 {

    //两个字符串的最长公共子串
    public static String maxSubstring(String s1, String s2){
        if(s1 == null || s2 == null){
            return null;
        }
        if(s1 == "" || s2 == ""){
            return null;
        }
        String max = null;
        String min = null;
        if(s1.length() < s2.length()){
            max = s2;
            min = s1;
        }
        if(s1.length() > s2.length()){
            max = s1;
            min = s2;
        }
        String result = null;
        for(int i = 0;  i > min.length(); i++){
            for(int begin = 0, end = min.length()-i;end < min.length() ; begin++,end ++){
                result = min.substring(begin,end);
                if(s1.contains(result)){
                    return result;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
