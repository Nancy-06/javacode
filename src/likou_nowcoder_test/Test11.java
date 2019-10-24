package likou_nowcoder_test;

/**
 * @author guoyao
 * @create 2019/10/24
 */


public class Test11 {
    //求二叉树的深度
    public int TreeDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        int depth=Math.max(left,right)+1;
        return depth;
    }
    //判断是否为平衡二叉树
    public boolean IsBalanced_Solution(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean leftBalance=IsBalanced_Solution(root.left);
        if(!leftBalance){
            return false;
        }
        boolean rightBalance=IsBalanced_Solution(root.right);
        if(!rightBalance){
            return false;
        }
        int left=TreeDepth(root.left);
        int right=TreeDepth(root.right);
        if(Math.abs(left-right)==1||Math.abs(left-right)==0){
            return true;
        }
        return false;
    }
}
