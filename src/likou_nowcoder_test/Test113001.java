package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/30
 */

//统计每个月兔子的总数

    //斐波那契的变形
public class Test113001 {

    public static int getTotalCount(int monthCount){
        if(monthCount==1||monthCount==2){
            return 1;
        }
        return getTotalCount(monthCount-1)+getTotalCount(monthCount-2);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextInt()){
            int monthCount=scanner.nextInt();
            System.out.println(getTotalCount(monthCount));
        }
    }
}
