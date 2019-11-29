package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2019/11/18
 */
public class Test40 {
    //无缓存交换
    public int[] exchangeAB(int[] AB) {

     AB[0]=AB[0]+AB[1];
     AB[1]=AB[0]-AB[1];
     AB[0]=AB[0]-AB[1];
        return AB;
    }
}
