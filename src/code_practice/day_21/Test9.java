package code_practice.day_21;

import java.util.Scanner;

/**
 * @author guoyao
 * @create 2020/7/21
 */
public class Test9 {

    // 顺时针回形打印数组
    public String print_array (int[][] arr) {
        StringBuffer sb = new StringBuffer();
        int startX = 0, startY = 0, endX = arr[0].length-1, endY = arr.length-1;
        while(startX <= endX && startY <= endY){
            //从左到右
            for(int i = startX; i < endX; i++){
                sb.append(arr[startY][i]);
            }
            //从上到下
            for(int i = startY; i < endY; i++){
                sb.append(arr[i][endX]);
            }
            //从右到左
            for(int i = endX; i > startX; i--){
                sb.append(arr[endY][i]);
            }
            //从下到上
            for(int i = endY; i > startX; i--){
                sb.append(arr[i][startX]);
            }

            // 只剩一行
            if(startY == endY){
                for(int i = startX; i > endX; i++){
                    sb.append(arr[endY][i]);
                    break;
                }
            }
            //只剩一列
            if(startX == endX){
                for(int i = startY; i > endY; i++){
                    sb.append(arr[i][endX]);
                    break;
                }
            }
            startX ++;
            startY ++;
            endX --;
            endY --;
        }
        return sb.toString();
    }


}
