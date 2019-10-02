package Test0927;

import java.util.*;

public class Trees {
    //二叉树的非递归后序遍历
    public static void postorder(Node root){
        Stack<Node> stack=new Stack<>();
        Node cur=root;
        Node last=null;
        while(!stack.isEmpty()||cur!=null){
            while(cur!=null){
                stack.push(cur);
                cur=cur.left;
            }
            Node top=stack.peek();
            if(top.right==null||top.right==last){
                stack.pop();
                System.out.println(top.value);
                last=top;
            }
            else{
                cur=top.right;
            }
        }
    }
    //二叉树的层序遍历
    public static void levelorder(Node root){
        Queue<Node> queue=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            Node front=queue.poll();
            System.out.println(front.value);
            if(front.left!=null){
                queue.add(front.left);
            }
            if(front.right!=null){
                queue.add(front.right);
            }
        }
    }
    //比较两个二叉树是否相等
    public static boolean isSameTree(Node p,Node q){
        if(p==null&&q==null){
            return true;
        }
        if(p==null||q==null){
            return false;
        }
        return p.value==q.value&&isSameTree(p.left,q.left)&&isSameTree(p.right,q.right);
    }
}
