package code_practice.day_19;

/**
 * @author guoyao
 * @create 2020/6/10
 */
public class Test8 {

    //1~n整数中1出现的次数

    public int countDigitOne(int n) {
         return f(n);
    }

    private int f(int n) {

        if(n <= 0){
            return 0;
        }
        String s = String.valueOf(n);
        int high = s.charAt(0)-'0';
        int pow = (int)Math.pow(10,s.length()-1);
        int last = n - high * pow;
        if(high == 1){
            return f(pow-1) + last+1 +f(last);
        }
        else{
            return pow + high*f(pow-1) + f(last);
        }
    }
}
