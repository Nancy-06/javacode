package likou_nowcoder_test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/2/12
 */
public class Test021201 {
    //最小的k个数
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(k>input.length){
            return list;
        }
        Arrays.sort(input);
        for(int i=0;i<k;i++){
         list.add(input[i]);
        }
        return list;
    }

    public static void main(String[] args) {

        int [] input={4,5,1};
        System.out.println(GetLeastNumbers_Solution(input,4));
    }
}
