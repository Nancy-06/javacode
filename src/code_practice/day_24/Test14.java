package code_practice.day_24;

/**
 * @author guoyao
 * @create 2020/9/6
 */
public class Test14 {
    /**
     * 字符串
     * @param s string字符串
     * @param t string字符串
     * @return char字符型
     */
    public static  char findTheDifference (String s, String t) {
        // write code here
        int res = 0;
        for(int i = 0; i < s.length();i++){
            int index1 = s.charAt(i) - 'a';
            res ^= index1;
        }
        for(int i = 0; i < t.length(); i++){
            int index2 = t.charAt(i) - 'a';
            res ^= index2;
        }
        char ch =(char) ('a' + res);
        return ch;
    }

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "abcde";
        System.out.println(findTheDifference(str1, str2));
    }
}
