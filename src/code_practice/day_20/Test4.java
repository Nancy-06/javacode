package code_practice.day_20;

import java.lang.reflect.Array;
import java.util.*;

/**
 * @author guoyao
 * @create 2020/6/16
 */
public class Test4 {


    // 两棵二叉树中的所有元素并进行排列

    public List<Integer> list ;
    public List<Integer> getAllElements(TreeNode root1, TreeNode root2) {

        list = new ArrayList<>();
        dfs(root1);
        dfs(root2);
        Collections.sort(list);
        return list;

    }

    public void dfs(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }

    public PriorityQueue<Integer> priorityQueue;
    public void dfs1(TreeNode root){
        if(root == null){
            return;
        }
        priorityQueue.offer(root.val);
        dfs(root.left);
        dfs(root.right);
    }
    public List<Integer> getAllElements2(TreeNode root1, TreeNode root2) {
        priorityQueue = new PriorityQueue<>();
        dfs1(root1);
        dfs1(root2);
        List<Integer> result = new ArrayList<>();
        while(! priorityQueue.isEmpty()){
            result.add(priorityQueue.poll());
        }
        return result;
    }

}
