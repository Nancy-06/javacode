package code_practice.day_15;

/**
 * @author guoyao
 * @create 2020/5/4
 */

import java.util.Arrays;

//顺时针打印矩阵
public class Test12 {

    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        int []array=new int[n*m];
        if(mat==null){
            return array;
        }
        int i=0;
        int startX=0,startY=0,endX=m-1,endY=n-1;
        while(startX<=endX&&startY<=endY){

            //剩下一列
            if(startX==endX) {
                for (int j = startY; j <= endY; j++) {
                    array[i++] = mat[j][startX];
                    break;
                }
            }
            //剩下一行
            if(startY==endY) {
                for (int j = startX; j <= endX; j++) {
                    array[i++] = mat[startY][j];
                    break;
                }
            }
            //从左到右上边一行（除了右上角那一个数）
            for(int j=startX;j<endX;j++){
                array[i++]=mat[startY][j];
            }
            //从上到下右边一列（除了右下角那一个数）
            for(int j=startY;j<endY;j++){
                array[i++]=mat[j][endX];
            }

            //从右到左底下一列（除了左下角那一个数）
            for(int j=endX;j>startX;j--){
                array[i++]=mat[endY][j];
            }
            //从下到上左边一列（除了左上角那一个数）
            for(int j=endY;j>startY;j--){
                array[i++]=mat[j][startX];
            }
            startX++;
            startY++;
            endX--;
            endY--;
        }
        return array;
    }

    public static void main(String[] args) {
        int [] []res={{1,2},{3,4}};

        int [] arr=clockwisePrint(res,2,2);
        System.out.println(Arrays.toString(arr));
    }
}

