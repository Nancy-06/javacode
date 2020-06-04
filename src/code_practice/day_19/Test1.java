package code_practice.day_19;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoyao
 * @create 2020/6/4
 */
 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }

public class Test1 {

     //二叉树中和为某一值的路径
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> list = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        if(root == null){
            return null;
        }
        dfs(root,sum);
        return res;
    }

    private void dfs(TreeNode root, int sum) {
        if(root == null){
            return;
        }
        list.add(root.val);
        sum-=root.val;
        if(sum == 0 && root.left == null && root.right == null){
            res.add(new ArrayList<>(list));
        }
        dfs(root.left,sum);
        dfs(root.right,sum);
        list.remove(list.size()-1);
    }


}
