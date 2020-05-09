package code_practice.day_16;

import java.util.ArrayList;

/**
 * @author guoyao
 * @create 2020/5/9
 */

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) {
        val = x;
    }
}
public class Test5 {

    //二叉搜索树的最近公共祖先
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){

        if(root==null){
            return null;
        }
        if(root.val>p.val&&root.val>q.val){
            root=lowestCommonAncestor(root.left,p,q);
        }
        if(root.val<p.val&&root.val<q.val){
            root=lowestCommonAncestor(root.right,p,q);
        }
        return root;
    }

    //二叉搜索树的第K大结点，法1

    ArrayList<Integer> list=new ArrayList<>();
    public int kthLargest1(TreeNode root, int k){
        middle(root);
        return list.get(list.size()-k);
    }

    public void middle(TreeNode root){

        if(root==null){
            return ;
        }
        if(root.left!=null){
            middle(root.left);
        }
        list.add(root.val);
        if(root.right!=null){
            middle(root.right);
        }
    }

    //二叉搜索树的第K大结点，法2
    int count=0,result=0;
    public int kthLargest2(TreeNode root, int k){
        search(root,k);
        return result;
    }

    public void search(TreeNode root,int k){
        if(root==null){
            return;
        }
        if(root.right!=null){
            search(root.right,k);
        }
        if(++count==k){
            result=root.val;
        }
        if(root.left!=null){
            search(root.left,k);
        }
    }

}
