package code_practice.day_11;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author guoyao
 * @create 2020/3/29
 */
public class Test3 {
    //二叉树的层次遍历
    public void leverOrder(Node root){
        if(root==null){
            return;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node front=queue.remove();
            System.out.println(front.value);
            if(front.left!=null) {
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
    }
}
