package Test1228;

/**
 * @author guoyao
 * @create 2019/12/28
 */
//0-1背包问题，动态规划求解
public class Test1 {
    public int maxValue(int [] weight,int [] value,int capacity){
        int weightLen=weight.length;  //物品的个数
        int valueLen=capacity+1;
        int maxValue=0;
        int [][]v=new int[weightLen][valueLen];
        for(int i=0;i<weightLen;i++){
            for(int j=0;j<valueLen;j++){
                if(i==0){
                    v[i][j]=0;
                }
                else if(j==0){
                    v[i][j]=0;
                }
                else{
                    if(weight[i]>j){
                        v[i][j]=v[i-1][j];
                    }
                    else if(weight[i]<=j){
                        v[i][j]=Math.max(v[i-1][j],v[i-1][j-weight[i]]+value[i]);
                    }
                    maxValue=v[i][j];
                }
            }
        }
        return maxValue;
    }
}

