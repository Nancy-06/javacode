package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2020/1/28
 */
public class Test0128 {

    //力扣925：长按键入
    public static boolean isLongPressedName(String name, String typed) {
        if(name.length()>typed.length()){
            return false;
        }
        char [] ch1=name.toCharArray();
        char [] ch2=typed.toCharArray();
        int ch1Index=0;
        int ch2Index=0;
        while(ch1Index<ch1.length&&ch2Index<ch2.length){
            if(ch1[ch1Index]==ch2[ch2Index]){
                ch1Index++;
                ch2Index++;
            }
            else{
                ch2Index++;
            }

        }
        if(ch1Index==ch1.length){
            return true;
        }
        return false;
    }

    //力扣977：有序数组的平方

    public static int[] sortedSquares(int[] A) {
        int [] array=new int [A.length];
        for(int i=0;i<A.length;i++){
            array[i]=Math.abs(A[i])*Math.abs(A[i]);
        }
        Arrays.sort(array);
        return array;
    }
    public static void main(String[] args) {
        String name="alex";
        String typed="aaleex";
        System.out.println(isLongPressedName(name,typed));
        int [] A={3,4,-2,2,4,5};
        System.out.println(Arrays.toString(sortedSquares(A)));
    }
}
