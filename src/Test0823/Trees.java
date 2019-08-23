package Test0823;

import java.util.ArrayList;
import java.util.List;

public class Trees {
    public static Node buildTrue(){
        Node n1=new Node('A');
        Node n2=new Node('B');
        Node n3=new Node('C');
        Node n4=new Node('D');
        Node n5=new Node('E');
        Node n6=new Node('F');
        Node n7=new Node('G');
        Node n8=new Node('H');
        n1.left=n2;
        n1.right=n3;
        n2.left=n4;

        n2.right=n5;
        n3.left=n6;
        n3.right=n7;
        n5.right=n8;
        return n1;
    }

    public static List<Character> preorder(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Character> list=new ArrayList<>();
        List<Character> leftOrder=preorder(root.left);
        List<Character> rightOrder=preorder(root.right);
        list.add(root.value);
        list.addAll(leftOrder);
        list.addAll(rightOrder);
        return list;
    }
    //前序遍历
    public static void preOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.value);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    //中序遍历
    public static List<Character> inorder(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Character> list=new ArrayList<>();
        List<Character> leftOrder=inorder(root.left);
        List<Character> rightOrder=inorder(root.right);
        list.addAll(leftOrder);
        list.add(root.value);
        list.addAll(rightOrder);
        return list;
    }

    public static void inOrderTraversal(Node root){
        if(root==null){
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.value);
        inOrderTraversal(root.right);
    }
    //后序遍历
    public static List<Character> postorder(Node root){
        if(root==null){
            return new ArrayList<>();
        }
        List<Character> list=new ArrayList<>();
        List<Character> leftOrder=postorder(root.left);
        List<Character> rightOrder=postorder(root.right);
        list.addAll(leftOrder);
        list.addAll(rightOrder);
        list.add(root.value);
        return list;
    }

    public static void postOrderTraversal(Node root){
        if(root==null){
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.value);
    }

    public static void main(String[] args) {
        Node root=buildTrue();
        System.out.print("先序遍历：");
        preOrderTraversal(root);
        System.out.println();
        System.out.println(preorder(root));
        System.out.print("中序遍历：");
        inOrderTraversal(root);
        System.out.println();
        System.out.println(inorder(root));
        System.out.print("后序遍历：");
        postOrderTraversal(root);
        System.out.println();
        System.out.println(postorder(root));
    }
}
