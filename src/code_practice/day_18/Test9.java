package code_practice.day_18;

/**
 * @author guoyao
 * @create 2020/6/3
 */
public class Test9 {
    //剪绳子
    public int cuttingRope(int n) {
        if( n ==1 || n == 2){
            return 1;
        }
        if(n== 3){
            return 2;
        }
        int sum = 1;
        while(n > 4){
            sum *= 3;
            n -= 3;
        }
        return sum*n;
    }

    //二叉搜索树的后续遍历序列
    public boolean verifyPostorder(int[] postorder) {
        return verify(postorder,0,postorder.length-1);
    }

    private boolean verify(int[] postorder, int begin, int end) {
        //如果还剩一两个结点，就是搜索树
        if((end - begin)<=1){
            return true;
        }
        //split表示第一个大于根节点的数的位置，一开始要赋值为end;
        //因为有一种情况为只有左子树，这时无法找到第一个大于根节点的数
        int split = end;
        for(int i = 0; i < end; i++){
            if(postorder[i] > postorder[end]){
                split = i;
                break;
            }
        }
        //看左子树是不是都小于root(后序遍历时，根节点在最后一个)
        for(int i = begin; i<split; i++){
            if(postorder[i] > postorder[end]){
                return false;
            }
        }
        for(int i = split; i<end; i++){
            if(postorder[i] < postorder [end]){
                return false;
            }
        }
        return verify(postorder,begin,split-1) && verify(postorder,split,end-1);
    }

}
