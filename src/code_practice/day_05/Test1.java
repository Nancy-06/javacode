package code_practice.day_05;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/9
 */

//木棒拼图
public class Test1 {

    public static boolean judge(ArrayList<Long> list){
        int length=list.size();
        for(int i=0;i<length;i++){
            long temp=list.remove(i);
            int sum=0;
            for(int j=0;j<length-1;j++){
                sum+=list.get(j);
            }
            if(sum<=temp){
                list.add(i,temp);
                return false;
            }
            list.add(i,temp);
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Long> list=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            int a=scanner.nextInt();
            long b=scanner.nextInt();
            if(a==1){
                list.add(b);
            }else{
                list.remove(b);
            }
            if(judge(list)){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }
}
