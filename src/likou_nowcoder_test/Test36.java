package likou_nowcoder_test;

        import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/14
 */
public class Test36 {
    public static void main(String[] args) {
        Scanner scaner=new Scanner(System.in);
        int n=scaner.nextInt();
        String str="";
        while(n!=0){
            int k=n%10;
            str+=String.valueOf(k);
            n=n/10;
        }
        System.out.println(str);
    }

}
