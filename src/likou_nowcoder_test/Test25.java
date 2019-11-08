package likou_nowcoder_test;

import sun.util.resources.hr.CalendarData_hr;



import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/8
 */
//寻找最长数字串
public class Test25 {
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
