package code_practice.day_08;

import java.util.*;

/**
 * @author guoyao
 * @create 2020/3/17
 */

//骆驼法命名法
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            List<Character> list=new ArrayList<>();
            for(int i=0;i<str.length();i++){
                list.add(str.charAt(i));
            }
            StringBuffer sb=new StringBuffer();
           for(int i=0;i<list.size();i++){
               if(list.get(i)=='_'){
                   i++;
                   if(i<list.size()){
                       char ch=(char) (list.get(i)-32);
                       sb.append(ch);
                   }else{
                       break;
                   }
               }
               else{
                   sb.append(list.get(i));
               }
           }
            System.out.println(sb.toString());
        }
    }
}
