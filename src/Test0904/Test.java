package Test0904;

import java.util.*;

public class Test {
    //找出数组中出现次数为n次的元素集合
    public static int count(int [] array){
        Map<Integer,Integer> map=new HashMap<>();
        for(int i:array){
            int c=map.getOrDefault(i,0);
            map.put(i,c+1);
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            int key=entry.getKey();
            int count=entry.getValue();
            if(count==1){
                return key;
            }
        }
        return -1;
    }
    //查找石头中宝石的个数
    public static int numbers(String J,String S){
        Set<Character> set=new HashSet<>();
        int count=0;
        for(char ch:J.toCharArray()){
            set.add(ch);
        }
        for(char ch:S.toCharArray()){
            if(set.contains(ch)){
                count++;
            }
        }
        return count;
    }
    //坏键盘打字
    //返回前K个出现次数最多的元素
    //单词=>次数
     Map<String,Integer> count(String [] words){
        Map<String,Integer> wordToCount=new HashMap<>();
        for(String ch:words){
            int count=wordToCount.getOrDefault(ch,0);
            wordToCount.put(ch,count+1);
        }
        return wordToCount;
    }
    //次数=>单词
    Map<Integer,List<String>> remap(Map<String,Integer> wordToCount){
        Map<Integer,List<String>> countToWordList=new HashMap<>();
        for(Map.Entry<String,Integer> entry:wordToCount.entrySet()){
            String word=entry.getKey();
            int count=entry.getValue();
            List<String> wordsList=countToWordList.get(count);
            while(wordsList==null){
                wordsList=new ArrayList<>();
                countToWordList.put(count,wordsList);
            }
            wordsList.add(word);
        }
        return countToWordList;
    }
    public List<String> topKFrequent(String [] words,int k){
        Map<String,Integer> wordToCount=count(words);
        Map<Integer,List<String>> countToWordList=remap(wordToCount);
        Set<Integer> keys=countToWordList.keySet();
        int [] count=new int [keys.size()];
        int i=0;
        for(int key:keys){
            count[i++]=key;
        }
        Arrays.sort(count);
        List<String> result=new ArrayList<>();
        int j=0;
        int index=count.length-1;
        while(j<k){
            int c=count[index--];
            List<String> wordLsit=countToWordList.get(c);
            if(wordLsit.size()<=k-j){
                result.addAll(wordLsit);
                j+=wordLsit.size();
            }
            else{
                result.addAll(wordLsit.subList(0,k-j));
                j=k;
            }
        }
        return result;
    }
}
