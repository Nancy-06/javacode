package code_practice.day_14;

/**
 * @author guoyao
 * @create 2020/4/16
 */
public class Test5 {

    //最大公约数

    //1.根据数据公式套出来

    public static int gcd1(int a,int b){
        int max=(a>b)?a:b;
        int result=0;
        for(int i=1;i<max;i++){
            if(a%i==0&&b%i==0){
                result=i;
            }
        }
        return result;
    }
    //2.辗转相除法
    public static int gcd2(int a,int b){
        if(b==0){
            return a;
        }
        int r=a%b;
        return gcd2(b,r);
    }
    //3.不用除法，一个数能被x,y整除，也能被x-y,y整除
    public static int gcd3(int a,int b){
        if(b==0){
            return a;
        }
        if(a<b){
            return gcd3(b,a);
        }else{
            return gcd3(a-b,b);
        }
    }

    //最小公倍数
    //传统的做法

    public static int lcm1(int a,int b){
        int temp=0;
        if(a<=0||b==0){
            return -1;
        }
        temp=Math.max(a,b);
        while(temp%a!=0||temp%b!=0){
            temp++;
        }
        return temp;
    }
    public static int lcm(int a,int b){
        return a*b/gcd3(a,b);
    }

    public static void main(String[] args) {
        System.out.println(gcd3(5,7));
        System.out.println(lcm1(5,7));
    }
}
