package code_practice.day_21;

/**
 * @author guoyao
 * @create 2020/7/8
 */
public class Test1 {

    // 最长公共前缀
    public String longestCommonPrefix(String[] strs) {

        if(strs.length == 0){
            return "";
        }
        String res = strs[0];
        for(int i = 1; i <strs.length; i++){
            int j = 0;
            for(j = 0; j < strs[i].length() && j < res.length(); j++){
                if(res.charAt(j) != strs[i].charAt(j)){
                    break;
                }
            }
            res = res.substring(0,j);
            if (res.equals( "")) {
                return res;
            }
        }
        return res;
    }
}
