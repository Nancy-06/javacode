package code_practice.day_13;

/**
 * @author guoyao
 * @create 2020/4/1
 */
//无缓存交换
public class Test1 {
    public int [] change(int [] AB){
//        AB[0]=AB[0]+AB[1];
//        AB[1]=AB[0]-AB[1];
//        AB[0]=AB[0]-AB[1];
//        return AB;
        //思路：x ^ x == 0
        //x ^ 0 == x
        //设M，N是常数，且a=M，b=N，则交换使用异或运算交换a和b的过程如下：
        //a = a^b=M^N;
        //b = a^b = M^N^N = M^0 = M;//b交换成功
        //a = a^b = M^N^M = M^M^N = 0^N = N;//a交换成功
        AB[0]^=AB[1];
        AB[1]^=AB[0];
        AB[0]^=AB[1];
        return AB;
    }

}
