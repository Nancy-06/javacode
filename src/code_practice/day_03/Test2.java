package code_practice.day_03;

/**
 * @author guoyao
 * @create 2020/3/4
 */
public class Test2 {
    //上楼梯
    public static int countWays(int n){
        if(n<0){
            return 0;
        }
        if(n==0||n==1){
            return 1;
        }

        if(n==2){
            return 2;
        }
        if(n==3){
            return 4;
        }
        int temp=0;
        int a=1;
        int b=2;
        int c=4;
        for(int i=4;i<=n;i++){
            temp=(a+b+c)%1000000007;
            a=b;
            b=c;
            c=temp;
        }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(countWays(4));
    }
}
