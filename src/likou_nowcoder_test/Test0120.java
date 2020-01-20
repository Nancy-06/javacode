package likou_nowcoder_test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2020/1/20
 */
public class Test0120 {
    //判断是否为回文数
    public static boolean isPalindrome(int x){
        if(x<0){
            return false;
        }
        List<Integer> list=new ArrayList<>();
        while(x/10!=0){
            int m=x%10;
            list.add(m);
            x=x/10;
        }
        list.add(x);
        for(int i=0;i<list.size()/2;i++){
            if(list.get(i)!=list.get(list.size()-1-i)){
                return false;
            }
        }
        return true;
    }

    //力扣 383：赎金信
    public boolean canConstruct(String ransomNote, String magazine) {
        int [] array=new int[26];
        for(int i=0;i<magazine.length();i++){
            array[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomNote.length();i++){
            if(array[ransomNote.charAt(i)-'a']==0){
                return false;
            }
            else{
                array[ransomNote.charAt(i)-'a']--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(12345));
    }
}
