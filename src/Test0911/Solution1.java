package Test0911;

import java.util.*;

//查找常用字符
//例如：输入：["bella","label","roller"],输出：["e","l","l"]
public class Solution1 {
    public static List<String> commomChars(String [] A){
        //1.统计每个单词中，每个字母出现次数
        List<Map<Character,Integer>> counts=new ArrayList<>();
        for(String s:A){
            Map<Character,Integer> map=new HashMap<>();
            for(char c:s.toCharArray()){
                int n=map.getOrDefault(c,0);
                map.put(c,n+1);
            }
            counts.add(map);
        }
        System.out.println(counts);
        List<String> result=new ArrayList<>();
        //从counts中找出abel
        for(char c:counts.get(0).keySet()){
            boolean allContains=true;
            for(int i=1;i<counts.size();i++) {
                Map<Character, Integer> map = counts.get(i);
                if (!map.containsKey(c)) {
                    allContains = false;
                    break;
                }
            }
            //怎么判断是全包含还是有不包含的
            if(!allContains){
                continue;
            }
            //找到c在每个单词中出现次数的最小值
            int min=counts.get(0).get(c);
            for(int i=1;i<counts.size();i++){
                int n=counts.get(i).get(c);
                if(n<min){
                    min=n;
                }
            }
            //c这个字母，在每个单词中都至少出现了min次
            for(int i=0;i<min;i++){
                result.add(String.valueOf(c));
            }
        }
        return result;
    }
    public static List<String> commonChars2(String [] A){
        List<int []> counts=new ArrayList<>();
        for(String s:A){
            int [] a=new int [26];
            for(char c:s.toCharArray()){
                int index=c-'a';
                a[index]++;
            }
            counts.add(a);
        }
        for(int [] a:counts){
            System.out.println(Arrays.toString(a));
        }
        System.out.println("===================================");
        int [] r=new int [26];
        for(int i=0;i<26;i++){
            int n=Integer.MAX_VALUE;
            for(int [] a:counts){
                n=Math.min(n,a[i]);
            }
            r[i]=n;
        }
        System.out.println(Arrays.toString(r));
        List<String> result=new ArrayList<>();
        for(int i=0;i<26;i++){
            for(int j=0;j<r[i];j++){
                char c=(char)('a'+i);
                result.add(String.valueOf(c));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String [] A={"bella","label","roller"};
        System.out.println(commonChars2(A));
    }
}
