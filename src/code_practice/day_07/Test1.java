package code_practice.day_07;

/**
 * @author guoyao
 * @create 2020/3/14
 */
public class Test1 {
    //上楼梯：一次可以上1/2/3阶
    public static int countWay(int n){
        //第一阶有一种方法
        //第二阶有两种方法，一步一步or一次两步
        //第三阶有四种方法，1+1+1 or 1+2 or 2=1 or 3
        long[] pre={1,2,4};
        if(n<=0){
            return 0;
        }
        else if(n<=3){
            return (int) pre[n-1];
        }
        else{
            for(int i=4;i<=n;i++){
                long temp=(pre[0]+pre[1]+pre[2])%1000000007;
                pre[0]=pre[1];
                pre[1]=pre[2];
                pre[2]=temp;
            }
        }
        return (int)pre[2];
    }

    public static void main(String[] args) {
        System.out.println(countWay(4));
    }
}
