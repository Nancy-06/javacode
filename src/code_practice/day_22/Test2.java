package code_practice.day_22;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/7/24
 */
public class Test2 {

    // 查找无重复最长子串
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(lengthOfLongestSubstring(str));
    }

    public static int lengthOfLongestSubstring(String s){
        int max = 0;
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0, j = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i);
            max = Math.max(max, i - j + 1);
        }
        return max;
    }

    public static int lengthOfLongestSubstring1(String s){
        int max = 0;
        Queue<Character> queue = new LinkedList<>();
        for(char c : s.toCharArray()){
            while(queue.contains(c)){
                queue.poll();
            }
            queue.add(c);
            max = Math.max(max, queue.size());
        }
        return max;
    }

}
