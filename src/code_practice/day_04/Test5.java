package code_practice.day_04;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/8
 */

//字符串中找出连续最长的数字串
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            int max=0;
            int count=0;
            int end=0;
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='0'&&str.charAt(i)<='9'){
                    count++;
                    if(max<count){
                        max=count;
                        end=i;
                    }
                }
                else{
                    count=0;
                }
            }
            System.out.println(str.substring(end-max+1,end+1));
        }
    }
}
