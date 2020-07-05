package code_practice.trees;

/**
 * @author guoyao
 * @create 2020/7/4
 */
public class Test2 {

    //二叉树的高度

    public int treeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = treeHeight(root.left);
        int right = treeHeight(root.right);
        return Math.max(left, right)+1;
    }

    //判断是否为平衡二叉树
    public boolean isBanlanced(TreeNode root){
        if(root == null){
            return true;
        }
        boolean left = isBanlanced(root.left);
        if(!left){
            return false;
        }
        boolean right = isBanlanced(root.right);
        if(!right){
            return false;
        }
        int leftHeight = treeHeight(root.left);
        int rightHeight = treeHeight(root.right);
        int height = leftHeight - rightHeight;
        if(height == 0 || height == -1 || height == 1){
            return true;
        }
        return false;
    }
}
