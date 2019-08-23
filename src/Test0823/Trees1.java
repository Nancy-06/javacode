package Test0823;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Trees1 {
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
    private ArrayList<Character> list=new ArrayList<>();
    //先序遍历
    private void preorder(Node root){
        if(root==null){
            return;
        }
        list.add(root.value);
        preorder(root.left);
        preorder(root.right);
    }
    public List<Character> preOrderTraversal(Node root){
        list=new ArrayList<>();
        preorder(root);
        return list;
    }

    //中序遍历
    private void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        list.add(root.value);
        inorder(root.right);
    }
    public List<Character> inOrderTraversal(Node root){
        list=new ArrayList<>();
        inorder(root);
        return list;
    }

    //后序遍历
    public void postorder(Node root){
        if(root==null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        list.add(root.value);
    }
    public List<Character> postOrderTreversal(Node root){
        list=new ArrayList<>();
        postorder(root);
        return list;
    }

    public static void main(String[] args) {
        Trees1 trees=new Trees1();
        Node root=buildTrue();
        System.out.print("先序遍历");
        System.out.println(trees.preOrderTraversal(root));
        System.out.print("中序遍历");
        System.out.println(trees.inOrderTraversal(root));
        System.out.print("后序遍历");
        System.out.println(trees.postOrderTreversal(root));
    }

}
