package code_practice.day_14;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/4/18
 */

//学分绩点
public class Test6 {

    //根据实际成绩确定绩点
    public static double getPoint(int grade){
        double point=0.0;
        if(grade>=90&&grade<=100){
            point=4.0;
        }
        else if(grade>=85&&grade<=89){
            point=3.7;
        }
        else if(grade>=82&&grade<=84){
            point=3.3;
        }
        else if(grade>=78&&grade<=81){
            point=3.0;
        }
        else if(grade>=75&&grade<=77){
            point=2.7;
        }
        else if(grade>=72&&grade<=74){
            point=2.3;
        }
        else if(grade>=68&&grade<=71){
            point=2.0;
        }
        else if(grade>=64&&grade<=67){
            point=1.5;
        }
        else if(grade>=60&&grade<=63){
            point=1.0;
        }
        else if(grade<60){
            point=0.0;
        }
        return (double)point;
    }

    //确定学生的学分绩点
    public static double getGPA(int [] credits,int [] results){
        //学科绩点之和
        double sumPoint=0;
        //所有课程学分之和
        double sumCredit=0.0;
        for(int i=0;i<credits.length;i++){
            //该课的学分绩点
            double point=getPoint(results[i])*credits[i];
            sumCredit+=credits[i];
            sumPoint+=point;
        }
        return (double)sumPoint/sumCredit;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] credits=new int[n];
        int [] results=new int[n];
        for(int i=0;i<n;i++){
            credits[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            results[i]=sc.nextInt();
        }

        System.out.printf("%.2f",getGPA(credits,results));
    }
}
