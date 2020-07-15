package code_practice.day_21;

/**
 * @author guoyao
 * @create 2020/7/15
 */
public class Test6 {

    //两个字符串的最长公共子串
    public static String maxSubstring(String strOne, String strTwo){
        if(strOne == "" || strTwo == ""){
            return "";
        }
        if(strOne.length() == 0 || strTwo.length() == 0){
            return "";
        }
        String min = null;
        String max = null;
        if(strOne.length() < strTwo.length()){
            min = strOne;
            max = strTwo;
        }else{
            min = strTwo;
            max = strOne;
        }
        String res = null;
        for(int i = 0; i < min.length(); i++){
            for(int begin = 0, end = min.length()-i; begin <min.length(); begin++, end++){
                res = min.substring(begin,end);
                if(max.contains(res)){
                    return res;
                }
            }
        }
        return null;
    }
}
