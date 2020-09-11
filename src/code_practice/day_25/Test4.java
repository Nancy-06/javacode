package code_practice.day_25;

/**
 * @author guoyao
 * @create 2020/9/11
 */
public class Test4 {
    //找出数组中第二大的数组，只需一次遍历
    public static int result(int [] array){
        int max = array[0];
        int sec = array[0];
        for(int i = 1; i < array.length; i++){
            if(max > array[i]){
                sec = max;
                max = array[i];
            }else if(array[i] > sec || i == 1){
                sec = array[i];
            }
        }
        return sec;
    }

}
