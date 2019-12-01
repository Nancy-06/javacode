package likou_nowcoder_test;

import Test0825.Tree;

/**
 * @author guoyao
 * @create 2019/12/1
 */

//判断是否为平衡二叉树
public class Test1201 {

    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int left=height(root.left);
        int right=height(root.right);
        int height=Math.max(left,right)+1;
        return height;
    }

    public boolean isBalance(TreeNode root) {
        if(root==null){
            return true;
        }
        boolean leftNode=isBalance(root.left);
        if(!leftNode){
            return false;
        }
        boolean rightNode=isBalance(root.right);
        if(!rightNode){
            return false;
        }
        int left=height(root.left);
        int right=height(root.right);
        int h=Math.abs(left-right);
        if(h==0||h==1){
            return true;
        }
        return false;
    }
}
