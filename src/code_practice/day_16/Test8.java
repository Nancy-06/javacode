package code_practice.day_16;

/**
 * @author guoyao
 * @create 2020/5/11
 */
public class Test8 {

    //二维数组中的查找
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int i=matrix.length-1;
        int j=0;
        while(i>=0&&j<matrix[0].length){
            if(matrix[i][j]>target){
                i--;
            }
            else if(matrix[i][j]<target){
                j++;
            }
            else{
                return true;
            }
        }
        return false;
    }

    //二进制中1的个数
    public int hammingWeight(int n) {
        //方法1:利用Integer中的方法
//        return Integer.bitCount(n);
        //方法2：最后一位与1进行与运算
        int count=0;
        while(n!=0){
            if((n & 1)==1){
                count++;
            }
            n>>>=1;
        }
        return count;
    }

}
