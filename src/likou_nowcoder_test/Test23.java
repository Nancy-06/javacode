package likou_nowcoder_test;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/7
 */

//汽水瓶
public class Test23 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            int a=scanner.nextInt();
            if(a==0){
                break;
            }
            System.out.println(a/2);
        }
    }
}
