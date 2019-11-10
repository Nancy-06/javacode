package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/9
 */
//神奇的口袋
public class Test28 {
    static int [] array=new int[20];
    public static int count(int p,int w){
        if(w==0){
            return 1;
        }
        if(p<1){
            return 0;
        }
        return count(p-1,w)+count(p-1,w-array[p-1]);
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<n;i++){
            array[i]=scanner.nextInt();
        }
        System.out.println(count(n,40));
    }
}
