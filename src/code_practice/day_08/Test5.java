package code_practice.day_08;

/**
 * @author guoyao
 * @create 2020/3/20
 */

//数组中出现次数超过一半的数字
public class Test5 {
    public static int search(int [] array){
        int length=array.length;
        int count=0;
        for(int i=0;i<length;i++){
            if(array[i]==array[length/2]){
                count++;
            }
        }
        if(count>length/2){
            return array[length/2];
        }
        return 0;
    }
}
