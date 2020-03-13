package code_practice.day_06;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/3/13
 */
public class Test6 {

    //买苹果
    public static int count(int n){
        //一定是偶数（6,8）都是，最小是6,10以上偶数都可以
        if(n%2==1||n==10||n<6){
            return -1;
        }
        //如果拿8个拿完最好
        if(n%8==0){
            return n/8;
        }
        //对于10以上的偶数，只要对8取余数不为0，就要从前面的1或者2个8中拿出2个，
        // 把余数补为6（本来余数就是6，就不用了拿）。所以+1
        return 1+n/8;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        System.out.println(count(n));
    }
}
