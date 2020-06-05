package code_practice.day_19;

import Test0824.Tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author guoyao
 * @create 2020/6/4
 */
public class Test2 {
    //从上到下打印二叉树
    public int[] levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null){
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode cur = queue.remove();
            list.add(cur.val);
            if(cur.left != null){
                queue.add(cur.left);
            }
            if(cur.right != null){
                queue.add(cur.right);
            }
        }
        int [] array = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            array[i] = list.get(i);
        }
        return array;
    }

    //从上到下打印二叉树
    //请实现一个函数按照之字形顺序打印二叉树，
    // 即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，
    // 第三行再按照从左到右的顺序打印，其他行以此类推。

    //方法：层次遍历+双端队列
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int count = queue.size();
            LinkedList<Integer> res = new LinkedList<>();
            for(int i = 0; i<count;i++){
                TreeNode node  = queue.poll();
               if(list.size() %2 == 0){
                   res.addLast(node.val);
               }else{
                   res.addFirst(node.val);
               }
               if(node.left != null){
                   queue.add(node.left);
               }
               if(node.right!=null){
                   queue.add(node.right);
               }
            }
            list.add(res);
        }
        return list;
    }

    //从上到下按层打印二叉树，
    // 同一层的节点按从左到右的顺序打印，每一层打印到一行。
    public List<List<Integer>> levelOrder2(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        if(root != null){
            queue.add(root);
        }
        while(!queue.isEmpty()){

            List<Integer> arrayList = new ArrayList<>();
            for(int i = 0; i<queue.size(); i++){
                TreeNode node = queue.poll();
                arrayList.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            list.add(arrayList);
        }
        return  list;
    }
    public static void main(String[] args) {

    }
}
