package likou_nowcoder_test;

import java.util.Set;

/**
 * @author guoyao
 * @create 2019/12/10
 */

public class Test1210 {
    //字符串分割，动态规划
    public static boolean workBreak(String s,Set<String> dict){
        int len=s.length();
        boolean[] canBreak=new boolean[len+1];
        canBreak[0]=true;
        for(int i=1;i<=len;i++){
            for(int j=i-1;j>=0;j--){
                if(canBreak[j]){
                    if(dict.contains(s.substring(j,i))){
                        canBreak[i]=true;
                        break;
                    }
                }
            }
        }
        return canBreak[len];
    }
    

    //最小路径和,动态规划
    public static int minPathSum(int [][] grid){
        int row=grid.length;
        int col=grid[row].length;
        for(int i=0;i<row;i++){
            grid[i][0]=grid[i-1][0]+grid[i][0];
        }
        for(int j=0;j<col;j++){
            grid[0][j]=grid[0][j-1]+grid[0][j];
        }
        for(int i=1;i<row;i++){
            for(int j=1;j<col;j++){
          grid[i][j]=Math.min(grid[i-1][j],grid[i][j-1])+grid[i][j];
            }
        }
        return grid[row-1][col-1];
    }
}
