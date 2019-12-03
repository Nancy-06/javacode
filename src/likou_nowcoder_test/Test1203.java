package likou_nowcoder_test;



import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/12/3
 */

//学分绩点
public class Test1203 {

    //该课绩点
    public static double num(int grade){
        double GPA=0;
        if(grade>=90&&grade<=100){
            GPA=4.0;
        }
        else if(grade>=85&&grade<=89){
            GPA=3.7;
        }
        else if(grade>=82&&grade<=84){
            GPA=3.3;
        }
        else if(grade>=78&&grade<=81){
            GPA=3.0;
        }
        else if(grade>=75&&grade<=77){
            GPA=2.7;
        }
        else if(grade>=72&&grade<=74){
            GPA=2.3;
        }
        else if(grade>=68&&grade<=71){
            GPA=2.0;
        }
        else if(grade>=64&&grade<=67){
            GPA=1.5;
        }
        else if(grade>=60&&grade<=63){
            GPA=1.0;
        }
        else if(grade<60){
            GPA=0;
        }
        return GPA;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int count=scanner.nextInt();
        int [] a=new int[count];  //学分
        int [] b=new int[count];  //课程的实际得分
        for(int i=0;i<count;i++){
            a[i]=scanner.nextInt();
        }
        for(int i=0;i<count;i++){
            b[i]=scanner.nextInt();
        }
        double [] c=new double[count];  //每门课的学分绩点
        for(int i=0;i<count;i++){
            c[i]=num(b[i])*a[i];
        }
        int suma=0; //学分总和
        double sumc=0;  //学科绩点总和
        for(int i=0;i<count;i++){
            suma+=a[i];
            sumc+=c[i];
        }
        double GPA=sumc/suma;
        System.out.printf("%.2f",GPA);
    }
}
