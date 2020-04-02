package code_practice.day_10;

/**
 * @author guoyao
 * @create 2020/3/28
 */
//二叉搜索树的后序遍历序列
public class Test6 {
    public boolean VerifySquenceOfBST(int [] sequence){
        if(sequence==null||sequence.length==0){
            return false;
        }
        return verify(sequence,0,sequence.length-1);
    }

    private boolean verify(int[] sequence, int low, int high) {
        if(low>=high){
            return true;
        }
        int i;
        int key=sequence[high];
        for(i=0;i<high;i++){
            if(sequence[i]>key){
                break;
            }
        }
        for(int j=i;j<high;j++){
            if(sequence[i]<key){
                return false;
            }
        }
        return verify(sequence,low,i-1)&&verify(sequence,i,high-1);
    }
}
