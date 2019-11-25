package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/24
 */

//统计同成绩学生个数
public class Test1124 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while (scanner.hasNext()){
            //System.out.println("请输入学生数：");
            int n=scanner.nextInt();
            if(n==0){
                break;
            }
            int [] array=new int[n];
            //System.out.println("请输入n名学生的成绩：");
            for(int i=0;i<n;i++){
                array[i]=scanner.nextInt();
            }
            //System.out.println("请输入分数：");
            int aim=scanner.nextInt();
            int num=0;
            for(int i=0;i<array.length;i++){
                if(aim==array[i]){
                    num+=1;
                }
            }
            System.out.println(num);
        }
    }
}
