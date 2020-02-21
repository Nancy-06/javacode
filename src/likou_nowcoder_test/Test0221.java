package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/2/21
 */
public class Test0221{
    //在数组中找到出现次数大于一半的数
    public int MoreThanHalfNum_Solution(int [] array){
        Arrays.sort(array);
        int count=0;
        int length=array.length;
        for(int i=0;i<length;i++){
            if(array[i]==array[length/2]){
                count++;
            }
        }
        if(count>length/2){
            return array[length/2];
        }else{
            return 0;
        }
    }
}
