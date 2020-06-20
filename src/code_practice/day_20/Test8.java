package code_practice.day_20;

/**
 * @author guoyao
 * @create 2020/6/19
 */
public class Test8 {

    //检查平衡性
    public boolean isBalanced(TreeNode root) {

        if(root == null){
            return true;
        }
        if(!isBalanced(root.left) || !isBalanced(root.right)){
            return false;
        }
        int cur = high(root.left) - high(root.right);
        if(cur == 0 || cur == 1 || cur == -1){
            return true;
        }
        return false;
    }

    public int high(TreeNode root){
        if(root == null){
            return 0;
        }
        int leftHigh = high(root.left);
        int rightHgh = high(root.right);
        return Math.max(leftHigh,rightHgh) + 1;
    }
}
