package likou_nowcoder_test;

import java.util.Arrays;

/**
 * @author guoyao
 * @create 2019/10/25
 */
public class Test12 {

    //重建二叉树
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre.length==0){
            return null;
        }
        int rootValue=pre[0];
        int index= Arrays.binarySearch(in,rootValue);
        TreeNode root=new TreeNode(rootValue);
        int [] leftpre=Arrays.copyOfRange(pre,1,index+1);
        int [] leftin=Arrays.copyOfRange(in,0,index);
        TreeNode left=reConstructBinaryTree(leftpre,leftin);
        root.left=left;
        int [] rightpre=Arrays.copyOfRange(pre,index+1,pre.length);
        int [] rightin=Arrays.copyOfRange(in,index+1,in.length);
        TreeNode right=reConstructBinaryTree(rightpre,rightin);
        root.right=right;
        return root;
    }
}
