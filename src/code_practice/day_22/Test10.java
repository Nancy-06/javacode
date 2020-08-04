package code_practice.day_22;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/8/2
 */
public class Test10 {

    //在数组中找，个数超过数组长度一半的那个数
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.println(result(array));
    }

    private static int result(int[] array) {
        Arrays.sort(array);
        int length = array.length;
        int count = 0;
        for(int i = 0; i < length; i++){
            if(array[i] == array[length/2]){
                count++;
            }
        }
        if(count > length/2){
            return array[length/2];
        }else{
            return -1;
        }
    }

}
