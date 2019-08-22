package Test0821;

import java.util.ArrayList;
import java.util.Arrays;

//判断能否构成一个周长最大的三角形,如果可以返回周长，不可以返回0
public class Solution1 {
    public static boolean match(int x,int y,int z){
        if((x+y)>z&&(x+z)>y&&(y+z)>x){
            return true;
        }
        return false;
    }

    public static int largest(int [] array){
        Arrays.sort(array);
        int size=array.length;
        for(int i=size-1;i>1;i--){
            if(match(array[i],array[i-1],array[i-2])){
                int length=array[i]+array[i-1]+array[i-2];
                return length;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int [] array={3,2,3,4};
        System.out.println(largest(array));
    }

}

