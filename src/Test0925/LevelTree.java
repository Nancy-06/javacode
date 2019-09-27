package Test0925;


import java.util.*;

//二叉树的层次遍历
public class LevelTree {
    public static void levelOrder(Node root){
        if(root==null){
            return ;
        }
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        if(!queue.isEmpty()){
            Node front=queue.remove();
            System.out.println(front.value);
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
    }
}

