package code_practice.trees;

/**
 * @author guoyao
 * @create 2020/7/4
 */
public class Test1 {

    //寻找二叉搜索树的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        if(root.val > p.val && root.val > q.val){
            return lowestCommonAncestor(root.left, p, q);
        }
        if(root.val < p.val && root.val < q.val){
            return lowestCommonAncestor(root.right, p, q);
        }
        return root;
    }

    //寻找二叉树的最近公共祖先（不一定是二叉搜索树）
    public TreeNode lowestCommonAncestor1(TreeNode root, TreeNode p, TreeNode q) {
        if(root == null){
            return null;
        }
        TreeNode left = lowestCommonAncestor1(root.left, p, q);
        TreeNode right = lowestCommonAncestor1(root.right, p, q);
        if(root == p || root == q){
            return root;
        }
        else if(left != null && right != null){
            return root;
        }
        else if(left != null){
            return left;
        }
        else{
            return right;
        }
    }
}
