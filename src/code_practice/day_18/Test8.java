package code_practice.day_18;

/**
 * @author guoyao
 * @create 2020/6/2
 */

//顺时针打印矩阵
public class Test8 {

    public int[] spiralOrder(int[][] matrix) {

        if(matrix.length == 0){
            return new int[0];
        }
        int maxRow = matrix.length, maxCol = matrix[0].length;
        int resLen = maxRow * maxCol;
        int [] res = new int[resLen];
        int resIndex = 0;
        //当前行，当前列
        int row = 0,col = 0;
        while(row <= maxRow && col <= maxCol){
            for(int i=col; i<maxCol; i++){
                res[resIndex++] = matrix[row][i];  //向右
                if(resIndex == resLen){          //已满，返回
                    return  res;
                }
            }
            for(int i = row+1; i < maxRow-1; i++){   //向下
                res[resIndex++] = matrix[i][maxCol-1];
                if(resIndex == resLen){          //已满，返回
                    return  res;
                }
            }
            for(int i= maxCol - 1; i > col; i--){        //向左
                res[resIndex++] = matrix[maxRow-1][i];
                if(resIndex == resLen){          //已满，返回
                    return  res;
                }
            }
            for(int i = maxRow - 1; i > row; i--){    //向上
                res[resIndex++] = matrix[i][col];
                if(resIndex == resLen){          //已满，返回
                    return  res;
                }
            }
            row++;
            col++;
            maxCol--;
            maxRow--;
        }
        return  res;
    }
}
