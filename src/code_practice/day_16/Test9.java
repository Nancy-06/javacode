package code_practice.day_16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author guoyao
 * @create 2020/5/12
 */

//从上到下打印二叉树（层次遍历）
public class Test9 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        LinkedList<List<Integer>> list=new LinkedList<>();
        Queue<TreeNode> queue=new LinkedList<>();
        if(root==null){
            return list;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            ArrayList<Integer> arrayList=new ArrayList<>();
            int count=queue.size();
            for(int i=0;i<count;i++){
                TreeNode node=queue.poll();
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
        return list;
    }
}
