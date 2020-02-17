package likou_nowcoder_test;

import Test0824.Tree;

/**
 * @author guoyao
 * @create 2020/2/17
 */
public class Test0217 {

    //力扣：二叉树的深度
    public int maxDepth(TreeNode root) {
       if(root==null){
           return 0;
       }
       int left=maxDepth(root.left);
       int right=maxDepth(root.right);
       int depth=Math.max(left,right)+1;
       return depth;
    }

    //6和9组成的最大数字
    public int maximum69Number (int num) {
        StringBuffer str=new StringBuffer(String.valueOf(num));
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='6'){
                str.setCharAt(i,'9');
                break;
            }
        }
        int nums=Integer.parseInt(str.toString());
        return nums;
    }

    //二叉树的镜像
    public TreeNode mirrorTree(TreeNode root) {
        if(root==null){
            return null;
        }
        TreeNode leftNode=root.left;
        root.left=mirrorTree(root.right);
        root.right=mirrorTree(leftNode);
        return root;
    }
}
