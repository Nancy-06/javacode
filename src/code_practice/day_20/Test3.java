package code_practice.day_20;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author guoyao
 * @create 2020/6/15
 */
 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
 }

public class Test3 {

     // 二叉树的层平均值
    public List<Double> averageOfLevels(TreeNode root) {
        if(root == null){
            return null;
        }
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            long sum = 0;
            int count = 0;
            Queue<TreeNode> temp = new LinkedList<>();
            while(!queue.isEmpty()){
                TreeNode node = queue.poll();
                sum += node.val;
                count++;
                if(node.left != null){
                    temp.add(node.left);
                }
                if(node.right != null){
                    temp.add(node.right);
                }
            }
            queue = temp;
            list.add(sum*1.0 / count);
        }
        return list;
    }

    // 二叉树的层次遍历
    public List<Integer> level(TreeNode root){
        if(root == null){
            return null;
        }
        List<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode node  = queue.poll();
            list.add(node.val);
            if (node.left != null) {
                queue.add(node.left);
            }
            if(node.right != null){
                queue.add(node.right);
            }
        }
        return list;
    }
    // 二叉树的层次遍历2
    public List<List<Integer>> levelOrderBottom(TreeNode root) {


        LinkedList<List<Integer>> list = new LinkedList<>();
        if(root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int length = queue.size();
            LinkedList<Integer> tempList= new LinkedList<>();
            for(int i = 0; i < length;i++){

                TreeNode node = queue.poll();
                tempList.add(node.val);
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }
            list.addFirst(tempList);
        }
        return list;
    }
}
