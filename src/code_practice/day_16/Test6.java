package code_practice.day_16;

import Test0824.Tree;

/**
 * @author guoyao
 * @create 2020/5/10
 */

public class Test6 {

    //二叉树的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
            return null;
        }
        if(p==root||q==root){
            return root;
        }
        TreeNode left=lowestCommonAncestor(root.left,p,q);
        TreeNode right=lowestCommonAncestor(root.right,p,q);
        if(left!=null&&right!=null){
            return root;
        }
        if(left==null){
            return right;
        }
        if(right==null){
            return left;
        }
        return null;
    }

    //二叉树的镜像
    public TreeNode mirrorTree(TreeNode root){
        if(root==null){
            return null;
        }
        TreeNode left=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(left);
        return root;
    }
}
