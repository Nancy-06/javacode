package Test0906;

import java.util.*;
//子域名访问计数
public class Solution1 {
   public static List<String> subdomainVisits(String [] cpdomains){
       Map<String,Integer> map=new HashMap<>();
       for(String sp:cpdomains){
           String [] t= sp.split(" ");
           int n=Integer.valueOf(t[0]);
           String [] u=t[1].split("\\.");
           for(int i=0;i<u.length;i++){
               String [] sub=Arrays.copyOfRange(u,i,u.length);
               String d=String.join(".",sub);
               int val=map.getOrDefault(d,0);
               map.put(d,n+val);
           }
       }
       List<String> result=new ArrayList<>();
       for(Map.Entry<String,Integer> entry:map.entrySet()){
           String cp=entry.getKey();
           int cur=entry.getValue();
           result.add(cur+" "+cp);
       }
       return result;
   }

    public static void main(String[] args) {
        String[] s = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> r = subdomainVisits(s);
        System.out.println(r);
    }
}
