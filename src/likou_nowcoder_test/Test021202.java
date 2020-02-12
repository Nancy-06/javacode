package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/2/12
 */
//字符串中找出连续最长的数字串
public class Test021202 {
    /**
    public static String searchNumberLength(String str){
        HashMap<String,Integer> map=new HashMap<>();
        char [] array=str.toCharArray();
        for(int i=0;i<array.length;i++){
            if(array[i]>='0'&&array[i]<='9'){
                StringBuffer s=new StringBuffer();
                for(int j=i;j<array.length;j++){
                    s.append(array[j]);
                    if(array[i]<'0'||array[i]>'9'){
                        map.put(s.toString(),s.length());
                        break;
                    }
                }
            }
        }
        int max=0;
        String temp="";
        int value=0;
        for(String key:map.keySet()){
            value=map.get(key);
            if(max<value){
                max=value;
                temp=key;
            }
        }
        System.out.println(max);
        return temp;
    }
**/
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //while(scanner.hasNext()){
          char [] ch=scanner.next().toCharArray();
          if(ch.length==0||ch==null||ch.length>255){
              throw new UnsupportedOperationException("错误");
          }
          StringBuffer str=new StringBuffer();
          for(int i=0;i<ch.length;i++){
              if(ch[i]>='0'&&ch[i]<='9'){
                  str.append(ch[i]);
              }
              else{
                  str.append('.');
              }
          }
          String [] s=str.toString().split(".");
          int max=0;
          for(int i=0;i<s.length;i++){
              if(s[i].length()>max){
                  max=s[i].length();
              }
          }
          for(int i=0;i<s.length;i++){
              if(s[i].length()==max){
                  System.out.print(s[i]);
              }
          }
       //}
       //scanner.close();
    }
}
