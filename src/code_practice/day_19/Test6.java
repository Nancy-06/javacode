package code_practice.day_19;

/**
 * @author guoyao
 * @create 2020/6/10
 */
public class Test6 {

    //礼物的最大价值
    //原地变化
    public int maxValue(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 1; i < row; i++){
            grid[i][0] += grid[i-1][0];
        }
        for (int j = 1; j < col; ++j){
            grid[0][j] += grid[0][j - 1];
        }

        for(int i = 1; i < row; i++){
            for(int j = 1; j < col; j++){
                grid[i][j] += Math.max(grid[i-1][j],grid[i][j-1]);
            }
        }
        return grid[row-1][col-1];
    }

    //利用转移方程
    public int maxValue2(int[][] grid){
        int m = grid.length;
        int n = grid[0].length;
        int  [] dps = new int[n+1];
        for(int i = 1; i <= m; i++){
            for(int j = 1; j <= n; j++){
                dps[j]= Math.max(dps[j],dps[j-1]) + grid[i-1][j-1];
            }
        }
        return dps[n];
    }
}
