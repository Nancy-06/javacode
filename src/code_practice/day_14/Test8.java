package code_practice.day_14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @author guoyao
 * @create 2020/4/21
 */

//无重复字符的最长子串
public class Test8 {
    //暴力搜索，时间复杂度高
    public int lengthOfLongestSubstring1(String s){
        int n=s.length();
        Set<Character> set=new HashSet<>();
        int ans=0,i=0,j=0;
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans=Math.max(ans,j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }

    //利用HashMap
    public int lengthOfLongestSubstring2(String s){
        int n=s.length(),ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int j=0,i=0;j<n;j++){
            //如果窗口中包含当前字符
            if(map.containsKey(s.charAt(j))){
                //左边界移动到相同字符的下一个位置和i当前位置中更靠右的位置，
                // 这样是为了i向左移动
                i=Math.max(map.get(s.charAt(j)),i);
            }
            //比对当前无重复字段长度和储存的长度，选最大值并替换
            //j-i+1是因为此时i,j仍处于不重复的位置，j还没有向后移动，取得[i,j]长度
           ans=Math.max(ans,j-i+1);
            //将当前字符为key,下一个索引为value放入map中
            map.put(s.charAt(j),j+1);
        }
        return ans;
    }
}
