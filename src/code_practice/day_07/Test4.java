package code_practice.day_07;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/14
 */

//计算日期到天数转换
public class Test4 {

    //判断闰年
    public static boolean judge(int year){
        boolean result=false;
        if(year%4==0&&year%100!=0){
            result=true;
        }
        else if(year%400==0){
            result=true;
        }
        return result;
    }

    public static int count(int year,int month,int day){
        if(year<=0||month>12||month<=0||day<=0||day>32){
            return -1;
        }
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        map.put(1,31);map.put(2,28);map.put(3,31);map.put(4,30);map.put(5,31);map.put(6,30);
        map.put(7,31);map.put(8,31);map.put(9,30);map.put(10,31);map.put(11,30);map.put(12,31);
       int m=month;
        while(m>0){
            m--;
            if(m>0){
                result+=map.get(m);
            }

        }
        if(judge(year)){
            if(month>3){
                result+=1;
            }
            if(month==2&&day>=29){
                return -1;
            }
        }
        if(day>map.get(month)){
            return -1;
        }
        result+=day;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){
            int year=sc.nextInt();
            int month=sc.nextInt();
            int day=sc.nextInt();
            System.out.println(count(year,month,day));
        }
    }
}
