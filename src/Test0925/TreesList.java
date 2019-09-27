package Test0925;

import java.util.ArrayList;
import java.util.List;

public class TreesList {
    private static List<Integer> list=new ArrayList<>();
    //利用泛型写递归先序遍历
    public static void preorder(Node root){
        if(root==null){
            return;
        }
        list.add(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    public static List<Integer> preorderTraver(Node root){
        List<Integer> list=new ArrayList<>();
        preorder(root);
        return list;
    }
    //利用泛型写递归中序遍历
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.value);
        inorder(root.right);
    }
    public static List<Integer> inorderTraver(Node root){
        List<Integer> list=new ArrayList<>();
        inorder(root);
        return list;
    }
    //利用泛型写递归后序遍历
    public static void lastorder(Node root){
        if(root==null){
            return;
        }
        lastorder(root.left);
        lastorder(root.right);
        list.add(root.value);
    }
    public static List<Integer> lastorderTraver(Node root){
        List<Integer> list=new ArrayList<>();
        lastorder(root);
        return list;
    }
}


