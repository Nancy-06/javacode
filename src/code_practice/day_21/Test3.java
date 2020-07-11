package code_practice.day_21;

/**
 * @author guoyao
 * @create 2020/7/11
 */
public class Test3 {

    // 字符串轮转
    public boolean isFlipedString(String s1, String s2) {

        if(s1 .equals(s2)){
            return true;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i = 0; i < s1.length(); i++){
            if(s1.charAt(i) == s2.charAt(0)){
                StringBuffer sb = new StringBuffer();
                sb.append(s1.substring(i)).append(s1.substring(0,i));
                if(sb.toString().equals(s2)){
                    return true;
                }
            }
        }
        return false;
    }
}
