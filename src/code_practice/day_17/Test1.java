package code_practice.day_17;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/5/13
 */
//奇偶校验
public class Test1 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            String str=scanner.nextLine();
            //将输入的字符串统一转换为字符数组
            jiQiaoYan(str.toCharArray());
        }
    }
    private static void jiQiaoYan(char[] s) {
        int [] result=new int [8];
        for(int i=0;i<s.length;i++){
            int n=0x01;
            int j=7;
            int sum=0;
            //需要进行7次与运算，得出1的个数以及二进制形式
            while(j>0){
                result[j]=(s[i]&n)==0 ? 0:1;
                if(result[j]==1){
                    sum++;
                }
                n=n<<1;
                j--;
            }
            if((sum & 1)==0){
                result[0]=1;
            }
            for(int k=0;k<result.length;k++){
                System.out.print(result[k]);
            }
            result[0]=0;
            System.out.println();
        }
    }
}
