package code_practice.trees;

import java.util.Stack;

/**
 * @author guoyao
 * @create 2020/7/4
 */
public class Test3 {

    //先序遍历
    //递归
    public static void preOrderTravarsal1(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.val);
        preOrderTravarsal1(root.left);
        preOrderTravarsal1(root.right);
    }
    // 非递归
    public static void preOrderTravarsa12(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                System.out.println(cur.val);
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            cur = top.right;
        }
    }

    // 中序遍历（递归）
    public static void inOrderTravarsal1(TreeNode root){
        if(root == null){
            return;
        }
        inOrderTravarsal1(root.left);
        System.out.println(root.val);
        inOrderTravarsal1(root.right);
    }

    //中序遍历（非递归）
    public static void inOrderTravarsal2(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while(!stack.isEmpty() || cur != null){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.pop();
            System.out.println(top.val);
            cur = top.right;
        }
    }

    //后序遍历（递归）
    public static void postOrderTravarsal1(TreeNode root){
        if(root == null){
            return;
        }

        postOrderTravarsal1(root.left);
        postOrderTravarsal1(root.right);
        System.out.println(root.val);
    }

    //后序遍历（非递归）
    public static void postOrderTravarsal2(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        TreeNode last = null;
        while(!stack.isEmpty() || cur == null){
            while(cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode top = stack.peek();
            if(top.right == null || top.right == last){
                stack.pop();
                System.out.println(top.val);
                last = top;
            }
            else{
                cur = top.right;
            }
        }

    }

}
