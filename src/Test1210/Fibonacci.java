package Test1210;

/**
 * @author guoyao
 * @create 2019/12/10
 */
public class Fibonacci {

    //递归实现
    public  static int f1(int n){
        if(n<=0){
            return 0;
        }
        if(n==1||n==2){
            return 1;
        }
        return f1(n-1)+f1(n-2);
    }
    //动态规划,空间复杂度为O(n)
    public static int f2(int n){
        if(n<=0){
            return 0;
        }
        //申请数组
        int [] array=new int[n+1];
        array[0]=0;
        array[1]=1;
        for(int i=2;i<=n;i++){
            array[i]=array[i-1]+array[i-2];
        }
        return array[n];
    }

    //动态规划，时间复杂度为O(1)
    public static int f3(int n){
        if(n<=0){
            return 0;
        }
        if(n==1||n==2) {
            return 1;
        }
        int ret=0;
        int f1=1;
        int f2=1;
        for(int i=3;i<=n;i++){
            //F(n)=F(n-1)+F(n-2)
            ret=f1+f2;
            //更新值
            f2=f1;
            f1=ret;
        }
        return ret;
    }

    public static void main(String[] args) {
        System.out.println(f1(5));
        System.out.println(f2(5));
        System.out.println(f3(5));
    }
}
