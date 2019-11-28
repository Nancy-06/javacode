package likou_nowcoder_test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2019/11/27
 */


//微信红包
public class test112702 {
    public static int getValue(int[] gifts, int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int x=0;
        int y=0;
        for(int i=0;i<gifts.length;i++) {
            if (map.get(gifts[i]) == null) {
                map.put(gifts[i], 1);
            } else {
                x = map.get(gifts[i]).intValue();
                map.put(gifts[i], 1 + x);
            }
        }
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){

            int m=entry.getValue();
            if(m>n/2){
               y=entry.getKey();
            }
        }
        return y;
    }

    public static void main(String[] args) {
        int [] n={1,2,3,2,2};
        System.out.println(getValue(n,5));
    }
}
