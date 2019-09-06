package Test0904;

import java.util.*;

//坏键盘打字
public class Solution4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String expexted=scanner.nextLine();
        String actual=scanner.nextLine();
        //set记录实际打印出来的字符，全部大写
        Set<Character> set=new HashSet<>();
        //不区分大小写，统一把字符串转为大写
        char [] a=actual.toUpperCase().toCharArray();
        for(char ch:a){
            set.add(ch);
        }
        //记录已经打印过的键
       Set<Character> broken=new HashSet<>();
        char[] b=expexted.toUpperCase().toCharArray();
        for(char ch:b){
            if(!set.contains(ch)){
                if(!broken.contains(ch)){
                    System.out.print(ch);
                    broken.add(ch);
                }
            }
        }
    }
}
