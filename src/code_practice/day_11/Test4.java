package code_practice.day_11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author guoyao
 * @create 2020/4/11
 */
//二叉树的层次遍历，自底向上打印
public class Test4 {
    public List<List<Integer>> levelderBottom(Node root){
        LinkedList<List<Integer>> result=new LinkedList<>();
        if(root==null){
            return result;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            List<Integer> oneLevel=new ArrayList<>();
            int count=queue.size();
            for(int i=0;i<count;i++){
                Node node=queue.poll();
                oneLevel.add(node.value);
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            //每次都往队头插
            result.addFirst(oneLevel);
        }
        return result;
    }
}
