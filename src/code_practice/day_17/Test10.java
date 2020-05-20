package code_practice.day_17;

/**
 * @author guoyao
 * @create 2020/5/19
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
  }
public class Test10 {

    //对称的二叉树
    public boolean isSymmetric(TreeNode root){
        if(root==null){
            return true;
        }
        return judge(root.left,root.right);
    }

    private boolean judge(TreeNode root1, TreeNode root2) {
        if(root1==null&&root2==null){
            return true;
        }
        if(root1==null||root2==null){
            return false;
        }
        return root1.val==root2.val &&judge(root1.left,root2.left)
                &&judge(root1.right,root2.left);
    }

    //平衡二叉树
    public boolean isBalanced(TreeNode root){
        if(root==null){
            return true;
        }
        if(!isBalanced(root.left)||!isBalanced(root.right)){
            return false;
        }
        if(Math.abs(height(root.left)-height(root.right))<=1){
            return true;
        }
        return false;
    }
    //二叉树的高度
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left = height(root.left);
        int right = height(root.right);
        int max = Math.max(left,right)+1;
        return max;
    }
}
