package code_practice.day_08;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/19
 */

//23614--字母统计
public class Test4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String line=scanner.nextLine();
            //因为只有26个字母
            int [] count=new int[26];
            for(int i=0;i<line.length();i++){
                char ch=line.charAt(i);
                if(ch>='A'&&ch<='Z'){
                    //哈希中的直接定址法
                    count[ch-'A']++;
                }
            }
            for(int i=0;i<26;i++){
                System.out.printf("%c:%d%n",('A'+i),count[i]);
            }
        }
    }
}
