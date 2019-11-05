package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/5
 */
public class Test21 {
    //统计回文

    //判断字符串是不是回文
    public static boolean huiwen(StringBuffer A){
        if(A.length()==0){
            return true;
        }
        int left=0;
        int right=A.length()-1;
        while(left<right){
            if(A.charAt(left)!=A.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //输入A字符串
        String A=scanner.nextLine();
        //输入B字符串
        String B=scanner.nextLine();
        int count=0;
        for(int i=0;i<=A.length();i++){
            StringBuffer A1=new StringBuffer(A);
            A1.insert(i,B);
            if(huiwen(A1)){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
